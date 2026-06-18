package exercicios_collection;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        // 1. Criar o Set já com 10 valores
        Set<Integer> numeros = new HashSet<>();
        numeros.add(2);
        numeros.add(5);
        numeros.add(1);
        numeros.add(3);
        numeros.add(4);
        numeros.add(9);
        numeros.add(7);
        numeros.add(8);
        numeros.add(10);
        numeros.add(6);

        // 2. Mostrar os elementos do Set
        System.out.println("Listar dados do Set:");
        for (Integer numero : numeros) {
            System.out.print(numero + " ");
        }
        System.out.println();

        // 3. Entrada do usuário
        System.out.print("Digite o número que você deseja encontrar: ");
        int numeroDigitado = leia.nextInt();

        // 4. Verificação
        if (numeros.contains(numeroDigitado)) {
            System.out.println("Número " + numeroDigitado + " foi encontrado!");
        } else {
            System.out.println("O número " + numeroDigitado + " não foi encontrado!");
        }

        leia.close();
    }
}
