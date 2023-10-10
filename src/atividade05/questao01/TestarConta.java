package atividade05.questao01;

import java.util.Scanner;

public class TestarConta {
	public static void main(String[] args) {
		
		double valor = 0;
		Scanner lerOpcao = new Scanner(System.in);
		Scanner lerValor = new Scanner(System.in);
		ContaBancaria c1 = new ContaBancaria();
		
		System.out.println("\n ==> CONTA: " + c1.getConta() + ";");
		System.out.println(" ==> SALDO ATUAL: " + c1.getSaldo() + ";");
		System.out.println("\n -: **OPERAÇÃO** :-\n[1] SAQUE;\n[2] DEPÓSITO;\n[3] EXTRATO.");
		int opcao = lerOpcao.nextInt();
		
		switch (opcao) {
		case 1: 
			System.out.printf("\n ==> VALOR DO SAQUE: ");
			valor = lerValor.nextDouble();
			c1.saque(valor);
			System.out.println("\n ==> SALDO PÓS SAQUE: " + c1.getSaldo());
			break;
		case 2: 
			System.out.printf("\n ==> VALOR DO DEPÓSITO: ");
			valor = lerValor.nextDouble();
			c1.deposito(valor);
			System.out.println("\n ==> SALDO PÓS DEPÓSITO: " + c1.getSaldo());
			break;
		case 3: 
			c1.extrato();;
			break;
		default:
			System.out.println("Opção não definida!");
		}
		
		lerValor.close();
	}
}