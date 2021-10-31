package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import model.Usuario;

public class UsuarioDao {
    private final Connection connection;

    public UsuarioDao(Connection connection) {
        this.connection = connection;
    }
    public void insert(Usuario usuario) throws SQLException {
       
        String sqlInsert = "insert into usuario(nomeCompleto,email,telefone,usuario,senha) values (?,?,?,?,?)";
            PreparedStatement stm = connection.prepareStatement(sqlInsert);
            stm.setString(1, usuario.getNomeCompleto());
            stm.setString(2, usuario.getEmail());
            stm.setString(3, usuario.getTelefone());
            stm.setString(4, usuario.getUsuario());
            stm.setString(5, usuario.getSenha());
            stm.execute();
            connection.close();
    }
    public boolean exiteUsuarioeSenha(Usuario usuario) throws SQLException {
        String sql = "select * from usuario where Usuario = ? and senha = ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, usuario.getUsuario());
            stm.setString(2, usuario.getSenha());
            stm.execute();
        
        ResultSet resultset = stm.getResultSet();
        return resultset.next();
    }
    public ArrayList<Usuario> selectAll() throws SQLException{
        String sql = "select * from usuario";
        PreparedStatement stm = connection.prepareStatement(sql);
        
            return Pesquisa(stm);
    }

    private ArrayList<Usuario> Pesquisa(PreparedStatement stm) throws SQLException {
        ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
        
        stm.execute();
        ResultSet resultset = stm.getResultSet();
        
        while(resultset.next()){
            String nomeCompleto = resultset.getString("nomeCompleto");
            String email = resultset.getString("email");
            String telefone = resultset.getString("telefone");
            String usuario = resultset.getString("usuario");
            String senha = resultset.getString("senha");
            
            Usuario todosUsuarios = new Usuario(nomeCompleto, email, telefone, usuario, senha);
            usuarios.add(todosUsuarios);
        }
        return usuarios;
    }
    public Usuario porUsuario(Usuario usuario) throws SQLException{
        String sql = "select * from usuario where usuario = ?";
            PreparedStatement stm = connection.prepareStatement(sql);
            stm.setString(1, usuario.getUsuario());
            
            return Pesquisa(stm).get(0);
    }
}
