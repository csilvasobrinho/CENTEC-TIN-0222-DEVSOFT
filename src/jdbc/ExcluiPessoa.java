package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ExcluiPessoa {
	public static void main(String[] args) throws SQLException {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Excluir que código: ");
		int codigo = entrada.nextInt();
		
		Connection conexao = FabricaDeConexao.getConexao();
		String sql = "DELETE FROM pessoas WHERE codigo = ?";
		
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setInt(1, codigo);
		
		if(stmt.executeUpdate() > 0) {
			System.out.println("Exclusão efetivada!");
		}else {
			System.out.println("Exclusão NÃO efetivada!");
		}
	}
}
