package atividade05.questao01;

import java.util.Scanner;

public class TestarConta {
	public static void main(String[] args) {
		
		ContaBancaria cc = new ContaBancaria();
		
		Scanner lerValor = new Scanner(System.in);
		
		System.out.println("Operação: [1] = Saque;");
		System.out.println("Operação: [2] = Depósito;");
		
		lerValor.close();
	}
}