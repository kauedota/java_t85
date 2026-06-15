package aula_03_condicionais;

import java.util.Scanner;

public class ExercioUm {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int media;
		
		System.out.print("Digite o numero A: ");
		int numA = leia.nextInt();
		
		System.out.print("Digite o numero B: ");
		int numB = leia.nextInt();
		
		System.out.print("Digite o numero C: ");
		int numC = leia.nextInt();
		
		media = (numA + numB);
		
		if (media > numC) {
			System.out.println("A soma de A + B é Maior do que C");
		} else if (media < numC) {
			System.out.println("A soma de A + B é Menor do que C");
		} else
			System.out.println("A soma de A + B é Igual a C");
		
		leia.close();
		
	}

}
