package aula_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Divisao {

    static Scanner ler = new Scanner(System.in);

    public static void main(String[] args) {

        int dividendo = 0;
        int divisor = 0;
        boolean loop = true;

        do
        try {
            System.out.println("Digite o Dividendo: ");
            dividendo = ler.nextInt();

            System.out.println("Digite o Divisor: ");
            divisor = ler.nextInt();

            divide(dividendo, divisor);
            
            loop = false;

        } catch (InputMismatchException e) {
            System.err.println("Erro de digitação: " + e.getMessage());
            ler.next();
        } catch (ArithmeticException e) {
            System.err.println("Erro de cálculo: " + e.getMessage());
        // Finally é opcional para aparecer a mensagem independente se der certo ou não.
        } finally {
        	System.out.println("Obrigado pela preferência!");
        }while(loop);
    }

    public static void divide(int dividendo, int divisor) {
        System.out.println("Divisão = " + (dividendo / divisor));
    }
}
