package coma.arrozdoce.a3.saojudas.controller;

import coma.arrozdoce.a3.saojudas.model.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Arrays;

/**
 *
 * @author diogo
 */
public class Cliente extends Usuario {

    private int keyUser;
    private String nomeCompleto;
    private String email;
    private String telefone;

    public Cliente(String nomeCompleto, String email, String usuario, String password, String telefone) {
        super(usuario, password);
        this.nomeCompleto = nomeCompleto;
        this.email = email;
        this.telefone = telefone;
    }

    public int getKeyUser() {
        return keyUser;
    }

    public void setKeyUser(int keyUser) {
        this.keyUser = keyUser;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void insert() throws SQLException {
        String sqlInsert = "insert into usuarios(nome, email, telefone, usuario, password) values (?,?,?,?,?)";
        ConnectionFactory conexao = new ConnectionFactory();

        try ( Connection conn = conexao.obterConexao()) {
            PreparedStatement stm = conn.prepareStatement(sqlInsert);
            stm.setString(1, getNomeCompleto());
            stm.setString(2, getEmail());
            stm.setString(3, getTelefone());
            stm.setString(4, getUsuario());
            stm.setString(5, getPassword());

        }
    }

}
