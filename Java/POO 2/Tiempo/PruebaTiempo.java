/**
 * Crea la clase Tiempo con los m�todos suma y resta. Los objetos de la clase Tiempo
 * son intervalos de tiempo y se crean de la forma Tiempo t = new Tiempo(1, 20,
 * 30) donde los par�metros que se le pasan al constructor son las horas, los
 * minutos y los segundos respectivamente. Crea el m�todo toString para ver los
 * intervalos de tiempo de la forma 10h 35m 5s. Si se suman por ejemplo 30m 40s y
 * 35m 20s el resultado deber�a ser 1h 6m 0s. Realiza un programa de prueba para
 * comprobar que la clase funciona bien.
 * @author Cristina Prieto Jalao
 *
 */
public class PruebaTiempo {
  public static void main (String [] args) {
    Tiempo t1= new Tiempo (1,20,30);
    Tiempo t2= new Tiempo (0,30,40);
    Tiempo t3= new Tiempo (0,35,20);
    
    System.out.println(t1+ " + "+ t2 + " = "+t1.suma(t2));
    System.out.println(t2 + " - " + t3 + " = " + t2.resta(t3));
  }
}
