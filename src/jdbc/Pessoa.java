package jdbc;

public class Pessoa {
	private int codigo;
	private String Nome;
	
	public Pessoa(int codigo, String nome) {
		super();
		this.codigo = codigo;
		Nome = nome;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}
	
}
