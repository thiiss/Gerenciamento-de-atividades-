package Controller;

import dao.ConnectionFactory;
import dao.UsuarioDao;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Usuario;
import view.Login;
import view.TelaPrincipal;

public class LoginController {    
    private Login view;

    public LoginController(Login view) {
        this.view = view;
    }

    public void entrar() throws SQLException {
        String usuario = view.getjTextFieldUsuarioLogin().getText();
        String senha = view.getjPasswordFieldSenhaLogin().getText();
        
        Usuario usuariologin = new Usuario(usuario, senha);
        
        Connection connection = new ConnectionFactory().obterConexao();        
        UsuarioDao usuariodao = new UsuarioDao(connection);
        
        boolean exite = usuariodao.exiteUsuarioeSenha(usuariologin);
        
        if(exite){
            TelaPrincipal telaprincipal = new TelaPrincipal();
            telaprincipal.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(null, "Usuario ou Senha Inválido!!!");
        }
        

    }
    
}
