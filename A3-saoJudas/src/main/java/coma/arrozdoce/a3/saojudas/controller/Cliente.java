package coma.arrozdoce.a3.saojudas.controller;

/**
 *
 * @author diogo
 */
public class Cliente extends Usuario {
    
    private int keyUser;
    private String nomeCompleto;
    private String email;
    private int telefone;

    public Cliente(String nomeCompleto, String email, String usuario, char[] password, int telefone) {
        super(usuario, password);
        this.nomeCompleto = nomeCompleto;
        this.email = email;
        this.telefone = telefone;
    }
    
    
    
}
