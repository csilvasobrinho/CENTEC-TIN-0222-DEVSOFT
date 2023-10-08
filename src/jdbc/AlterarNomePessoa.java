package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class AlterarNomePessoa {
	public static void main(String[] args) throws SQLException{
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o código da pessoa: ");
		int codigo = entrada.nextInt();
		
		String selectSQL = "SELECT codigo, nome FROM pessoas WHERE codigo = ?";
		String updateSQL = "UPDATE pessoas SET nome = ? WHERE codigo = ?";
		
		Connection conexao = FabricaDeConexao.getConexao();
		PreparedStatement stmt = conexao.prepareStatement(selectSQL);
		stmt.setInt(1, codigo);
		ResultSet r = stmt.executeQuery();
		
		if(r.next()) {
			Pessoa p = new Pessoa(r.getInt(1), r.getString(2));
			
			System.out.println("O nome atual é: " + p.getNome());
			entrada.nextLine();
			System.out.println("\nInforme o novo nome: ");
			String novoNome = entrada.nextLine();
			
			stmt.close();
			
			stmt = conexao.prepareStatement(updateSQL);
			stmt.setString(1, novoNome);
			stmt.setInt(2, codigo);
			stmt.execute();
			
			System.out.println("\nAltaração efetivada!");
		}else {
			System.out.println("Pessoa não localizada no Banco de Dados.");
		}
		conexao.close();
		entrada.close();
	}
}
