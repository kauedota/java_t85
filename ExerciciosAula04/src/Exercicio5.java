import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int numero, soma = 0;
		
		
        
        do {
        	System.out.print("Digite um número: ");
            numero = leia.nextInt();
            
            if (numero > 0) {
                soma += numero;
            }

        } while (numero != 0);
        	System.out.printf("a soma dos números positvos é %d", soma);
            
		
		leia.close();

	}

}
