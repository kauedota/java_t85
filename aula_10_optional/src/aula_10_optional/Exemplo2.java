package aula_10_optional;

import java.util.Optional;

public class Exemplo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String frases[] = new String[5];
		
		frases[2] = "Generation Brasil";
				
		for(var frase : frases) {
			System.out.println(frase);
		}
		
		Optional<String> optionalVazio = Optional.empty();
		System.out.println("Exibir o valor de optionalVazio" + optionalVazio);
		System.out.println("O optionalVazio está vazio? " + optionalVazio.isEmpty());
		
		Optional<String> valorIndice2 = Optional.of(frases[2]);
		System.out.println("Exibir o valor do valorIndice2 " + valorIndice2);
		System.out.println("O valorIndice2 tem alguma coisa? " + valorIndice2.isPresent());
		System.out.println("O valorIndice2 tem alguma coisa? " + valorIndice2.get());
	}
	
}
