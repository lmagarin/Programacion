package gestion;
import java.util.ArrayList;
import excepciones.*;

/**
 * 
 * @author Damián Jesús Miquel Jiménez
 * @version 2.0
 */

public class Almacen {

  private ArrayList<Articulo> almacen = new ArrayList<Articulo>();

  /**
   * Crea un artículo con los datos que recive.
   * 
   * @param descripcion
   * @param precioCompra
   * @param precioVenta
   * @param stock
   * @throws PrecioNegativoException
   * @throws StockNegativoException
   */
  public void crear(String descripcion, double precioCompra,
      double precioVenta, int stock)
      throws PrecioNegativoException, StockNegativoException {
    almacen.add(
        new Articulo(descripcion, precioCompra, precioVenta, stock));
  }

  /**
   * Eliminia un elemento del ArrayList.
   * 
   * @param codigo
   * @throws CodigoNoExisteException
   */
  public void eliminar(int codigo) throws CodigoNoExisteException {
    for (int i = 0; i < almacen.size(); i++) {
      if (i == almacen.size())
        throw new CodigoNoExisteException();
    }

    for (int i = 0; i < almacen.size(); i++) {
      if (almacen.get(i).getCodigo() == codigo) {
        almacen.remove(i);
      }
    }
  }

  /**
   * Muestra el listado de los artículos del almacen.
   * 
   * @return almacen
   */
  public void getAlmacen() {
    for (Articulo articulos : almacen) {
      System.out.println(articulos);
    }
  }

  /**
   * Modifica el stock de un artículo.
   * 
   * @param codigo
   * @param stock
   * @throws CodigoNoExisteException
   * @throws StockNegativoException
   */
  public void modStock(int codigo, int stock)
      throws CodigoNoExisteException, StockNegativoException {
    for (int i = 0; i < almacen.size(); i++) {
      if (i == almacen.size())
        throw new CodigoNoExisteException();
    }

    for (int i = 0; i < almacen.size(); i++) {
      if (almacen.get(i).getCodigo() == codigo) {
        almacen.get(i).setStock(stock);
      }
    }
  }

  /**
   * Aumenta el número de existencias de un artículo.
   * 
   * @param codigo
   * @param cantidad
   * @throws StockNegativoException
   */
  public void incrementarStock(int codigo, int cantidad)
      throws CodigoNoExisteException, StockNegativoException {
    for (int i = 0; i < almacen.size(); i++) {
      if (i == almacen.size())
        throw new CodigoNoExisteException();
    }

    for (int i = 0; i < almacen.size(); i++) {
      if (almacen.get(i).getCodigo() == codigo) {
        almacen.get(i).setStock(almacen.get(i).getSotck() + cantidad);
      }
    }
  }

  /**
   * Reduce el número de existencias de un artículo.
   * 
   * @param codigo
   * @param cantidad
   * @throws CodigoNoExisteException
   * @throws StockNegativoException
   */
  public void decrementarStock(int codigo, int cantidad)
      throws CodigoNoExisteException, StockNegativoException {
    for (int i = 0; i < almacen.size(); i++) {
      if (i == almacen.size())
        throw new CodigoNoExisteException();
    }

    for (int i = 0; i < almacen.size(); i++) {
      if (almacen.get(i).getCodigo() == codigo) {
        almacen.get(i).setStock(almacen.get(i).getSotck() - cantidad);
      }
    }
  }

  /**
   * Modifica la descripción de un artículo.
   * 
   * @param codigo
   * @param descripcion
   * @throws CodigoNoExisteException
   */
  public void modDescripcion(int codigo, String descripcion)
      throws CodigoNoExisteException {
    for (int i = 0; i < almacen.size(); i++) {
      if (almacen.size() == i)
        throw new CodigoNoExisteException();
    }

    for (int i = 0; i < almacen.size(); i++) {
      if (almacen.get(i).getCodigo() == codigo) {
        almacen.get(i).setDescripcion(descripcion);
      }
    }
  }

  /**
   * Modifica el precio de compra de un artículo.
   * 
   * @param codigo
   * @param precioCompra
   * @throws CodigoNoExisteException
   * @throws PrecioNegativoException
   */
  public void modPrecioCompra(int codigo, double precioCompra)
      throws CodigoNoExisteException, PrecioNegativoException {
    for (int i = 0; i < almacen.size(); i++) {
      if (i == almacen.size())
        throw new CodigoNoExisteException();
    }

    if (precioCompra < 0)
      throw new PrecioNegativoException(
          "El precio de compra no puede ser negativo.");
  }

  /**
   * Modifica el precio de venta de un artículo.
   * 
   * @param codigo
   * @param precioVenta
   * @throws CodigoNoExisteException
   * @throws PrecioNegativoException
   */
  public void modPrecioVenta(int codigo, double precioVenta)
      throws CodigoNoExisteException, PrecioNegativoException {
    if (!(almacen.get(codigo - 1).getCodigo() == codigo))
      throw new CodigoNoExisteException();
    if (precioVenta < 0)
      throw new PrecioNegativoException(
          "El precio de venta no puede ser negativo.");
  }

  /**
   * Comprueba si el ArrayList está vacío o no.
   * 
   * @return vacio
   */
  public boolean isEmpty() {
    boolean vacio = almacen.isEmpty();
    return vacio;
  }
}
