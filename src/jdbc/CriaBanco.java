package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CriaBanco {
	public static void main(String[] args) throws SQLException{
		final String url = "jdbc:mysql://localhost";
        final String usuario = "root";
        final String senha = "12345678";
        
        Connection conexao = DriverManager.getConnection(url, usuario, senha);

        Statement stmt = conexao.createStatement();

        stmt.execute("CREATE DATABASE IF NOT EXISTS tin0222");

        System.out.println("Banco criado com sucesso!");

        conexao.close();
	}

}
