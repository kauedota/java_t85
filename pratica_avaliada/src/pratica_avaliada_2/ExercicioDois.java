package pratica_avaliada_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExercicioDois {

    // Método para adicionar aluno
    public static void adicionarAluno(List<String> alunos, Scanner leia) {
        System.out.print("Digite o nome do Aluno: ");
        String nome = leia.nextLine();
        System.out.print("Digite a idade do Aluno: ");
        int idade = leia.nextInt();
        System.out.print("Digite a nota final do Aluno: ");
        double notaFinal = leia.nextDouble();
        leia.nextLine(); // consumir quebra de linha

        // Guardando tudo em uma única String
        String aluno = "Nome: " + nome + ", Idade: " + idade + ", Nota Final: " + notaFinal;
        alunos.add(aluno);

        System.out.println("Aluno cadastrado com sucesso!");
    }

    // Método para listar alunos
    public static void listarAlunos(List<String> alunos) {
        if (alunos.isEmpty()) {
            System.out.println("Nenhum aluno cadastrado.");
        } else {
            System.out.println("Lista de Alunos:");
            for (String aluno : alunos) {
                System.out.println(aluno);
            }
        }
    }

    // Método para calcular média geral
    public static void calcularMedia(List<String> alunos) {
        if (alunos.isEmpty()) {
            System.out.println("Nenhum aluno cadastrado para calcular média.");
        } else {
            double somaNotas = 0;
            int contador = 0;

            for (String aluno : alunos) {
                // Pegando a nota final que está no texto
                String[] partes = aluno.split(", ");
                String notaTexto = partes[2].replace("Nota Final: ", "");
                double nota = Double.parseDouble(notaTexto);

                somaNotas = somaNotas + nota;
                contador++;
            }

            double mediaGeral = somaNotas / contador;
            System.out.println("Média Geral das Notas: " + mediaGeral);
        }
    }

    // Método principal
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        List<String> alunos = new ArrayList<>();
        int opcao;

        do {
            System.out.println("***********************************************");
            System.out.println("1 - Adicionar Aluno");
            System.out.println("2 - Listar todos os Alunos");
            System.out.println("3 - Calcular Média Geral das Notas");
            System.out.println("0 - Sair");
            System.out.println("***********************************************");
            System.out.print("Entre com a opção desejada: ");
            opcao = leia.nextInt();
            leia.nextLine();

            switch (opcao) {
                case 1:
                    adicionarAluno(alunos, leia);
                    break;
                case 2:
                    listarAlunos(alunos);
                    break;
                case 3:
                    calcularMedia(alunos);
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
