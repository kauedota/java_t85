package aula_05_vetores;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CollectionSet {

	public static void main(String[] args) {
		
		Set<String> frutas = new HashSet<String>();
		
// Esse comando, faz ele adicionar mais de uma fruta de uma vez, mas tem que importar os arrays e adicionar o frutas.addAll(listaFrutas) para funcionar
		ArrayList<String> listaFrutas = new ArrayList<String>(Arrays.asList("Banana", "Pêra"));
		
		frutas.add("Abacate");
		frutas.add("Morango");
		frutas.add("Maça");
		frutas.add("Laranja");
		frutas.add("Abacate");
// addAll adiciona a lista com mais de 1 nome/frutas
		frutas.addAll(listaFrutas);
		
		
		for(String fruta : frutas) {
			System.out.println(fruta);
		}
		
		System.out.println("A fruta laranja está presente? " + frutas.contains("Laranja"));
		
		frutas.remove("Laranja");
		
		for(String fruta : frutas) {
			System.out.println(fruta);
		}

	}

}
