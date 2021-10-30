package coma.arrozdoce.a3.saojudas.model;

import coma.arrozdoce.a3.saojudas.dao.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Usuario {
   private String nomeCompleto;
   private String email;
   private String telefone;
   private String usuario;
   private String senha;

    public Usuario(String nomeCompleto, String email, String telefone, String usuario, String senha) {
        this.nomeCompleto = nomeCompleto;
        this.email = email;
        this.telefone = telefone;
        this.usuario = usuario;
        this.senha = senha;
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

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
        public void insert() throws SQLException {
        String sqlInsert = "insert into usuario(nomeCompleto,email,telefone,usuario,senha) values (?,?,?,?,?)";
        ConnectionFactory conexao = new ConnectionFactory();

        try ( Connection conn = conexao.obterConexao()) {
            PreparedStatement stm = conn.prepareStatement(sqlInsert);
            stm.setString(1, getNomeCompleto());
            stm.setString(2, getEmail());
            stm.setString(3, getTelefone());
            stm.setString(4, getUsuario());
            stm.setString(5, getSenha());
            stm.execute();
        }catch (SQLException e){
            e.printStackTrace();
        }
   
}
}
