/**
 * Escribe un programa que ordene 10 números enteros introducidos por teclado
 * y almacenados en un objeto de la clase ArrayList.
 * 
 * @author Cristina Prieto Jalao
 *
 */
import java.util.ArrayList;
import java.util.Scanner;


public class Practica3 {
  public static void main (String [] args) {
    Scanner s=new Scanner(System.in);
    
    //Creamos el arraylist
    ArrayList<Integer> a=new ArrayList<Integer>();
    
    //Pedimosal usuario que inserte 10 n�meros
    for (int i=0; i<10; i++) {
      a.add(s.nextInt());
    }
  }
}
