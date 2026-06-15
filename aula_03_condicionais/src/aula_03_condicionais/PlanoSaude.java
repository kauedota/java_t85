package aula_03_condicionais;

import java.util.Scanner;

public class PlanoSaude {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		String nome;
		int idade;
		
		System.out.println("Digite seu nome: ");
		nome = leia.next();
		
		System.out.println("Digite sua idade: ");
		idade = leia.nextInt();
		
		System.out.printf("Nome %s, ", nome);
		
		if(idade >= 0 && idade <= 10) {
			System.out.print("A mensalidade do Plano é de R$ 100,00");
		} else if (idade >= 11 && idade <= 29) {
				System.out.print("A mensalidade do Plano é de R$ 200,00");
		} else if (idade >= 30 && idade <= 45) {
			System.out.print("A mensalidade do Plano é de R$ 300,00");
		} else if (idade >= 46 && idade <= 59) {
			System.out.print("A mensalidade do Plano é de R$ 500,00");
		} else if (idade >= 60 && idade <= 65) {
			System.out.print("A mensalidade do Plano é de R$ 600,00");
		} else {
			System.out.print("A mensalidade do Plano é de R$ 1000,00");
		}
		
		leia.close();

	}

}
