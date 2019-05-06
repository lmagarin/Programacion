package miPaquete;
import java.util.Scanner;
import javax.swing.JOptionPane;

import miPaquete.Circulo;
/**
 *  Crea una clase TestCirculo que cree una instancia de “Circulo”, muestre su estado,
 *  lo haga crecer 27 veces, averigüe su área, lo haga decrecer 10 veces y muestre su
 *  estado final.
 *  
 * @author Cristina Prieto Jalao
 *
 */
public class TestCirculo {
  public static void main (String [] args) {
    Scanner s=new Scanner(System.in);
    System.out.println("Introduzca el radio de su círculo: ");
    double radio=s.nextInt();
    if (radio==0) {
      JOptionPane.showMessageDialog(null, "Soy un mísero punto");
    }
    
    //Creamos el círculo
    Circulo circulito=new Circulo(radio);
    
    //Mostrar estado
    System.out.println("Estado del círculo: ");
    circulito.estado();
    System.out.println(circulito.estado());
    System.out.println();
    
    
    //Crecer 27 veces
    System.out.println("Crecer el radio 27 veces:");
      radio=radio*27;
    System.out.println("El radio ahora equivale a "+radio);
    System.out.println();
    
    //Área
    System.out.println("El área del nuevo círculo es de: "+circulito.getArea(radio));
    System.out.println();
    
    //Decrecer 10 veces
    System.out.println("Decrecer el radio 10 veces");
    radio=radio-10;
    System.out.println("El radio ahora tiene un valor de: "+radio);
  }
}
