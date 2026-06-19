package exercicios_collection;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ExercicioMenu {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Queue<String> fila = new LinkedList<>();
        int opcao;

        do {
            System.out.println("***********************************************");
            System.out.println("1 - Adicionar Cliente na Fila");
            System.out.println("2 - Listar todos os Clientes");
            System.out.println("3 - Retirar Cliente da Fila");
            System.out.println("0 - Sair");
            System.out.println("***********************************************");
            System.out.print("Entre com a opção desejada: ");
            opcao = leia.nextInt();
            leia.nextLine(); // consumir quebra de linha

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do Cliente: ");
                    String nome = leia.nextLine();
                    fila.add(nome);
                    System.out.println("Cliente " + nome + " adicionado à fila.");
                    break;

                case 2:
                    if (fila.isEmpty()) {
                        System.out.println("A fila está vazia.");
                    } else {
                        System.out.println("Clientes na fila:");
                        for (String cliente : fila) {
                            System.out.println(cliente);
                        }
                    }
                    break;

                case 3:
                    if (fila.isEmpty()) {
                        System.out.println("A fila está vazia. Nenhum cliente para retirar.");
                    } else {
                        String chamado = fila.poll();
                        System.out.println("Cliente chamado: " + chamado);
                    }
                    break;

                case 0:
                    System.out.println("Programa finalizado.");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
            System.out.println();
        } while (opcao != 0);

        leia.close();
    }
}
