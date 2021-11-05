package Controller;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Usuario;

public class CadastroController {

    private String nomeCompleto;
    private String email;
    private String telefone;
    private String usuario;
    private String senha;

    public CadastroController(String nomeCompleto, String email, String telefone, String usuario, String senha) {
        this.nomeCompleto = nomeCompleto;
        this.email = email;
        this.telefone = telefone;
        this.usuario = usuario;
        this.senha = senha;
        
    }

    private boolean verificarCadastroUsuario() throws SQLException {
        Usuario verificar = new Usuario();
        return !verificar.porUsuario(this.usuario);
    }

    private boolean verificarCadastroEmail() throws SQLException {
        Usuario verificar = new Usuario();
        return !verificar.porEmail(this.email);
    }

    //Verificar se o email do usuairo esta cadastrado 
    public void cadastrarUsuario() throws SQLException {
        Usuario novoUsuario = new Usuario(this.nomeCompleto, this.email, this.telefone, this.usuario, this.senha);      
        if (verificarCadastroUsuario() && verificarCadastroEmail()) {
            novoUsuario.cadastrarUsuario();
            JOptionPane.showMessageDialog(null, "Usuario salvo");
        }else{
            JOptionPane.showMessageDialog(null, "Erro!");
        }
    }

}
