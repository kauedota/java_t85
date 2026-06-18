package aula_05_vetores;

import java.util.ArrayList;
import java.util.Comparator;

public class Collection {

	public static void main(String[] args) {
			
		
		//< > Esse simbolo com o nome integer, está dizendo que so aceita numeros int nesse array
		ArrayList<Integer> numeros = new ArrayList<Integer>();
		
		numeros.add(1);
		numeros.add(3);
		numeros.add(5);
		numeros.add(7);
		numeros.add(9);
		
		for(int numero : numeros) {
			System.out.println(numero);
		}
		
		System.out.println("O objeto que está presente no indice 1: " + numeros.get(1));
		System.out.println("O indice do objeto 7: " + numeros.indexOf(7));
		
		numeros.set(3, 10);
		
		for(int numero : numeros) {
			System.out.println(numero);
		}
		
		numeros.remove(0);
		
		for(int numero : numeros) {
			System.out.println(numero);
		}
		
		// Ordenar em ordem crescente
		numeros.sort(null);
		
		
		// Ordenar em ordem decrescente
		numeros.sort(Comparator.reverseOrder());
		
		

	}

}
