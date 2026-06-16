package aula_03_condicionais;

import java.util.Scanner;

public class CalculadoraExercicio {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		double numero1, numero2, resultado;
		int operacao;

		System.out.println("*** CALCULADORA BÁSICA ***");

		System.out.print("Digite o primeiro número: ");
		numero1 = leia.nextDouble();

		System.out.print("Digite o segundo número: ");
		numero2 = leia.nextDouble();

		System.out.println("\nEscolha a operação:");
		System.out.println("1 - Soma");
		System.out.println("2 - Subtração");
		System.out.println("3 - Multiplicação");
		System.out.println("4 - Divisão");

		System.out.print("Operação: ");
		operacao = leia.nextInt();

		switch (operacao) {

		case 1:
			resultado = numero1 + numero2;
			System.out.printf("Operação: Soma | Resultado: %.2f", resultado);
			break;

		case 2:
			resultado = numero1 - numero2;
			System.out.printf("Operação: Subtração | Resultado: %.2f", resultado);
			break;

		case 3:
			resultado = numero1 * numero2;
			System.out.printf("Operação: Multiplicação | Resultado: %.2f", resultado);
			break;

		case 4:
			if (numero2 != 0) {
				resultado = numero1 / numero2;
				System.out.printf("Operação: Divisão | Resultado: %.2f", resultado);
			} else {
				System.out.println("Erro: divisão por zero não é permitida!");
			}
			break;

		default:
			System.out.println("Erro: operação inválida!");
		}

		leia.close();
	}
}