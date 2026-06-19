package pratica_avaliada_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExercicioTres {

    // Método para adicionar produto
    public static void adicionarProduto(List<String> estoque, Scanner leia) {
        System.out.print("Digite o nome do produto: ");
        String nome = leia.nextLine();
        System.out.print("Digite a quantidade em estoque: ");
        int quantidade = leia.nextInt();
        leia.nextLine();

        String produto = "Produto: " + nome + " | Quantidade: " + quantidade;
        estoque.add(produto);

        System.out.println("Produto adicionado com sucesso!");
    }

    // Método para atualizar quantidade de produto
    public static void atualizarProduto(List<String> estoque, Scanner leia) {
        System.out.print("Digite o nome do produto que deseja atualizar: ");
        String nomeBusca = leia.nextLine();
        boolean encontrado = false;

        for (int contador = 0; contador < estoque.size(); contador++) {
            String produto = estoque.get(contador);

            if (produto.contains("Produto: " + nomeBusca)) {
                System.out.print("Digite a nova quantidade: ");
                int novaQuantidade = leia.nextInt();
                leia.nextLine();

                String atualizado = "Produto: " + nomeBusca + " | Quantidade: " + novaQuantidade;
                estoque.set(contador, atualizado);

                System.out.println("Quantidade atualizada com sucesso!");
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Produto não encontrado no estoque.");
        }
    }

    // Método para listar produtos
    public static void listarProdutos(List<String> estoque) {
        if (estoque.isEmpty()) {
            System.out.println("Nenhum produto cadastrado.");
        } else {
            System.out.println("Lista de Produtos:");
            for (String produto : estoque) {
                System.out.println(produto);
            }
        }
    }

    // Método principal
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        List<String> estoque = new ArrayList<>();
        int opcao;

        do {
            System.out.println("***********************************************");
            System.out.println("1 - Adicionar Produto");
            System.out.println("2 - Atualizar Quantidade de Produto");
            System.out.println("3 - Listar Produtos");
            System.out.println("0 - Sair");
            System.out.println("***********************************************");
            System.out.print("Entre com a opção desejada: ");
            opcao = leia.nextInt();
            leia.nextLine();

            switch (opcao) {
                case 1:
                    adicionarProduto(estoque, leia);
                    break;
                case 2:
                    atualizarProduto(estoque, leia);
                    break;
                case 3:
                    listarProdutos(estoque);
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
