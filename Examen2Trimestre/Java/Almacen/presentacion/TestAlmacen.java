package presentacion;

import excepciones.*;
import gestion.*;
import utiles.*;


/**
 * Test Almacen
 * @author Cristina Prieto Jalao
 */

public class TestAlmacen {
  
  //Menus que usaremos
	static Almacen almacen = new Almacen();
	static Menu menuPrincipal = new Menu();
  static Menu menuModificar = new Menu();
  static Menu menuIva = new Menu();
	
	public static void main(String[] args) throws CodigoNoExisteException,
			PrecioNegativoException, StockNegativoException, IvaInvalidoException {

	  String[] opcionesPrincipal = {"Añadir Artículo", "Borrar Artículo",
        "Modificar Artículo", "Introducir Mercancía",
        "Extraer Mercancía", "Mostrar Artículos", "Salir del Programa"};
    menuPrincipal.crearMenu("Menu Principal", opcionesPrincipal);

    String[] opcionesModificar = {"Modificar Descripción",
        "Modificar Precio de Compra", "Modificar Precio de Venta",
        "Modificar Stock", "Modificar IVA"};
    menuModificar.crearMenu("Menu Modificar", opcionesModificar);

    String[] opcionesIVA = {"General", "Reducido", "Super Reducido"};
    menuIva.crearMenu("Menu IVA", opcionesIVA);

    String seleccion;

    do {
      seleccion = menuPrincipal.recogerOpcion();
      switch (seleccion) {
        case "1" :
          crearArticulo();
          break;

        case "2" :
          borrarArticulo();
          break;

        case "3" :
          do {
            if (almacen.vacio() == false) {
              System.out.println(
                  "------------------------------------");
              almacen.inventario();
              seleccion = menuModificar.recogerOpcion();
            } else {
              System.err.println(
                  "\nNo hay datos en la base de datos.");
              seleccion = "0";
            }
            switch (seleccion) {
              case "1" :
                modificarDescripcion();
                seleccion = "0";
                break;

              case "2" :
                modificarPrecioCompra();
                seleccion = "0";
                break;

              case "3" :
                modificarPrecioVenta();
                seleccion = "0";
                break;

              case "4" :
                modificarStock();
                seleccion = "0";
                break;

              case "5" :
                modificarIva();
                seleccion = "0";
                break;

              default :
                System.err.println("Selección no válida.");
                break;
            }
          } while (!seleccion.equals("0"));
          break;

        case "4" :
          if (almacen.vacio() == false) {
            introducirMercancia();
          } else {
            System.err.println("No hay datos en la base de datos.");
          }
          break;

        case "5" :
          extraerMercancia();
          break;

        case "6" :
          if (almacen.vacio() == false) {
            System.out.println(
                "------------------------------------");
            almacen.inventario();
          } else {
            System.err.println("No hay datos en la base de datos.");
          }
          break;

        case "7" :
          System.err.println("Programa finalizado.");
          break;

        default :
          System.err.println("Selección no válida.");
          break;
      }
    } while (!seleccion.equals("7"));

  }

	/**
	 * Método para crear un artículo.
	 * 
	 * @throws PrecioNegativoException
	 * @throws StockNegativoException
	 * @throws IvaInvalidoException
	 */
	private static void crearArticulo()
      throws PrecioNegativoException, StockNegativoException {

    System.out.print("Introduzca la descripción del artículo: ");
    String descripcion = Teclado.leerCandena();

    System.out.print("Introduzca el precio de compra del artículo: ");
    double precioCompra = Teclado.leerDouble();

    System.out.print("Introduzca el precio de venta del artículo: ");
    double precioVenta = Teclado.leerDouble();

    System.out.print("Introduzca el número de unidades del artículo: ");
    int stock = Teclado.leerInteger();

    String iva = tipoIVA().toString();

    try {
      almacen.crear(descripcion, precioCompra, precioVenta, stock, iva);
    } catch (PrecioNegativoException | StockNegativoException
        | IvaInvalidoException e) {
      System.err.println(
          "\nNo se ha podido crear el artículo." + e.getMessage());
    }
  }

  /**
   * Método para borrar un artículo utilizando el código.
   * @throws CodigoNoExisteException
   */
  private static void borrarArticulo() throws CodigoNoExisteException {
    System.out
        .print("Introduzca el código del artículo que desea borrar: ");
    int codigo = Teclado.leerInteger();

    try {
      almacen.eliminar(codigo);
      System.err.println("Artículo eliminado.");
    } catch (CodigoNoExisteException e) {
      System.err.println(
          "\nNo se ha podiddo borrar el artículo." + e.getMessage());
    }
  }

  /**
   * Método para modificar la descripción de un artículo.
   * @throws CodigoNoExisteException
   */
  private static void modificarDescripcion() throws CodigoNoExisteException {
    System.out.print(
        "Introduzca el código del artículo que desea modificar: ");
    int codigo = Teclado.leerInteger();

    System.out.print("Introduzca la nueva descripción: ");
    String descripcion = Teclado.leerCandena();

    try {
      almacen.modDescripcion(codigo, descripcion);
    } catch (CodigoNoExisteException e) {
      System.err.println("\nNo se ha podido realizar la modificación."
          + e.getMessage());
    }

  }

  /**
   * Métdo para modificar el precio de compra de un artículo
   * 
   * @throws CodigoNoExisteException
   * @throws PrecioNegativoException
   */
  private static void modificarPrecioCompra()
      throws CodigoNoExisteException, PrecioNegativoException {
    System.out.print(
        "Introduzca el código del artículo que desea modificar: ");
    int codigo = Teclado.leerInteger();

    System.out.print("Introduzca el nuevo precio: ");
    double precioCompra = Teclado.leerDouble();

    try {
      almacen.modPrecioCompra(codigo, precioCompra);
    } catch (CodigoNoExisteException | PrecioNegativoException e) {
      System.err.println("\nNo se ha podido relizar la modificación."
          + e.getMessage());
    }
  }

  /**
   * Método para modificar el precio de venta de un artículo
   * 
   * @throws CodigoNoExisteException
   * @throws PrecioNegativoException
   */
  private static void modificarPrecioVenta()
      throws CodigoNoExisteException, PrecioNegativoException {
    System.out.print(
        "Introduzca el código del artículo que desea modificar: ");
    int codigo = Teclado.leerInteger();

    System.out.print("Introduzca el nuevo precio: ");
    double precioVenta = Teclado.leerDouble();

    try {
      almacen.modPrecioVenta(codigo, precioVenta);
    } catch (CodigoNoExisteException | PrecioNegativoException e) {
      System.err.println("\nNo se ha podido realizar la modificación."
          + e.getMessage());
    }

  }

  /**
   * Método para modificar el stock de un artículo
   * @throws CodigoNoExisteException
   * @throws StockNegativoException
   */
  private static void modificarStock()
      throws CodigoNoExisteException, StockNegativoException {
    System.out.print(
        "Introduzca el código del artículo que desea modificar: ");
    int codigo = Teclado.leerInteger();

    System.out.print("Introduzca el nuevo stock: ");
    int stock = Teclado.leerInteger();

    try {
      almacen.modStock(codigo, stock);
    } catch (CodigoNoExisteException | StockNegativoException e) {
      System.err.println("\nNo se ha podido realizar la modificación."
          + e.getMessage());
    }

  }

  /**
   * Método para modificar el tipo de IVA de un artículo
   * @throws CodigoNoExisteException
   * @throws IvaInvalidoException
   */
  private static void modificarIva()
      throws CodigoNoExisteException, IvaInvalidoException {
    System.out.print(
        "Introduzca el código del artículo que desea modificar: ");
    int codigo = Teclado.leerInteger();

    String iva = tipoIVA().toString();

    try {
      almacen.modIva(codigo, iva);
    } catch (CodigoNoExisteException | IvaInvalidoException e) {
      System.err.println("\nNo se ha podido realizar la modificación."
          + e.getMessage());
    }
  }

  /**
   * Método para aumentar stock de un artículo
   * @throws CodigoNoExisteException
   * @throws StockNegativoException
   */
  private static void introducirMercancia()
      throws CodigoNoExisteException, StockNegativoException {
    System.out.print(
        "Introduzca el código del artículo que desea modificar: ");
    int codigo = Teclado.leerInteger();

    System.out.print("Introduzca las unidades que se van a itroducir: ");
    int cantidad = Teclado.leerInteger();

    try {
      almacen.decrementarStock(codigo, cantidad);
    } catch (CodigoNoExisteException | StockNegativoException e) {
      System.err.println(
          "\nNo se ha podido realizar la entrada de mercancía."
              + e.getMessage());
    }
  }

  /**
   * Método para reducir el stock de un artículo
   * @throws CodigoNoExisteException
   * @throws StockNegativoException
   */
  private static void extraerMercancia()
      throws CodigoNoExisteException, StockNegativoException {
    System.out.print(
        "Introduzca el código del artículo que desea modificar: ");
    int codigo = Teclado.leerInteger();

    System.out.print("Introduzca las unidades que se van a retiar: ");
    int cantidad = Teclado.leerInteger();

    try {
      almacen.decrementarStock(codigo, cantidad);
    } catch (CodigoNoExisteException | StockNegativoException e) {
      System.err.println(
          "\nNo se ha podido realizar la retirarda de mercancía."
              + e.getMessage());
    }
  }

  /**
   * Devuelve el tipo de IVA mediante el uso de un enum (IVA). 
   * @return tipo de iva
   */

  private static IVA tipoIVA() {
    String iva = menuIva.recogerOpcion();
    switch (iva) {
      case "1" :
        return IVA.General;

      case "2" :
        return IVA.Reducido;

      case "3" :
        return IVA.SuperReducido;

      default :
        return IVA.Null;
    }
  }
}