package aula_05_vetores;

import java.util.Scanner;

public class MatrizRegular {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int matrizInteiros[][] = {
									{10, 15, 20}, 
									{45, 55, 60}, 
									{75, 80, 85}
								};
		
		double matrizDouble[][] = new double[2][3];
			
		for (int linha = 0; linha < matrizInteiros.length; linha ++) {
			for (int coluna = 0; coluna < matrizInteiros[linha].length; coluna ++) {
				System.out.printf("matrizInteiros[%d][%d] = %d\n", linha, coluna, matrizInteiros[linha][coluna]);
			}
		}
		
		for (int linha = 0; linha < matrizDouble.length; linha ++) {
			for (int coluna = 0; coluna < matrizDouble[linha].length; coluna ++) {
				System.out.printf("Digite um número para a posição [%d][%d] =  ", linha, coluna);
				matrizDouble[linha][coluna] = leia.nextDouble();
			}
		}
		
// ele busca tudo que tem dentro da variavel MatrizDouble e coloca dentro da variavel linha e depois busca tudo q tem na linha e coloca dentro da variavel numero e depois imprime tudo que dentro da variavel numero		
		for (double linha[] : matrizDouble) {
			for (double numero : linha) {
				System.out.println(numero);
			}
			
			int vetor[] = {1, 5, 7, 9, 4};
			
// ele busca tudo que tem dentro da variavel vetor e coloca dentro da variavel numero e depois imprime tudo que tem dentro do numero
			for (int numero : vetor) {
				System.out.println(numero);
			}
			
			
		}
		
		leia.close();
	}

}
