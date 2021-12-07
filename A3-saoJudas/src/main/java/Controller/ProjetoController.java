/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Projeto;

/**
 *
 * @author diogo-pc
 */
public class ProjetoController {

    private String nomeProjeto;
    private String textProjeto;
    private int IDUsuario;
    private int IDProjeto;
    
    
    public ProjetoController(String nomeProjeto, String textProjeto, int IDUsuario) {
        this.nomeProjeto = nomeProjeto;
        this.textProjeto = textProjeto;
        this.IDUsuario = IDUsuario;
    }

    public ProjetoController(int IDUsuario) {
        this.IDUsuario = IDUsuario;
    }

    public int getIDProjeto() {
        return IDProjeto;
    }

    public void setIDProjeto(int IDProjeto) {
        this.IDProjeto = IDProjeto;
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


    public ArrayList<String> buscarProjetos() throws SQLException {
        Projeto projeto = new Projeto(this.IDUsuario);
        projeto.setNomeProjeto(this.getNomeProjeto());
        return projeto.buscarProjeto();
    }

    public ArrayList<String> buscarProjetosByNome() throws SQLException {
        Projeto projeto = new Projeto(this.IDUsuario);
        return projeto.buscarProjetoByNome();
    }

    public void salvarProjeto() throws SQLException {
        if (!this.nomeProjeto.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Projeto salvo!");
            Projeto projeto = new Projeto(this.nomeProjeto, this.textProjeto, this.IDUsuario);
            projeto.criarProjeto();
        }
    }

    public void updateProjeto() throws SQLException {
        Projeto projeto = new Projeto(IDUsuario);
        projeto.setNomeProjeto(getNomeProjeto());
        projeto.setTextProjeto(getTextProjeto());
        projeto.setIDProjeto(this.IDProjeto);
        projeto.updateProjeto();

    }

    public void deleteProjeto() throws SQLException {
        int deletarAConta = JOptionPane.showConfirmDialog(null, "Deseja deletar o seu Projeto ?");
        if (deletarAConta == 0) {

            Projeto projeto = new Projeto(IDUsuario);
            projeto.setIDProjeto(this.IDProjeto);
            projeto.deleteProjeto();
        }
    }

}
