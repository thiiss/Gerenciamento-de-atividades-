package Controller;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Usuario;

public class CadastroController extends VerificacaoControlle{
    public CadastroController(String nomeCompleto, String email, String telefone, String usuario, String senha) {
        super(nomeCompleto, email, telefone, usuario, senha);
    }

    //Verificar se o email do usuairo esta cadastrado 
    public void cadastrarUsuario() throws SQLException {
        Usuario novoUsuario = new Usuario(getNomeCompleto(), getEmail(), getTelefone(), getUsuario(), getSenha());      
        if (verificarCadastroUsuario() && verificarCadastroEmail()) {
            novoUsuario.cadastrarUsuario();
            JOptionPane.showMessageDialog(null, "Usuario salvo");
        }else{
            JOptionPane.showMessageDialog(null, "Erro!");
        }
    }

}
