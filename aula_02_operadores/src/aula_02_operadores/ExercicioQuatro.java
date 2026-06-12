package aula_02_operadores;

import java.util.Scanner;

public class ExercicioQuatro {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		float num1, num2, num3, num4, calculo;
		
		System.out.print("Número um: ");
		num1 = leia.nextFloat();
		
		System.out.print("Número dois: ");
		num2 = leia.nextFloat();
		
		System.out.print("Número três: ");
		num3 = leia.nextFloat();
		
		System.out.print("Número quatro: ");
		num4 = leia.nextFloat();
		
		calculo = (num1 * num2) - (num3 * num4);
		
		System.out.printf("Calculo = %.1f", calculo);
		
		
		leia.close();

	}

}
