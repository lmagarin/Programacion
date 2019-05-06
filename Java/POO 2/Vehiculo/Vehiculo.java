/**
 * Crea la clase Vehiculo, así como las clases Bicicleta y Coche como subclases de
 * la primera. Para la clase Vehiculo, crea los atributos de clase vehiculosCreados y
 * kilometrosTotales, así como el atributo de instancia kilometrosRecorridos. Crea
 * también algún método específico para cada una de las subclases. Prueba las
 * clases creadas mediante un programa con un menú como el que se muestra
 * a continuación:
 * @author Cristina Prieto Jalao
 *
 */
public class Vehiculo {
  
  //Atributos
  private static int vehiculosCreados;
  private static int kilometrosTotales;
  
  //Atributo de instancia
  private int kilometrosRecorridos=0;
  
  //Getter
  public int getKilometrosRecorridos() {
    return this.kilometrosRecorridos;
  }
  
  public static int getKilometrosTotales() {
    return Vehiculo.kilometrosTotales;
  }
  
  /**
   * Método para hacer que un vehículo recorra una distancia
   */
  public void recorre(int km) {
    this.kilometrosRecorridos+=km;
    Vehiculo.kilometrosTotales+=km;
  }

  //Getter vehiculos creados
  public static int getVehiculosCreados() {
    return vehiculosCreados;
  }

  //Setter vehiculos creados
  public static void setVehiculosCreados(int vehiculosCreados) {
    Vehiculo.vehiculosCreados = vehiculosCreados;
  }

}