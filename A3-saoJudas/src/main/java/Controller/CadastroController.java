package Controller;

import coma.arrozdoce.a3.saojudas.model.Usuario;
import coma.arrozdoce.a3.saojudas.view.Cadastro;
import java.sql.SQLException;

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
        

        Usuario novoUsuario = new Usuario(nomeCompleto,email,telefone,usuario,senha);
        try {
            novoUsuario.insert();
        } catch (SQLException ex) {
           
        }
    }
}
