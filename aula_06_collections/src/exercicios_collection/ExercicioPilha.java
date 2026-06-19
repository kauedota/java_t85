package exercicios_collection;

import java.util.Scanner;
import java.util.Stack;

public class ExercicioPilha {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Stack<String> pilha = new Stack<>();
        int opcao;

        do {
            System.out.println("***********************************************");
            System.out.println("1 - Adicionar Livro na Pilha");
            System.out.println("2 - Listar todos os Livros");
            System.out.println("3 - Retirar Livro da Pilha");
            System.out.println("0 - Sair");
            System.out.println("***********************************************");
            System.out.print("Entre com a opção desejada: ");
            opcao = leia.nextInt();
            leia.nextLine(); // consumir quebra de linha

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do Livro: ");
                    String livro = leia.nextLine();
                    pilha.push(livro);
                    System.out.println("Livro \"" + livro + "\" adicionado à pilha!");
                    break;

                case 2:
                    if (pilha.isEmpty()) {
                        System.out.println("A pilha está vazia.");
                    } else {
                        System.out.println("Lista de Livros na Pilha:");
                        for (String l : pilha) {
                            System.out.println(l);
                        }
                    }
                    break;

                case 3:
                    if (pilha.isEmpty()) {
                        System.out.println("A pilha está vazia. Nenhum livro para retirar.");
                    } else {
                        String retirado = pilha.pop();
                        System.out.println("Livro retirado da pilha: " + retirado);
                    }
                    break;

                case 0:
                    System.out.println("Programa finalizado!");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
            System.out.println();
        } while (opcao != 0);

        leia.close();
    }
}
