package exercicios_collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        // 1. Criar a Collection
        ArrayList<String> cores = new ArrayList<String>();

        // 2. Entrada de dados (laço para pedir 5 cores)
        for (int cor = 0; cor < 5; cor++) {
            System.out.print("Digite uma cor: ");
            	String corDigitada = leia.nextLine();
            		cores.add(corDigitada);
        }

        // 3. Mostrar todas as cores digitadas
        System.out.println("\nListar todas as cores:");
        	for (String cor : cores) {
        		System.out.println(cor);
        }

        // 4. Ordenar em ordem crescente
        Collections.sort(cores);
        
        System.out.println("\nOrdenar as cores:");
        	for (String cor : cores)
        		System.out.println(cor);
        // laço para percorrer e imprimir

        leia.close();
    }
}
