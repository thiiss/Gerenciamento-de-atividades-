/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import db.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author diogo-pc
 */
public class Requisito {

    private final Connection connection;

    public Requisito() throws SQLException {
        this.connection = new ConnectionFactory().obterConexao();
    }

    public void salvarRequisito(String funcionalidade, String modulo, String nomeRequisito, String textDescrucai, String fase, String estado, int prioridade, int complexidade, int IDProjeto, int IDUsuario) throws SQLException {
        String sqlInsert = "insert into A3SaoJudas.Requisito(fk_id_Projeto,fk_id_usuario,dataCriacao,nomeRequisito,moduloRequisito,funcionalidadeRequisito,faseRequisito,prioridadeRequisito,complexidadeRequisito,estadoRequisito,descricaoRequisito) values ((select id from A3SaoJudas.Projeto where id = ?),?, now(),?,?,?,?,?,?,?,?)";
        PreparedStatement stm = connection.prepareStatement(sqlInsert);
        stm.setInt(1, IDProjeto);
        stm.setInt(2, IDUsuario);
        stm.setString(3, nomeRequisito);
        stm.setString(4, modulo);
        stm.setString(5, funcionalidade);
        stm.setString(6, fase);
        stm.setInt(7, prioridade);
        stm.setInt(8, complexidade);
        stm.setString(9, estado);
        stm.setString(10, textDescrucai);
        stm.execute();
    }

    public ArrayList<String> buscarRequisito(int iDUsuario, int iDProjeto) throws SQLException {
        ArrayList<String> arryRequisito = new ArrayList<>();
        String sql = "select * from A3SaoJudas.Requisito where fk_id_Projeto = ? and fk_id_usuario = ? ";
        PreparedStatement stm = connection.prepareStatement(sql);
        stm.setInt(1, iDProjeto);
        stm.setInt(2,iDUsuario );
        stm.execute();
        
        ResultSet resultset = stm.getResultSet();
        System.out.println(resultset.next());
        while(resultset.next()){
            String bIDProjeto = resultset.getString("id");
            String DatePost = resultset.getDate("dataCriacao").toString();
            String bNomeProjeto = resultset.getString("nomeRequisito");
            String estadoRequisito = resultset.getString("estadoRequisito");
            String prioridadeRequisito = resultset.getString("prioridadeRequisito");
            String descricaoProjeto = resultset.getString("descricaoRequisito");

            arryRequisito.add(bIDProjeto);
            arryRequisito.add(DatePost);
            arryRequisito.add(bNomeProjeto);
            arryRequisito.add(estadoRequisito);
            arryRequisito.add(prioridadeRequisito);
            arryRequisito.add(descricaoProjeto);
        }

        return arryRequisito;
    }

}
