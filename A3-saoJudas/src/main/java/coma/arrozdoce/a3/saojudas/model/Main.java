/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coma.arrozdoce.a3.saojudas.model;

import coma.arrozdoce.a3.saojudas.view.Cadastro;
import coma.arrozdoce.a3.saojudas.view.Login;
import coma.arrozdoce.a3.saojudas.controller.Cliente;
import java.sql.SQLException;

/**
 *
 * @author diogo
 */


public class Main {

    public static void main(String[] args) throws SQLException {
//        Login tela = new Login();
//        tela.setVisible(true);
        char[] JavaCharArray = new char[5];
        JavaCharArray[0] = 'r';
        JavaCharArray[1] = 's';
        JavaCharArray[2] = 't';
        JavaCharArray[3] = 'u';
        
        Cliente diogo = new Cliente("Diogo Henrique Barbosa", "teste@diogo.com.br", "Legomen", "1234", "11940155071");
        diogo.insert();
        
    } 

    
}
