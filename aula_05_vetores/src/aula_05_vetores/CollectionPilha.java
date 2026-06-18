package aula_05_vetores;

import java.util.ArrayDeque;
import java.util.Deque;

public class CollectionPilha {

	public static void main(String[] args) {
		
		Deque<String> pilha = new ArrayDeque<String>();
		
		
		// Coloca adiciona em ordem de trás para frente
		pilha.push("Azul");
		pilha.push("Verde");
		pilha.push("Amarelo");
		pilha.push("Branco");
		pilha.push("Laranja");
		
		// Remove o ultimo elemente
		pilha.pop();
		
		System.out.println("A cor Azul ainda está na fila? " + pilha.contains("Azul"));
		
		for(var cor : pilha) {
			System.out.println(cor);
		}
	}

}
