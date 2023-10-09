package atividade05.questao01;

public class ContaBancaria {
	
	private String conta = "102030-40";
	private double saldo = 1000;
	
	public ContaBancaria(String conta, double saldo) {
		super();
		this.conta = conta;
		this.saldo = saldo;
	}

	public String getConta() {
		return conta;
	}



	public void setConta(String conta) {
		this.conta = conta;
	}



	public double getSaldo() {
		return saldo;
	}



	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}



	public void extrato() {
		System.out.println(conta);
		System.out.println(saldo);
	}
	
	public double saque(double valor) {
		double novoSaldo = saldo - valor;
		return novoSaldo;
	}
	
	public double deposito(double valor) {
		double novoSaldo = saldo + valor;
		return novoSaldo;
	}
}
