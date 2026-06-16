package aula_03_condicionais;

import java.util.Scanner;

public class NotaFinal {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
	float nota1, nota2, nota3, nota4, media;
	String nome;

	System.out.println("Digite seu nome: ");
	nome = leia.nextLine();
	
	System.out.println("Nota do primeiro bismetre: ");
	nota1 = leia.nextFloat();
	
	System.out.println("Nota do segundo bimestre: ");
	nota2 = leia.nextFloat();
	
	System.out.println("Nota do terceiro bismetre: ");
	nota3 = leia.nextFloat();
	
	System.out.println("Nota do quarto bismetre: ");
	nota4 = leia.nextFloat();
	
	media = (nota1 + nota2 + nota3 + nota4)/4;
	
	if (media >= 7) {
		System.out.printf("%s, você foi aprovado com média %.1f.\n", nome, media);
	} else if (media >= 5 && media <= 7)	{
		System.out.printf("%s, você está em recuperação com média %.1f.\n", nome, media);
	} else
		System.out.printf("%s, você foi reprovado com média %.1f.\n", nome, media);
	}

}
