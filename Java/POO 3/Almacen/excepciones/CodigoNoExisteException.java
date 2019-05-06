package excepciones;

public class CodigoNoExisteException extends Exception {
	public CodigoNoExisteException() {
		super("El código no se encuentra en la base de datos.");
	}
}
