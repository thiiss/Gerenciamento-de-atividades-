/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coma.arrozdoce.a3.saojudas.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author diogo
 */
public class ConnectionFactory {

    private String usuario = "root";
    private String senha = "root";
    private String host = "localhost";
    private String port = "8080";
    private String bd = "A3SaoJudas";

    public Connection obterConexao() throws SQLException {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/" + bd, usuario, senha);
            return conn;
        } catch (SQLException err) {
            err.printStackTrace();
            return null;
        }
    }

}
