package Controller;

import dao.ConnectionFactory;
import dao.UsuarioDao;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Usuario;
import view.Cadastro;

public class CadastroController {
    private Cadastro view;

    public CadastroController(Cadastro view) {
        this.view = view;
    }
    
    public void cadastraUsuario(){
        String nomeCompleto = view.getJTextFieldNomeCompletoForm().getText();
        String email = view.getJTextFieldEmailForm().getText();
        String telefone = view.getJTextFieldTelefoneForm().getText();
        String usuario = view.getJTextFieldUsuario().getText();
        String senha = view.getjPassword().getText();
        String confirmarsenha = view.getjPasswordConfirme().getText();
        
           Usuario novousuario = new Usuario(nomeCompleto,email,telefone,usuario,senha);
        try{
            
        Connection connection = new ConnectionFactory().obterConexao();        
        UsuarioDao usuariodao = new UsuarioDao(connection);
        usuariodao.insert(novousuario);
        
        JOptionPane.showMessageDialog(null, "Usuario salvo");
        
        }catch(SQLException e){
          e.printStackTrace();
    }                            
    }
}
