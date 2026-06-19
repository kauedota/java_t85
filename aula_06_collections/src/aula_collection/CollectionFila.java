package aula_05_vetores;

import java.util.LinkedList;
import java.util.Queue;

public class CollectionFila {

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<String>();
		
		// Adiciona em ordem de cima para baixo
		fila.add("Thiago");
		fila.add("Guilherme");
		fila.add("Kaue");
		fila.add("Sara");
		fila.add("Bella");
		
		// remove de cima para baixo
		fila.remove();
		
		// contains é saber se fulano está na fila
		System.out.println("A sara ainda está na fila? " + fila.contains("Thiago"));
		
		//pega o conteudo da fila e adiciona no cliente e depois imprime
		for(var cliente : fila) {
			System.out.println(cliente);
		}

	}

}
