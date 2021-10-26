/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coma.arrozdoce.a3.saojudas.controller;

/**
 *
 * @author diogo
 */
public class Usuario {
    
    private String usuario;
    private char[] password;

    public Usuario(String usuario,char[] password) {
        this.usuario= usuario;
        this.password = password;
    }
    
    private boolean passwordValido(char[] password){
        return false;
    }
    
    private boolean usuarioValido(String usuario){
        return false;
    }
    
    public boolean autenticaUsuario(String usuario, String password ){
        return false;
    }
    
}
