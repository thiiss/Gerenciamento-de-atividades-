/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import db.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author diogo-pc
 */
public class Projeto {

    private final Connection connection;
    private String nomeProjeto;
    private String textProjeto;
    private int IDUsuario;

    public Projeto(String nomeProjeto, String textProjeto, int IDUsuario) throws SQLException {
        this.connection = new ConnectionFactory().obterConexao();
        this.nomeProjeto = nomeProjeto;
        this.textProjeto = textProjeto;
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
}
