package exercicios_collection;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        ArrayList<Integer> numeros = new ArrayList<Integer>();

        numeros.add(1);
        numeros.add(3);
        numeros.add(5);
        numeros.add(7);
        numeros.add(9);
        numeros.add(10);
        numeros.add(8);
        numeros.add(6);
        numeros.add(4);
        numeros.add(2);

        // Mostrar índices e valores
        System.out.println("Índices e Valores:");
        for (int indice = 0; indice < numeros.size(); indice++) {
            System.out.println("Índice " + indice + " -> Valor " + numeros.get(indice));
        }

        // Entrada do usuário
        System.out.print("Digite o número que você deseja encontrar: ");
        int numeroDigitado = leia.nextInt();

        // Verificação
        if (numeros.contains(numeroDigitado)) {
            int posicao = numeros.indexOf(numeroDigitado);
            System.out.println("O número " + numeroDigitado + " está localizado na posição: " + posicao);
        } else {
            System.out.println("O número " + numeroDigitado + " não foi encontrado!");
        }

        leia.close();
    }
}
