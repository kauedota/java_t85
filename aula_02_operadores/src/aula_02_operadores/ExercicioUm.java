package aula_02_operadores;

import java.util.Scanner;

public class ExercicioUm {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		float salario, abono, novoSalario;
		
		System.out.print("Digite o Salário: ");
		salario = leia.nextFloat();
		
		System.out.print("Digite o Abono: ");
		abono = leia.nextFloat();
		
		novoSalario = salario + abono;
		
		System.out.printf("Seu novo Salário é: %.2f", novoSalario);
		
		
		leia.close();
		

	}

}
