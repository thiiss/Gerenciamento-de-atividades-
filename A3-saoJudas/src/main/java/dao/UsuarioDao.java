package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
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

}
