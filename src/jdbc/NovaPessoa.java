package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class NovaPessoa {
	public static void main(String[] args) throws SQLException {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Nome: ");
		String nome = entrada.nextLine();
		
		Connection conexao = FabricaDeConexao.getConexao();
		
		String sql = "INSERT INTO pessoas (nome) VALUES (?)";
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setString(1, sql);
		
		stmt.execute();
		
		System.out.println("jdbc.Pessoa adicionada com sucesso!");
		
		entrada.close();
	}
}
