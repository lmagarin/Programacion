package Rectangulo;

/**
 * 2.- (Java) Crea la clase Rectángulo de forma que:
 * Un objeto de esta clase se construye pasándole el ancho y el alto. Ninguno de los dos atributos
 * puede ser menor o igual a cero ni mayor que diez, en esos casos se debe lanzar la excepción
 * ArithmeticException.
 * • Mediante getters y setters permite que se acceda y se modifique el ancho y el alto del
 * rectángulo teniendo en cuenta las restricciones en cuanto a las dimensiones del apartado
 * anterior.
 * • Al imprimir en pantalla un objeto de la clase usando System.out.print se debe dibujar el
 * rectángulo por la pantalla (de manera similar a como se imprime un cuadrado en la página 130
 * del libro Aprende Java con Ejercicios).
 * • Crea la clase Cuadrado como subclase de Rectángulo. Le debes añadir a su comportamiento
 * la posibilidad de comparar objetos cuadrados entre sí.
 * • Crea los programas de test correspondientes a ambas clases. Debes provocar que se lance la
 * excepción y capturarla. 
 * 
 * @author Cristina Prieto Jalao
 *
 */

public class Rectangulo {
  
private int ancho;
protected int alto;
     
  //Constructor
  Rectangulo(int ancho, int alto) throws ArithmeticException {
    setAncho(ancho);
    setAlto(alto);
  }
  
  /**
   * Método para obtener el valor de la variable alto
   * @return alto
   */
  public int getAlto() {
    return alto;
  }

  /**
   * Método par modificar el valor de la variable alto
   * @param alto
   * @return alto
   * 
   */
  public void setAlto(int alto) {
    if(alto<=0 || alto>10) 
      throw new ArithmeticException();  
    this.alto = alto;
  }

  /**
   * Método para obtener el valor de la variable ancho
   * @return ancho
   */
  public int getAncho() {
    return ancho;
  }
    
  /**
   * Método para modificar el valor de la variable ancho
   * @param ancho
   * @return ancho
   */
  public void setAncho(int ancho) {
    if(ancho<=0 || ancho>10)
      throw new ArithmeticException();
    this.ancho = ancho;
  }
  
  /**
   * Método para imprimir el rectángulo
   */
  public String toString() {
    String aux = "";

    for (int i = 0; i < this.getAncho(); i++) {
      aux += "[]";
    }

    aux += "\n";

    for (int j = 1; j < this.getAlto() - 1; j++) {
      for (int i = 0; i < this.getAncho(); i++) {
        if (i == 0 || i == (this.getAncho() - 1))
          aux += "[]";
        else
          aux += "  ";
      }
      aux += "\n";
    }

    if (this.getAlto() > 1)
      for (int i = 0; i < this.getAncho(); i++) {
        aux += "[]";
      }
    return aux;
  }
  
  
}


  
