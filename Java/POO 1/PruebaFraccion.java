**
 * Crea la clase Fracción.
 * 
 * @author Cristina Prieto Jalao
 */
package miPaquete;
import java.util.Scanner;

public class PruebaFraccion {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
        

    int num;      
    int den;      
    String resultado; 
    
    
    //Fracción 1.
    System.out.println("Datos de la primera fracción:");
    System.out.print("Introduzca el numerador: ");
    num = s.nextInt();
    System.out.print("introduzca el denominador: ");
    den = s.nextInt();
    System.out.println("-----------------------------");
   
    Fraccion fraccion1 = new Fraccion(num, den);
    
    //Fracción 2.
    System.out.println("Datos de la segunda fracción:");
    System.out.print("Introduzca el numerador: ");
    num = s.nextInt();
    System.out.print("introduzca el denominador: ");
    den = s.nextInt();
    System.out.println("-----------------------------");
    
    Fraccion fraccion2 = new Fraccion(num, den);
    
    System.out.println("-----RESULTADOS-----");
    resultado = Fraccion.suma(fraccion1, fraccion2);
    System.out.println(resultado);
    
    resultado = Fraccion.resta(fraccion1, fraccion2);
    System.out.println(resultado);
    
    resultado = Fraccion.multiplicacion(fraccion1, fraccion2);
    System.out.println(resultado);
    
    resultado = Fraccion.division(fraccion1, fraccion2);
    System.out.println(resultado);
    System.out.println("--------------------");
    
    s.close();
  }
}