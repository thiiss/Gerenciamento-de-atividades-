package dao;
        
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    private String usuario = "root";
    private String senha = "root";
    private String host = "localhost";
    private String port = "3306";
    private String bd = "A3SaoJudas";

    public Connection obterConexao() throws SQLException {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/" + bd+"?userTimezone=true&serverTimezone=UTC", usuario, senha);
            return conn;
        } catch (SQLException err) {
            err.printStackTrace();
            return null;
        }
    }
}
