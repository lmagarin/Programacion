/**
 * Realiza un programa que escoja al azar 10 cartas de la baraja española
 * (10 objetos de la clase Carta). Emplea un objeto de la clase ArrayList para
 * almacenarlas y asegúrate de que no se repite ninguna.
 * 
 * @author Cristina Prieto Jalao
 *
 */
public class Carta {
  
  //Creamos dos arrays
  private static String[] n = {"as", "dos", "tres", "cuatro", "cinco", "seis", "siete", "sota", "caballo", "rey"};
  private static String[] p = {"bastos", "copas", "espadas", "oros"};
  
  //Variables
  private String numero;
  private String palo;

  //Objeto carta
  public Carta() {
    this.numero = n[(int)(Math.random()*10)];
    this.palo = p[(int)(Math.random()*4)];
  }
  
  //Método getter para obtener el número
  public String getNumero() {
    return numero;
  }

  //Método getter para obtener el palo
  public String getPalo() {
    return palo;
  }
  
  //Método toString
  public String toString() {
    return this.numero + " de " + this.palo;
  }
}
