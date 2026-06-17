package exercicios_aula_05;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int vetor[] = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
		int numero;
		boolean encontrado = false;
		
		System.out.print("Digite o número que deseja localizar: ");
		numero = leia.nextInt();
		
		for(int posicao = 0; posicao < vetor.length; posicao++) {
			
			if (vetor[posicao] == numero) {
				System.out.printf("O número %d está na posição %d%n", numero, posicao);
				encontrado = true;
			}
			
		}
		
			if (!encontrado) {
				System.out.printf("O número %d não foi encontrado!", numero);
									
		}
		
		leia.close();
	}

}