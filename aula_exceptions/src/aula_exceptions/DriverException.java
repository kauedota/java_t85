package aula_exceptions;

public class DriverException extends Exception {
    
    private static final long serialVersionUID = 1L;
    
    // Construtor padrão
    public DriverException() {
        super();
    }
    
    // Construtor com mensagem
    public DriverException(String mensagem) {
        super(mensagem);
    }
}
