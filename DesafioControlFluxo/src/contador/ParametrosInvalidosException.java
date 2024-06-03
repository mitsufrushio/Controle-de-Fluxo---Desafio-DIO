package contador;

public class ParametrosInvalidosException extends RuntimeException {

	private static final long serialVersionUID = -5355680207260699110L;
	
	public ParametrosInvalidosException() {
		super("O segundo parâmetro deve ser maior que o primeiro");
	}

}
