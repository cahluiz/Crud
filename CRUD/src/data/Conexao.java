package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    private Connection conexao;
    public Connection getConexao() {
        return conexao;
    }
    public Conexao() throws ClassNotFoundException, SQLException{
        String url="";//endereço do servidor BD
        String driver=""; //como conectar (JDBC)
        Class.forName(driver);
        conexao = DriverManager.getConnection(url, "usuario", "senha");
    }
}
