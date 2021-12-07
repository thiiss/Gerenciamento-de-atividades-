/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.sql.SQLException;
import java.util.ArrayList;
import model.Requisito;

/**
 *
 * @author diogo-pc
 */
public class RequisitoControlle {
    private String funcionalidade;
    private String modulo;
    private String nomeRequisito;
    private String textDesc;
    private String fase;
    private int prioridade;
    private String estado;
    private int complextidade;
    private int iDProjeto;
    private int iDUsuario;
   
    public RequisitoControlle(String funcionalidade, String modulo, String nomeRequisito, String textDescrucai, String fase, int prioridade, String estado, int complexidade, int IDProjeto, int IDUsuario) {
        this.funcionalidade = funcionalidade;
        this.modulo = modulo;
        this.nomeRequisito = nomeRequisito;
        this.textDesc = textDescrucai;
        this.fase = fase;
        this.prioridade = prioridade;
        this.estado = estado;
        this.complextidade = complexidade;
        this.iDProjeto = IDProjeto;
        this.iDUsuario = IDUsuario;
    } 

    public RequisitoControlle() {
       
    }

    public String getFuncionalidade() {
        return funcionalidade;
    }

    public void setFuncionalidade(String funcionalidade) {
        this.funcionalidade = funcionalidade;
    }

    public String getModulo() {
        return modulo;
    }

    public void setModulo(String modulo) {
        this.modulo = modulo;
    }

    public String getNomeRequisito() {
        return nomeRequisito;
    }

    public void setNomeRequisito(String nomeRequisito) {
        this.nomeRequisito = nomeRequisito;
    }

    public String getTextDesc() {
        return textDesc;
    }

    public void setTextDesc(String textDesc) {
        this.textDesc = textDesc;
    }

    public String getFase() {
        return fase;
    }

    public void setFase(String fase) {
        this.fase = fase;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getComplextidade() {
        return complextidade;
    }

    public void setComplextidade(int complextidade) {
        this.complextidade = complextidade;
    }

    public int getiDProjeto() {
        return iDProjeto;
    }

    public void setiDProjeto(int iDProjeto) {
        this.iDProjeto = iDProjeto;
    }

    public int getiDUsuario() {
        return iDUsuario;
    }

    public void setiDUsuario(int iDUsuario) {
        this.iDUsuario = iDUsuario;
    }
    
    public void salvarRequisito() throws SQLException{
        Requisito requisito = new Requisito();
        requisito.salvarRequisito(getFuncionalidade(), getModulo(), getNomeRequisito(),getTextDesc(), getFase(),  getEstado(),getPrioridade(), getComplextidade(), getiDProjeto(), getiDUsuario());
    
    }
    
    public ArrayList<String> buscarRequisito() throws SQLException{
        Requisito requisito = new Requisito();
        return requisito.buscarRequisito(getiDUsuario(),getiDProjeto());
    }
}

