package exercicios_collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        // 1. Criar a Collection Set
        Set<Integer> numeros = new HashSet<Integer>();

        // 2. Entrada de dados (10 números não repetidos)
        for (int contador = 0; contador < 10; contador++) {
            System.out.print("Digite um número inteiro: ");
            int numeroDigitado = leia.nextInt();
            	numeros.add(numeroDigitado);
        }

        // 3. Mostrar todos os elementos usando Iterator
        System.out.println("Listar dados do Set:");
        Iterator<Integer> iterator = numeros.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        leia.close();
    }
}
