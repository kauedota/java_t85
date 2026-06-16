import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int idade, maiores = 0, menores = 0;
		
		System.out.print("Digite sua idade: ");
		idade = leia.nextInt();
		
		
		while(idade >= 0) {
			
			if(idade < 21)
				menores++;
				
			if(idade > 50)
				maiores++;
			
			System.out.print("Digite uma idade: ");
			idade = leia.nextInt();
		}
		
		System.out.printf("Total de pessoas menores de idade: %d%n", menores);
		System.out.printf("Total de pessoas maiores de idade: %d%n", maiores);
		
        
        leia.close();

	}

}