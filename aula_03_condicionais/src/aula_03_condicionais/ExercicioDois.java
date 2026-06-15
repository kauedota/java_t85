package aula_03_condicionais;

import java.util.Scanner;

public class ExercicioDois {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int numero = leia.nextInt();
		
		if (numero % 2 == 0) {
			System.out.printf("O %d é par e positivo!", numero);
		} else if (numero < 1) {
			System.out.printf("O %d é impar e negativo!", numero);
		} else if (numero <= 0) {
			System.out.printf("O %d é par e negativo!", numero);
		} else
			System.out.printf("O %d é impar é positivo!", numero);
		
		
		
		
		leia.close();

	}

}
