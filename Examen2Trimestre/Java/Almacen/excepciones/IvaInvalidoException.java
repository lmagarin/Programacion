package excepciones;

public class IvaInvalidoException extends Exception {
  public IvaInvalidoException() {
    super("\nEl IVA introducido no es válido.");
  }
}
