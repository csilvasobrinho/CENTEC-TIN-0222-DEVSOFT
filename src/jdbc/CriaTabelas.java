package jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CriaTabelas {
	public static void main(String[] args) throws SQLException {
		Connection conexao = FabricaDeConexao.getConexao();

        String sql = "CREATE TABLE IF NOT EXISTS veiculos ("
                + "codigo INT AUTO_INCREMENT PRIMARy KEY,"
                + "nome VARCHAR(80) NOT NULL" + ")";

        Statement stmt = conexao.createStatement();
        stmt.execute(sql);

        System.out.println("Tabela criada com sucesso!");
        conexao.close();
	}
}
