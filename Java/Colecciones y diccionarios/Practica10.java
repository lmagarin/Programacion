/**
 * Crea un mini-diccionario español-inglés que contenga, al menos, 20 palabras
 * (con su correspondiente traducción). Utiliza un objeto de la clase HashMap para
 * almacenar las parejas de palabras. El programa pedirá una palabra en español
 * y dará la correspondiente traducción en inglés.
 * @author Cristina Prieto Jalao
 *
 */
import java.util.HashMap;
import java.util.Scanner;

public class Practica10 {
  public static void main (String [] args) {
    Scanner s= new Scanner (System.in);
    
    HashMap <String, String> d = new HashMap<String, String>();
    
    d.put("ORDENADOR", "Computer");
    d.put("ROJO", "Red");
    d.put("AMARILLO", "Yellow");
    d.put("AZUL", "Blue");
    d.put("ROSA", "Pink");
    d.put("NEGRO", "Black");
    d.put("BLANCO", "White");
    d.put("MESA", "Table");
    d.put("RATÓN", "Mouse");
    d.put("ESCRITORIO", "Desktop");
    d.put("AGUA", "Water");
    d.put("PAN", "Nread");
    d.put("DORMITORIO", "Bedroom");
    d.put("CUARTO DE BAÑO", "Bathroom");
    d.put("SALA DE ESTAR", "Living room");
    d.put("COCINA", "Kitchen");
    d.put("GATO", "Cat");
    d.put("PERRO", "Dog");
    d.put("OSO", "Bear");
    d.put("LUZ", "Light");

    
    System.out.println("Inserte una palabra en español: ");
    String palabraABuscar=s.nextLine();
    String solucion=palabraABuscar.toUpperCase();
    
    if (d.containsKey (solucion)) {
      System.out.println(palabraABuscar+ " traducida a inglés es: "+d.get(solucion));
    }else {
      System.out.println("La palabra introducida no se encuentra en el diccionario.");
    }
  }
}
