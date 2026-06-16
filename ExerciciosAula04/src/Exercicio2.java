import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int num, pares = 0, impares = 0;
		
		
		for(int contador = 1; contador <= 10; contador++) {

		    System.out.printf("Digite o %dº número: ", contador);
		    num = leia.nextInt();

		    if(num % 2 == 0) {
		        pares++;
		    } else {
		        impares++;
		    }

		}
		
        System.out.printf("Total de números pares: %d%n", pares);
        System.out.printf("Total de números impares: %d%n", impares);
        
        
        leia.close();
        

	}

}
