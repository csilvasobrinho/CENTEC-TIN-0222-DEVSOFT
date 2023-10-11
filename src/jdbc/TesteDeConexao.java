package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TesteDeConexao {
	public static void main(String[] args) throws SQLException{
		//Constantes com informações de conexão ao MySQL
		final String url = "jdbc:mysql://localhost/pessoas";
		final String usuario = "root";
		final String senha = "12345678";
		
		//Criando o objeto de conexão chamado "conexao"
		Connection conexao = DriverManager.getConnection(url, usuario, senha);
		
		System.out.println("Conexao com MySQL efetivada!");
		conexao.close();
	}
}
