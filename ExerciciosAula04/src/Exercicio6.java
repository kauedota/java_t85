import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int numero, soma = 0, contador = 0;
		double media;
		
		do {
        	System.out.print("Digite um número: ");
            numero = leia.nextInt();
            
            if (numero != 0 && numero % 3 == 0) {
                soma += numero;
                contador ++;
            }

        } while (numero != 0);
        	media = (double) soma / contador;
        	
        System.out.printf("A média de todos os números múltiplos de 3 é: %.1f ", media);
		
		
            
		
		leia.close();

	}

}
