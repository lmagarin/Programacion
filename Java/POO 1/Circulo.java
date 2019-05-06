package miPaquete;
/**
 * Crea la clase “Circulo” en Java que responda al siguiente comportamiento:
 * Un círculo puede crecer. Aumenta su radio.
 * Un círculo puede menguar. Decrementa su radio.
 * Un círculo me devuelve su área si se la pido.
 * Un círculo me dice su estado, por ejemplo “Soy un círculo de radio 0.5 metros.
 * Ocupo un área de 0.7853981633974483 metros cuadrados” (método toString())
 * 
 * @author Cristina Prieto Jalao
 *
 */
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Circulo {

   static double radio;
   final static double NUMERO_PI=Math.PI;
  
  //Constructor
  Circulo(double r){
    this.radio=r;
  }
  
  //Métodos
  //Método para obtener el radio
  double getRadio() {
    return this.radio;
  }
  
  //Método para obtener el área
  static double getArea(double radio) {
    return NUMERO_PI*Math.pow(radio, 2);
  }
  
  //Método para aumentar el radio
  static double aumentaRadio() {
    return radio++;
  }
  
  //Método para reducir el radio
   static double reduceRadio() {
    return radio--;
  }
  
   //Método para saber el estado del círculo
  static String estado() {
    String solucion="El estado del círculo es: Radio= "+radio+", Área= "+getArea(radio);
    return solucion;
  }
  
  //Programa principal
  public static void main (String [] args) {
    Scanner s=new Scanner(System.in);
    System.out.println("Introduzca el radio de su círculo: ");
    radio=s.nextInt();
    if (radio==0) {
      JOptionPane.showMessageDialog(null, "Soy un mísero punto");
    Circulo circulo1=new Circulo(radio);
    
    int entrada;
    
    //Menú para elegir una opción
    do {
    
      System.out.println("Inserte el número de lo que quiere hacer");
      System.out.println("------------------------------------------");
      System.out.println("Menú de opciones: ");
      System.out.println("1. Aumentar el radio");
      System.out.println("2. Menguar el radio");
      System.out.println("3. Calcular el área del círculo");
      System.out.println("4. Mostrar estado del círculo");
      System.out.println("TERMINAR");
      entrada=s.nextInt();
      
    //Switch para las opciones del menú
    switch(entrada){  
      case 1:{
        aumentaRadio(); 
        System.out.println("El radio ahora tiene un valor de: "+radio);
      }
      break;   
      case 2:{
        reduceRadio();
        System.out.println("El radio ahora tiene un valor de: "+radio);
      }
       break;
       case 3:{
         getArea(radio);
         System.out.println("El área del círculo es de: "+getArea(radio));
       }
       break;
       case 4:
        {
        System.out.println(estado());
        }
        break;    
    }
      }while (entrada!=4);
    }
  }
}
