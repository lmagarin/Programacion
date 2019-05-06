/**
 * Escribe un programa que guarde en un fichero con nombre primos.dat los
 * números primos que hay entre 1 y 500.
 * 
 * @author Cristina Prieto Jalao
 *
 */

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Practica1 {
  public static void main (String [] args) throws IOException {
    BufferedWriter bw = new BufferedWriter(new FileWriter("primos.dat"));
      for (int i = 1; i < 501; i++) {
        if (esPrimo(i)) {
          bw.write((i) + "\n");
        }
      }
      bw.close();
  }
    
    /**
     * Método para saber si un número es primo o no
     * @param x
     * @return true si es primo. false si no es primo
     */
    public static boolean esPrimo(int x) {
      for (int i = 2; i < x; i++) {
        if ((x % i) == 0) {
          return false;
        }
      }
      return true;
  }

}
