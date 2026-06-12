package aula_02_operadores;

import java.util.Scanner;

public class ExercicioTres {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		float salarioBruto, adicionalNoturno, horasExtras, descontos, salarioLiquido;
		
		System.out.print("Salário Bruto: ");
		salarioBruto = leia.nextFloat();
		
		System.out.print("Adicional Noturno: ");
		adicionalNoturno = leia.nextFloat();
		
		System.out.print("Horas Extras: ");
		horasExtras = leia.nextFloat();
		
		System.out.print("Descontos: ");
		descontos = leia.nextFloat();
		
		salarioLiquido = salarioBruto + adicionalNoturno;
		
		System.out.printf("Salário Líquido: %.2f", salarioLiquido + (horasExtras * 5) - descontos);
		
		
		leia.close();

	}

}
