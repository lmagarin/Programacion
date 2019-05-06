package Rectangulo;

import java.util.Scanner;

/**
 * Subclase de Rectangulo
 * 
 * @author Cristina Prieto Jalao
 *
 */
public class Cuadrado extends Rectangulo implements Comparable<Cuadrado> {

  // Constructor
  public Cuadrado(int lado) {
    super(lado, lado);
  }

  public static void main (String [] args) {
    Scanner s=new Scanner (System.in);
    
    Cuadrado cuadrado = crearCuadrado(s);
    Cuadrado cuadrado2 = crearCuadrado(s);
    
    
    int resultado=cuadrado.compareTo(cuadrado2);
    if (resultado==0) {
      System.out.println("Los cuadrados son iguales");
    }
    else if(resultado>0) {
      System.out.println("El primer cuadrado es mayor que el segundo");
    }
    else 
      System.out.println("El primer cuadrado es menor que el segundo");
      
    
  }

  private static Cuadrado crearCuadrado(Scanner s) {
    Cuadrado cuadrado;
   
    do {
      try {
        System.out.println("Inserte el lado del cuadrado: ");
        cuadrado = new Cuadrado(s.nextInt());
        System.out.println(cuadrado);
        return cuadrado;
      } catch (Exception e) {
        System.out.println("El valor introducido es erróneo ");
      } 
    } while (true);
    
  }

  @Override
  public int compareTo(Cuadrado o) {
    if (alto == o.getAlto())
      return 0;

    if (alto > o.getAlto())
      return 1;
    
    return -1;
  
  }
}
