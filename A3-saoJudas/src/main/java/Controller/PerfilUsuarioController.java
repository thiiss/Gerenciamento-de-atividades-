package Controller;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Usuario;

public class PerfilUsuarioController extends VerificacaoControlle {

    private String senhaNova;
    private Usuario usuairoLogado;

    public PerfilUsuarioController(Usuario usuarioLogado, String nomeCompleto, String email, String telefone, String usuario, String senhaAntiga, String senhaNova) {
        super(nomeCompleto, email, telefone, usuario, senhaAntiga);
        this.usuairoLogado = usuarioLogado;
        this.senhaNova = senhaNova;

    }

    public Usuario updateUsuario() throws SQLException {
        
        if (usuairoLogado.exiteUsuarioeSenha() && getSenha().equals(usuairoLogado.getSenha())) {
            usuairoLogado.setEmail(getEmail());
            usuairoLogado.setNomeCompleto(getNomeCompleto());
            usuairoLogado.setTelefone(getTelefone());
            usuairoLogado.setUsuario(getUsuario());
            if(!senhaNova.equals("")){ usuairoLogado.setSenha(senhaNova);}
            usuairoLogado.update();
            JOptionPane.showMessageDialog(null, "Usuario feito o update");
            return usuairoLogado;
        } else {

            JOptionPane.showMessageDialog(null, "Erro!");
        }
        return usuairoLogado;
    }

}
