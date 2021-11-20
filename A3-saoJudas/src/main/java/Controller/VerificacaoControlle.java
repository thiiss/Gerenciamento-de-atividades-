/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.sql.SQLException;
import model.Usuario;

/**
 *
 * @author diogo-pc
 */
public class VerificacaoControlle {
    private String nomeCompleto;
    private String email;
    private String telefone;
    private String usuario;
    private String senha;

    public VerificacaoControlle(String nomeCompleto, String email, String telefone, String usuario, String senha) {
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

    public boolean verificarCadastroUsuario() throws SQLException {
        Usuario verificar = new Usuario();
        return !verificar.porUsuario(this.usuario);
    }

    public boolean verificarCadastroEmail() throws SQLException {
        Usuario verificar = new Usuario();
        return !verificar.porEmail(this.email);
    }
}
