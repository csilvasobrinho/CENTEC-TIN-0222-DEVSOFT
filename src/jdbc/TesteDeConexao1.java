package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TesteDeConexao1 {
	public static void main(String[] args) throws SQLException {
		//Constantes com informações de conexão ao MySQL
		final String url = "jdbc:mysql://localhost";
		final String usuario = "root";
		final String senha = "12345678";
		
		Connection conexao = DriverManager.getConnection(url, usuario, senha);
		
		System.out.println("Conexão efetivada com sucesso!");
		conexao.close();
	}

}
