package atividade05.questao01;

import java.util.Scanner;

public class TestarConta {
	public static void main(String[] args) {
		
		Scanner lerValor = new Scanner(System.in);
		
		System.out.println("OPERAÇÕES:\n[1] = Saque;\n[2] = Depósito;\n[3] = Extrato.");
		int opcao = lerValor.nextInt();
		
		switch (opcao) {
		case 1: 
			ContaBancaria c1 = new ContaBancaria("102030-40", 1000);
			System.out.println(c1.setConta(null));
			System.out.println("Operação SAQUE em desenvovimento...");
			break;
		case 2: 
			System.out.println("Operação DEPÓSITO em desenvovimento...");
			break;
		case 3: 
			System.out.println("Operação EXTRATO em desenvovimento...");
			break;
		default:
			System.out.println("Opção não definida!");
		}
		
		lerValor.close();
	}
}