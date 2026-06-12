package aula_02_operadores;

public class OperadoresAtribuicao {

	public static void main(String[] args) {
		
		int numero1 = 4;
		int numero2 = 4;
		int numero3 = 4;
		int numero4 = 4;
		
		System.out.println("Atribuicao com Soma: " + (numero1 += 2));
		System.out.println("Atribuicao com Subtração: " + (numero2 -= 2));
		System.out.println("Atribuição com Multiplicação: " + (numero3 *= 2));
		System.out.println("Atribuição com Divisão: " + (numero4 /= 2));
		System.out.println("Atribuição com Módulo: " + (numero3 %= 2));

	}

}
