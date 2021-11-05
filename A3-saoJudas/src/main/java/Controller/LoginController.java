package Controller;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Usuario;
import view.TelaPrincipal;



public class LoginController{    
    private String usuario;
    private String senha;
    
    public LoginController(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
    }
    
    private boolean verificarUsuarioESenha() throws SQLException{
        Usuario usuarioLogin = new Usuario(usuario, senha);    
        boolean consultaUsuario = usuarioLogin.exiteUsuarioeSenha();
        return consultaUsuario ;
    }
    
    public void entrar() throws SQLException {
        if(verificarUsuarioESenha()){
            TelaPrincipal telaprincipal = new TelaPrincipal();
            telaprincipal.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(null, "Usuario ou Senha Inválido!!!");
        }       
    }
    
}
