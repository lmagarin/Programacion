/**
 * Realiza un programa que escoja al azar 10 cartas de la baraja española
 * (10 objetos de la clase Carta). Emplea un objeto de la clase ArrayList para
 * almacenarlas y asegúrate de que no se repite ninguna.

 * @author Cristina Prieto Jalao
 *
 */
import java.util.ArrayList;

public class Practica8 {
  public static void main(String [] args) {
    ArrayList<Carta> c = new ArrayList<Carta>();
    
    Carta carta1 = new Carta();
    c.add(carta1);
    
    for (int i = 0; i < 9; i++) {
      do {
        carta1 = new Carta();      
      } while (c.contains(carta1));
      
      c.add(carta1);
    }
      
    for (Carta miCarta: c) {
      System.out.println(miCarta);
    }
  }
}