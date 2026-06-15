package aula_03_condicionais;

import java.util.Scanner;

public class ContaBancaria {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		float saldo = 1000;
		int operacao;
		float valor;

		System.out.println("********************************************");
		System.out.println("                 OPERAÇÃO                   ");
		System.out.println("********************************************");
		System.out.println("1 - Saldo");
		System.out.println("2 - Saque");
		System.out.println("3 - Depósito");
		System.out.println("********************************************");

		System.out.print("Operação: ");
		operacao = leia.nextInt();

		switch (operacao) {

		case 1:
			System.out.println("Operação - Saldo");
			System.out.printf("Saldo: R$ %.2f", saldo);
			break;

		case 2:
			System.out.print("Valor do saque: R$ ");
			valor = leia.nextFloat();

			if (valor <= saldo) {
				saldo = saldo - valor;
				System.out.println("Operação - Saque");
				System.out.printf("Novo Saldo: R$ %.2f", saldo);
			} else {
				System.out.println("Operação - Saque");
				System.out.println("Saldo Insuficiente!");
			}
			break;

		case 3:
			System.out.print("Valor do depósito: R$ ");
			valor = leia.nextFloat();

			saldo = saldo + valor;

			System.out.println("Operação - Depósito");
			System.out.printf("Novo Saldo: R$ %.2f", saldo);
			break;

		default:
			System.out.println("Operação Inválida!");
		}

		leia.close();
	}
}