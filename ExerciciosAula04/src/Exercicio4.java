import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
			
			Scanner leia = new Scanner(System.in);
			
			int idade, genero = 0, profissao = 0, somaIdades = 0, totalRespostas = 0, homens = 0, naobinario = 0, backend = 0, frontend = 0;
			double mediaIdades = 0.0;
			char continua = 'S';
			
			while (continua == 'S') {

	            System.out.println("*********************************");
	            System.out.println("Pesquisa sobre Perfil dos Desenvolvedores");
	            System.out.println("*********************************");

	            System.out.print("Digite a sua idade: ");
	            idade = leia.nextInt();

	            do {
	                System.out.println("\nQual seu Gênero?");
	                System.out.println("1 - Mulher Cis");
	                System.out.println("2 - Homem Cis");
	                System.out.println("3 - Não Binário");
	                System.out.println("4 - Mulher Trans");
	                System.out.println("5 - Homem Trans");
	                System.out.println("6 - Outros");
	                System.out.print("Opção: ");

	                genero = leia.nextInt();

	                if (genero < 1 || genero > 6) {
	                    System.out.println("Opção inválida! Tente novamente.");
	                }

	            } while (genero < 1 || genero > 6);
	            
		         do {   
		        	 	System.out.println("\nQual sua profissão?");
		                System.out.println("1 - Backend");
		                System.out.println("2 - Frontend");
		                System.out.println("3 - Mobile");
		                System.out.println("4 - Fullstack");
		                System.out.print("Opção: ");

		                profissao = leia.nextInt();
		                
	            	if (profissao < 1 || profissao > 4) {
	                    System.out.println("Opção inválida! Tente novamente.");
	                }
	
	            } while (profissao < 1 || profissao > 4);
				
				/* Estatisticas*/
				
				//Total de pessoas que responderam a pesquisa
				totalRespostas ++;
				
				//Soma total das idades de todas as pessoas que responderam a pesquisa
				somaIdades += idade;
				
				//Total de Homens Cis e Trans maiores de 40 anos
				if (idade > 40 && (genero == 2 || genero == 5) && profissao == 3)
					homens ++;
				
				//Total de Homens Trans maiores de 40 anos
				if (idade < 30 && genero == 3 && profissao == 4)
					naobinario ++;
				
				//Total de desenvolvedoras Mulher Cis e Trans Frontend
				if (profissao == 2 && (genero == 1 || genero == 4))
					frontend ++;
				
				//Total de desenvolvedoras Backend
				if (profissao == 1)
					backend ++;
				
				
				
				do {
					System.out.println("Deseja Continuar? (S/N)");
					continua = leia.next().toUpperCase().charAt(0);
				}while(!(continua == 'S') && !(continua == 'N'));
				
			}
			
			mediaIdades = (double) somaIdades / totalRespostas;
			
			System.out.printf("Total de pessoas desenvolvedoras Backend %d%n", backend);
			System.out.printf("Total de Mulheres Cis e Trans desenvolvedoras Frontend: %d%n", frontend);
			System.out.printf("Total de Homens Cis e Trans desenvolvedoras Mobile maiores de 40 anos: %d%n", homens);
			System.out.printf("Total de Pessoas Não Binárias desenvolvedoras FullStack menores de 30 anos: %d%n", naobinario);
			System.out.printf("Numero total de pessoas que responderam á pesquisa: %d%n", totalRespostas);
			System.out.printf("Média das idades: %.2f%n", mediaIdades);
			
			leia.close();

		}

	}