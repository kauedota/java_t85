import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int num1, num2;
		
		System.out.println("Digite o primeiro numero: ");
		num1 = leia.nextInt();
		
		System.out.println("Digite o segundo numero: ");
		num2 = leia.nextInt();
		
		if(num1 >= num2) {
			System.out.println("Intervalo inválido");
		} else
			System.out.println("No intervalo entre " + num1 + " e " + num2 + ":");
		
		for(int contador = num1; contador <= num2; contador++) {
			
			
			if(contador % 3 == 0 && contador % 5 == 0) 
			System.out.println(contador + " é múltiplo de 3 e 5");
			
		}	
		
		
		leia.close();

	}

}
