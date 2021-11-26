/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.sql.SQLException;
import java.util.ArrayList;
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

    public ProjetoController(int IDUsuario) {
        this.IDUsuario = IDUsuario;
    }
    
    public ArrayList<String>  buscarProjetos() throws SQLException{
        Projeto projeto = new Projeto(this.IDUsuario);
        return projeto.buscarProjeto();
    }
    
    public ArrayList<String>  buscarProjetosByNome() throws SQLException{
        Projeto projeto = new Projeto(this.IDUsuario);
        return projeto.buscarProjetoByNome();
    }
        
    public void salvarProjeto() throws SQLException{
        if(!this.nomeProjeto.isEmpty()){
            Projeto projeto = new Projeto(this.nomeProjeto, this.textProjeto, this.IDUsuario);
            projeto.criarProjeto();
        }
    }
}
