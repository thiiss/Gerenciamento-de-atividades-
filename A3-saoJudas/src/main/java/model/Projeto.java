package model;

import db.ConnectionFactory;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author diogo-pc
 */
public class Projeto {

    private final Connection connection;
    private String nomeProjeto;
    private String textProjeto;
    private int IDUsuario;
    private String dataCriacaoProjeto;

    public String getDataCriacaoProjeto() {
        return dataCriacaoProjeto;
    }

    public void setDataCriacaoProjeto(String dataCriacaoProjeto) {
        this.dataCriacaoProjeto = dataCriacaoProjeto;
    }

    public Projeto(String nomeProjeto, String textProjeto, int IDUsuario) throws SQLException {
        this.connection = new ConnectionFactory().obterConexao();
        this.nomeProjeto = nomeProjeto;
        this.textProjeto = textProjeto;
        this.IDUsuario = IDUsuario;
    }

    public Projeto(int IDUsuario) throws SQLException {
        this.connection = new ConnectionFactory().obterConexao();
        this.IDUsuario = IDUsuario;
    }

    public String getNomeProjeto() {
        return nomeProjeto;
    }

    public void setNomeProjeto(String nomeProjeto) {
        this.nomeProjeto = nomeProjeto;
    }

    public String getTextProjeto() {
        return textProjeto;
    }

    public void setTextProjeto(String textProjeto) {
        this.textProjeto = textProjeto;
    }

    public int getIDUsuario() {
        return IDUsuario;
    }

    public void setIDUsuario(int IDUsuario) {
        this.IDUsuario = IDUsuario;
    }

    public void criarProjeto() throws SQLException {
        String sqlInsert = "insert into A3SaoJudas.Projeto(fk_id_usuario,dataCriacao,nomeProjeto,descricaoProjeto) values ((select id from A3SaoJudas.usuario where id = ?),now(), ?,?);";
        PreparedStatement stm = connection.prepareStatement(sqlInsert);
        stm.setInt(1, getIDUsuario());
        stm.setString(2, getNomeProjeto());
        stm.setString(3, getTextProjeto());
        stm.execute();
    }

    public ArrayList<String> buscarProjetoByNome() throws SQLException {
        ArrayList<String> projetos = new ArrayList<>();
        String sql = "select nomeProjeto from A3SaoJudas.Projeto where fk_id_usuario = ?  ";
        PreparedStatement stm = connection.prepareStatement(sql);
        stm.setInt(1, getIDUsuario());
        stm.execute();
        ResultSet resultset = stm.getResultSet();

        while (resultset.next()) {
            String nomeProjeto = resultset.getString("nomeProjeto");

            projetos.add(nomeProjeto);
        }

        return projetos;
    }

    public ArrayList<String> buscarProjeto() throws SQLException {
        ArrayList<String> projetos = new ArrayList<>();
        String sql = "select * from A3SaoJudas.Projeto where fk_id_usuario = ?  ";
        PreparedStatement stm = connection.prepareStatement(sql);
        stm.setInt(1, getIDUsuario());
        stm.execute();
        ResultSet resultset = stm.getResultSet();

        while (resultset.next()) {
            String nomeProjeto = resultset.getString("nomeProjeto");
            String descricaoProjeto = resultset.getString("descricaoProjeto");
            Date dataCriacao = resultset.getDate("dataCriacao");

            projetos.add(nomeProjeto);
            projetos.add(dataCriacao.toString());
            projetos.add(descricaoProjeto);
        }

        return projetos;
    }

}
