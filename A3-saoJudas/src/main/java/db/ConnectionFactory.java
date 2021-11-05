package db;
        
import io.github.cdimascio.dotenv.Dotenv;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
    Dotenv dotenv = Dotenv.load();
    private String usuario = dotenv.get("USUARIO");
    private String senha = dotenv.get("SENHA");
    private String host = dotenv.get("HOST");
    private String port = dotenv.get("PORT");
    private String bd = dotenv.get("DB");

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
