package atividade05.questao01;

public class ContaBancaria {
	
	String conta;
	double saldo;
	
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
