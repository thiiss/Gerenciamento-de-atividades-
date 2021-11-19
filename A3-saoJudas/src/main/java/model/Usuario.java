package model;

import db.ConnectionFactory;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.Connection;

public class Usuario {

    private String nomeCompleto;
    private String email;
    private String telefone;
    private String usuario;
    private String senha;
    private final Connection connection;

    public Usuario(String nomeCompleto, String email, String telefone, String usuario, String senha) throws SQLException {
        this.connection = new ConnectionFactory().obterConexao();
        this.nomeCompleto = nomeCompleto;
        this.email = email;
        this.telefone = telefone;
        this.usuario = usuario;
        this.senha = senha;
    }

    public Usuario(String usuario, String senha) throws SQLException {
        this.connection = new ConnectionFactory().obterConexao();
        this.usuario = usuario;
        this.senha = senha;
    }

    public Usuario() throws SQLException {
        this.connection = new ConnectionFactory().obterConexao();
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void cadastrarUsuario() throws SQLException {
        String sqlInsert = "insert into A3SaoJudas.usuario(nomeCompleto,email,telefone,usuario,senha) values (?,?,?,?,?)";
        PreparedStatement stm = connection.prepareStatement(sqlInsert);
        stm.setString(1, this.getNomeCompleto());
        stm.setString(2, this.getEmail());
        stm.setString(3, this.getTelefone());
        stm.setString(4, this.getUsuario());
        stm.setString(5, this.getSenha());
        stm.execute();
    }

    private ResultSet sqlConsultaUsuarioESenha() throws SQLException {
        String sql = "select * from A3SaoJudas.usuario where usuario = ? and senha = ?";
        PreparedStatement stm = connection.prepareStatement(sql);
        stm.setString(1, this.getUsuario());
        stm.setString(2, this.getSenha());
        stm.execute();
        ResultSet sqlConsultaUsuarioESenha = stm.executeQuery();
        return sqlConsultaUsuarioESenha;
    }

    public boolean exiteUsuarioeSenha() throws SQLException {
        return sqlConsultaUsuarioESenha().next();
    }

    public void usuarioParamentro() throws SQLException {
        ResultSet resultSet = sqlConsultaUsuarioESenha();
        if (resultSet.first()) {

            setNomeCompleto(resultSet.getString("nomeCompleto"));
            setEmail(resultSet.getString("email"));
            setTelefone(resultSet.getString("telefone"));
            setUsuario(resultSet.getString("usuario"));
        }

    }

    public void update() throws SQLException {
        String sql = "update A3SaoJudas.usuario set nomeCompleto = ?, email = ?, telefone = ?, usuario = ?, senha = ?  where usuario = ? ";
        PreparedStatement stm = connection.prepareStatement(sql);
        stm.setString(1, this.getNomeCompleto());
        stm.setString(2, this.getEmail());
        stm.setString(3, this.getTelefone());
        stm.setString(4, this.getUsuario());
        stm.setString(5, this.getSenha());
        stm.setString(6, this.getUsuario());
        System.out.println("texto" + sql);
        stm.execute();
    }

    public void delete() throws SQLException {
        String sql = "delete from A3SaoJudas.usuario where usuario = ? ";
        PreparedStatement stm = connection.prepareStatement(sql);
        stm.setString(1, this.getUsuario());
        stm.execute();
    }

    public ArrayList<Usuario> selectAll() throws SQLException {
        String sql = "select * from A3SaoJudas.usuario";
        PreparedStatement stm = connection.prepareStatement(sql);
        return Pesquisa(stm);
    }

    private ArrayList<Usuario> Pesquisa(PreparedStatement stm) throws SQLException {
        ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
        stm.execute();
        ResultSet resultset = stm.getResultSet();
        while (resultset.next()) {
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

    public boolean porUsuario(String usuarioCadastro) throws SQLException {
        String sql = "select * from A3SaoJudas.usuario where usuario = ?";
        PreparedStatement stm = connection.prepareStatement(sql);
        stm.setString(1, usuarioCadastro);
        stm.execute();
        ResultSet consultaPorUsuario = stm.getResultSet();
        return consultaPorUsuario.next();
    }

    public boolean porEmail(String emailCadastro) throws SQLException {
        String sql = "select * from A3SaoJudas.usuario where email = ?";
        PreparedStatement stm = connection.prepareStatement(sql);
        stm.setString(1, emailCadastro);
        stm.execute();
        ResultSet consultaPorUsuario = stm.getResultSet();
        return consultaPorUsuario.next();
    }
}
