package colaboradores;

public class Validacao {

    public static void validarNome(String nome) {
        // O método trim() em Java serve para remover os espaços em branco do início e do fim de uma String.
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome não pode ser vazio!");
        }
    }
    
    public static void validarEmail(String email) {
        if (!email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) {
            throw new IllegalArgumentException("Email inválido!");
        }
    }
    
    public static void validarSalario(double salario) {
        if (salario <= 0) {
            throw new IllegalArgumentException("Salário deve ser maior que zero!");
        }
    }
    
    public static void validarBonus(double bonus) {
        if (bonus < 0) {
            throw new IllegalArgumentException("O Bônus deve ser maior ou igual a zero!");
        }
    }
}
