/**
 * Clase Test Rectángulo que usaremos para probar el funcionamiento de la clase Rectangulo
 * 
 * @author Cristina Prieto Jalao
 */

package Rectangulo;
import java.util.Scanner;

public class TestRectangulo {
  public static void main (String [] args) {
    Scanner s=new Scanner (System.in);
    System.out.print("Inserte el ancho del rectángulo: ");
    int ancho=s.nextInt();
    System.out.print("Inserte el alto del rectángulo: ");
    int alto=s.nextInt();
    
    Rectangulo rectangulo= new Rectangulo(ancho, alto);
    System.out.println(rectangulo);
  }

}
