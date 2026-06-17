package exercicios_aula_05;


public class Exercicio2 {

	public static void main(String[] args) {
				
	
		int vetor[] = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6};
		int soma = 0;
		float media;
		
		
	System.out.print("Elementos nos indices impares: ");
	
	for (int posicao = 0; posicao < vetor.length; posicao++) {
	    if (posicao % 2 != 0) {
	        System.out.print(vetor[posicao] + " ");
	    }
	}

	System.out.print("\nElementos pares: ");

	for (int posicao = 0; posicao < vetor.length; posicao++) {
	    if (vetor[posicao] % 2 == 0) {
	        System.out.print(vetor[posicao] + " ");
	    }
	}
	
	for (int posicao = 0; posicao < vetor.length; posicao++) {
	    soma = soma + vetor[posicao];
	   }
			System.out.println("\nSoma: " + soma);
		
		media = (float) soma / vetor.length;
			
			System.out.printf("Média: %.2f",media);
	
	
}

}
