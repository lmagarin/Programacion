/**
 * Modifica la clase Gato vista anteriormente añadiendo el método apareaCon
 * Este método debe comprobar que los gatos son de distinto sexo, tras lo
 * cual, genera un nuevo gato. Por ejemplo, sería válido algo como Gato cria
 * = garfield.apareaCon(lisa). En caso de que los gatos sean del mismo sexo,
 * el método debe generar la excepción ExcepcionApareamientoImposible. Crea un
 * programa desde el que se pruebe el método
 * 
 * @author Cristina Prieto Jalao
 *
 */
public class Ejercicio2 {
  public static void main (String [] args) {
    Gato garfield= new Gato("macho");
    Gato paco= new Gato ("macho");
    
    try {
      garfield.apareaCon(paco);
    }catch (ExcepcionApareamientoImposible e) {
      System.out.println(e.getMessage());
    }
  }
}
