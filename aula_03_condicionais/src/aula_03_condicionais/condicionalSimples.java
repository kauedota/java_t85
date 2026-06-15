package aula_03_condicionais;

import java.util.Scanner;

public class condicionalSimples {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		int numero = leia.nextInt();
		
		if (numero > 10 && numero < 100) {
			System.out.println("o numero digitado é maior do que 10!");
		}

		System.out.println("****** FIM DO PROGRAMA ******");
		
		leia.close();
	}

}
