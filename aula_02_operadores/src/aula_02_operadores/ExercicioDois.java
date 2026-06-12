package aula_02_operadores;

import java.util.Scanner;

public class ExercicioDois {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		float nota1, nota2, nota3, nota4, mediaFinal;
		
		System.out.print("Nota do primeiro Bimestre: ");
		nota1 = leia.nextFloat();
		
		System.out.print("Nota do segundo Bimestre: ");
		nota2 = leia.nextFloat();
		
		System.out.print("Nota do terceiro Bimestre: ");
		nota3 = leia.nextFloat();
		
		System.out.print("Nota do quarto Bimestre: ");
		nota4 = leia.nextFloat();
		
		mediaFinal = nota1 + nota2 + nota3 + nota4;
		
		System.out.printf("Sua média final foi: %.1f", mediaFinal / 4);
		
		
		leia.close();
		
		

	}

}
