package exercicios_aula_05;

public class Exercicio3 {

    public static void main(String[] args) {

        int matrizInteiros[][] = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int somaPrincipal = 0;
        int somaSecundaria = 0;

        System.out.println("Elementos da Diagonal Principal:");

        for (int linha = 0; linha < matrizInteiros.length; linha++) {
            System.out.print(matrizInteiros[linha][linha] + " ");
            somaPrincipal += matrizInteiros[linha][linha];
        }

        
        System.out.println("\nElementos da Diagonal Secundária:");

        for (int linha = 0; linha < matrizInteiros.length; linha++) {
            System.out.print(matrizInteiros[linha][matrizInteiros.length - 1 - linha] + " ");
            somaSecundaria += matrizInteiros[linha][matrizInteiros.length - 1 - linha];
        }

        System.out.println("\nSoma dos Elementos da Diagonal Principal:");
        System.out.println(somaPrincipal);

        System.out.println("Soma dos Elementos da Diagonal Secundária:");
        System.out.println(somaSecundaria);
    }
}