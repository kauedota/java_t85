package pratica_avaliada_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExercicioUm {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();

        // Entrada de 5 números usando contador++
        for (int contador = 0; contador < 5; contador++) {
            System.out.print("Digite um número inteiro: ");
            numeros.add(leia.nextInt());
        }

        // Chama o método de análise
        analisarNumeros(numeros);

        leia.close();
    }

    // Método que recebe a coleção e faz a análise
    public static void analisarNumeros(List<Integer> numeros) {
        int soma = 0;
        int maior = numeros.get(0);

        for (int numero : numeros) {
            soma += numero;
            if (numero > maior) {
                maior = numero;
            }
        }

        double media = (double) soma / numeros.size();

        System.out.println("\nColeção de números: " + numeros);
        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media);
        System.out.println("Maior valor: " + maior);
    }
}
