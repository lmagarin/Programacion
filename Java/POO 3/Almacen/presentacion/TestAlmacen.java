package presentacion;
import java.util.Scanner;
import excepciones.*;
import gestion.Almacen;
import presentacion.Menu;

/**
 * 
 * @author Damián Jesús Miquel Jiménez
 * @version 2.0
 */

public class TestAlmacen {
  static Almacen almacen = new Almacen();
  public static void main(String[] args) throws CodigoNoExisteException,
      PrecioNegativoException, StockNegativoException {

    Scanner scanner = new Scanner(System.in);

    int seleccion;

    do {
      Menu.menuPrincipal();
      System.out.print("Introduzca su selección: ");
      seleccion = scanner.nextInt();
      System.out.println("====================================");

      switch (seleccion) {
        case 1 :
          crearArticulo();
          break;

        case 2 :
          borrarArticulo();
          break;

        case 3 :
          do {
            if (almacen.isEmpty() == false) {
              System.out.println(
                  "------------------------------------");
              almacen.getAlmacen();
              System.out.println(
                  "------------------------------------");
              Menu.menuModificar();
              System.out.print("Introduzca su selección: ");
              seleccion = scanner.nextInt();
              System.out.println(
                  "====================================");
            } else {
              System.err.println(
                  "No hay datos en la base de datos.");
              seleccion = 0;
            }
            switch (seleccion) {
              case 1 :
                modificarDescripcion();
                seleccion = 0;
                break;

              case 2 :
                modificarPrecioCompra();
                seleccion = 0;
                break;

              case 3 :
                modificarPrecioVenta();
                seleccion = 0;
                break;

              case 4 :
                modificarStock();
                seleccion = 0;
                break;

              default :
                System.err.println("Selección no válida.");
                break;
            }
          } while (seleccion != 0);
          break;

        case 4 :
          if (almacen.isEmpty() == false) {
            introducirMercancia();
          } else {
            System.err.println("No hay datos en la base de datos.");
          }
          break;

        case 5 :
          extarerMercancia();
          break;

        case 6 :
          if (almacen.isEmpty() == false) {
            System.out.println(
                "------------------------------------");
            almacen.getAlmacen();
            System.out.println(
                "------------------------------------");
          } else {
            System.err.println("No hay datos en la base de datos.");
          }
          break;

        case 7 :
          System.out.println("Programa Finalizado.");
          break;

        default :
          System.err.println("Selección no válida.");
          break;
      }
    } while (seleccion != 7);

  }

  /**
   * Crea un artículo.
   * 
   * @throws PrecioNegativoException
   * @throws StockNegativoException
   */
  private static void crearArticulo()
      throws PrecioNegativoException, StockNegativoException {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Introduzca la descripción del artículo: ");
    String descripcion = scanner.nextLine();

    System.out.print("Introduzca el precio de compra del artículo: ");
    double precioCompra = scanner.nextDouble();

    System.out.print("Introduzca el precio de venta del artículo: ");
    double precioVenta = scanner.nextDouble();

    System.out.print("Introduzca el número de unidades del artículo: ");
    int stock = scanner.nextInt();

    try {
      almacen.crear(descripcion, precioCompra, precioVenta, stock);
    } catch (PrecioNegativoException | StockNegativoException e) {
      System.err.println(
          "No se ha podido añadir el artículo. " + e.getMessage());
    }
  }

  /**
   * Borra un artículo utilizando el código.
   * 
   * @throws CodigoNoExisteException
   */
  private static void borrarArticulo() throws CodigoNoExisteException {
    Scanner scanner = new Scanner(System.in);

    System.out
        .print("Introduzca el código del artículo que desea borrar: ");
    int codigo = scanner.nextInt();

    try {
      almacen.eliminar(codigo);
    } catch (CodigoNoExisteException e) {
      System.err.println(
          "No se ha podiddo borrar el artículo. " + e.getMessage());
    }

  }

  /**
   * Modifica la descripción de un artículo.
   * 
   * @throws CodigoNoExisteException
   */
  private static void modificarDescripcion() throws CodigoNoExisteException {
    Scanner scanner = new Scanner(System.in);

    System.out.print(
        "Introduzca el código del artículo que desea modificar: ");
    int codigo = scanner.nextInt();

    System.out.print("Introduzca la nueva descripción: ");
    String descripcion = scanner.nextLine();

    try {
      almacen.modDescripcion(codigo, descripcion);
    } catch (CodigoNoExisteException e) {
      System.err.println("No se ha podido realizar la modificación. "
          + e.getMessage());
    }

  }

  /**
   * Modifica el precio de compra de un artículo.
   * 
   * @throws CodigoNoExisteException
   * @throws PrecioNegativoException
   */
  private static void modificarPrecioCompra()
      throws CodigoNoExisteException, PrecioNegativoException {
    Scanner scanner = new Scanner(System.in);

    System.out.print(
        "Introduzca el código del artículo que desea modificar: ");
    int codigo = scanner.nextInt();

    System.out.print("Introduzca el nuevo precio: ");
    double precioCompra = scanner.nextDouble();

    try {
      almacen.modPrecioCompra(codigo, precioCompra);
    } catch (CodigoNoExisteException | PrecioNegativoException e) {
      System.err.println("No se ha podido relizar la modificación. "
          + e.getMessage());
    }
  }

  /**
   * Modifica el precio de venta.
   * 
   * @throws CodigoNoExisteException
   * @throws PrecioNegativoException
   */
  private static void modificarPrecioVenta()
      throws CodigoNoExisteException, PrecioNegativoException {
    Scanner scanner = new Scanner(System.in);

    System.out.print(
        "Introduzca el código del artículo que desea modificar: ");
    int codigo = scanner.nextInt();

    System.out.print("Introduzca el nuevo precio: ");
    double precioVenta = scanner.nextDouble();

    try {
      almacen.modPrecioVenta(codigo, precioVenta);
    } catch (CodigoNoExisteException | PrecioNegativoException e) {
      System.err.println("No se ha podido realizar la modificación. "
          + e.getMessage());
    }

  }

  /**
   * Modifica el stock de un artículo.
   * 
   * @throws CodigoNoExisteException
   * @throws StockNegativoException
   */
  private static void modificarStock()
      throws CodigoNoExisteException, StockNegativoException {
    Scanner scanner = new Scanner(System.in);

    System.out.print(
        "Introduzca el código del artículo que desea modificar: ");
    int codigo = scanner.nextInt();

  }

  /**
   * Aumenta el número de unidades de un artículo.
   * 
   * @throws CodigoNoExisteException
   * @throws StockNegativoException
   */
  private static void introducirMercancia()
      throws CodigoNoExisteException, StockNegativoException {
    Scanner scanner = new Scanner(System.in);

    System.out.print(
        "Introduzca el código del artículo que desea modificar: ");
    int codigo = scanner.nextInt();

    System.out.print("Introduzca las unidades que se van a itroducir: ");
    int cantidad = scanner.nextInt();

    try {
      almacen.decrementarStock(codigo, cantidad);
    } catch (CodigoNoExisteException | StockNegativoException e) {
      System.err.println(
          "No se ha podido realizar la entrada de mercancía. "
              + e.getMessage());
    }
  }

  /**
   * Reduce el número de un artículo.
   * 
   * @throws CodigoNoExisteException
   * @throws StockNegativoException
   */
  private static void extarerMercancia()
      throws CodigoNoExisteException, StockNegativoException {
    Scanner scanner = new Scanner(System.in);

    System.out.print(
        "Introduzca el código del artículo que desea modificar: ");
    int codigo = scanner.nextInt();

    System.out.print("Introduzca las unidades que se van a retiar: ");
    int cantidad = scanner.nextInt();

    try {
      almacen.decrementarStock(codigo, cantidad);
    } catch (CodigoNoExisteException | StockNegativoException e) {
      System.err.println(
          "No se ha podido realizar la retirarda de mercancía. "
              + e.getMessage());
    }
  }
}
