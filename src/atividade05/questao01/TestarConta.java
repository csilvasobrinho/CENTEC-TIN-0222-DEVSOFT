package atividade05.questao01;

import java.util.Scanner;

public class TestarConta {
	public static void main(String[] args) {
		
		Scanner lerOpcao = new Scanner(System.in);
		Scanner lerValor = new Scanner(System.in);
		ContaBancaria c1 = new ContaBancaria();
		
		System.out.println("\n ==> SALDO ATUAL: " + c1.getSaldo());
		System.out.println("\n -: **OPERAÇÃO** :-\n[1] SAQUE;\n[2] DEPÓSITO;\n[3] EXTRATO.");
		int opcao = lerOpcao.nextInt();
		
		switch (opcao) {
		case 1: 
			System.out.printf("\n ==> VALOR DO SAQUE: ");
			double valor = lerValor.nextDouble();
			c1.saque(valor);
			System.out.println("\n ==> SALDO PÓS SAQUE: " + c1.getSaldo());
						
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