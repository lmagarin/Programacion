package excepciones;

public class StockNegativoException extends Exception {
	public StockNegativoException() {
	  super("\nEl stock no puede ser negativo.");
	}
}
