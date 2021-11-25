/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.sql.SQLException;
import model.Projeto;

/**
 *
 * @author diogo-pc
 */
public class ProjetoController {
    
    private String nomeProjeto;
    private String textProjeto;
    private int IDUsuario;
  
        
    public ProjetoController(String nomeProjeto, String textProjeto, int IDUsuario) {
        this.nomeProjeto = nomeProjeto;
        this.textProjeto = textProjeto;
        this.IDUsuario = IDUsuario;
    }
        
    public void salvarProjeto() throws SQLException{
        if(!this.nomeProjeto.isEmpty()){
            Projeto projeto = new Projeto(nomeProjeto, textProjeto, IDUsuario);
            projeto.criarProjeto();
        }
    }
}
