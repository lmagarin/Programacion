/**
 * Realiza un programa que introduzca valores aleatorios (entre 0 y 100) en un
 * ArrayList y que luego calcule la suma, la media, el máximo y el mínimo de esos
 * números. El tamaño de la lista también será aleatorio y podrá oscilar entre 10
 * y 20 elementos ambos inclusive.
 * 
 * @author Cristina Prieto Jalao
 */
import java.util.ArrayList;

public class Practica2 {
  public static void main (String [] args) {
    
    //Variables
    int tamano=(int)(Math.random()*11+10);
    int suma=0;
    int resta=0;
    int maximo=0;
    int minimo=0;
    
    ArrayList<Integer> a=new ArrayList<Integer>();
    
    //Bucle para almacenar los números aleatorios en el arraylist
    for (int i=0; i<tamano; i++) {
      a.add((int)(Math.random()*101));
    }
    
    //Imprimimos el arraylist que hemos generado
    System.out.println("Lista: "+a);
    
    //Suma de los número almacenados en el arraylist
    for(int n:a) {
      suma+=n;
    
      //Calculamos el valor mínimo almacenado
      if (n<minimo) {
        minimo=n;
      }
      
      //Calculamos el valor máximo almacenado
      if (n>maximo) {
        maximo=n;
      }
    }
    
    //Imprimimos los resultados
    System.out.println("La suma total es: "+suma);
    System.out.println("El valor mínimo es: "+minimo);
    System.out.println("El valor máximo es: "+maximo);
    System.out.println("La media es: "+suma/tamano);
    }
  }
