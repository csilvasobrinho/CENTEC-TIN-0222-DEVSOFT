package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InserirDados {
	public static void main(String[] args) throws SQLException {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Nome: ");
		String nome = entrada.nextLine();
		
		Connection conexao = FabricaDeConexao.getConexao();
		String sql = "INSERT INTO pessoas (nome) VALUES (?)";
		
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setString(1, nome);
		
		stmt.execute();
		
		System.out.println("\nINSERT efetivado!");
		entrada.close();
	}
}
