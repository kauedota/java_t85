package aula_03_condicionais;

import java.util.Scanner;

public class AnaliseDeIdade {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		String nome;
		int idade;
		boolean autorizacao;

		System.out.print("Digite seu nome: ");
		nome = leia.next();

		System.out.print("Digite sua idade: ");
		idade = leia.nextInt();

		if (idade >= 18) {

			System.out.println("Acesso liberado para " + nome);

		} else {

			System.out.print("Possui autorização do responsável? (true/false): ");
			autorizacao = leia.nextBoolean();

		if (autorizacao) {
			System.out.println("Acesso liberado com autorização para " + nome);
		} else {
			System.out.println("Acesso negado para " + nome);
	}
}
		leia.close();
	}
}