/**
 * Realiza un programa que pida 6 números por teclado y nos diga cuál es el
 * máximo. Si el usuario introduce un dato erróneo (algo que no sea un número
 * entero) el programa debe indicarlo y debe pedir de nuevo el número.
 * @author Cristina Prieto Jalao
 *
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio1 {
  public static void main (String [] args) {
    Scanner s=new Scanner (System.in);
    
    ArrayList <Integer> arraylist = new ArrayList<Integer>();
    
    //Pedimos al usuario los datos y los almacenamos en el arraylist
    int i=0;
    do {
    try {
        System.out.println("Inserte un número: ");
        arraylist.add(s.nextInt());
        i++;
      }
    catch(Exception e){
      System.out.println("Debe insertar un número entero");
      s.next();
    }
  }while(i!=6);
    //Mostramos el valor máximo
    Collections.sort(arraylist);
        System.out.println("El valor máximo introducido es :"+arraylist.get(5));
  }
}
