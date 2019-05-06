/**
 * Realiza un programa que escoja al azar 10 cartas de la baraja espa�ola
 * (10 objetos de la clase Carta). Emplea un objeto de la clase ArrayList para
 * almacenarlas y aseg�rate de que no se repite ninguna.
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
  
  //M�todo getter para obtener el n�mero
  public String getNumero() {
    return numero;
  }

  //M�todo getter para obtener el palo
  public String getPalo() {
    return palo;
  }
  
  //M�todo toString
  public String toString() {
    return this.numero + " de " + this.palo;
  }
}
