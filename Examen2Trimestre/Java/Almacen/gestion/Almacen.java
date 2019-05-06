package gestion;
import java.util.ArrayList;
import excepciones.*;

/**
 * Almacen
 * @author Cristina Prieto Jalao
 */

public class Almacen {
	private ArrayList<Articulo> almacen = new ArrayList<Articulo>();

	/**
	 * Crea un artículo con los datos que recive.
	 * @param descripcion
	 * @param precioCompra
	 * @param precioVenta
	 * @param stock
	 * @param tipoDeIva
	 * @throws PrecioNegativoException
	 * @throws StockNegativoException
	 * @throws TipoDeIvaException 
	 */
	public void crear(String descripcion, double precioCompra,
			double precioVenta, int stock, String tipoDeIva)
			throws PrecioNegativoException, StockNegativoException, IvaInvalidoException {
		almacen.add(
				new Articulo(descripcion, precioCompra, precioVenta, stock, tipoDeIva));
	}

	/**
   * Eliminia un elemento del ArrayList.
   * @param codigo
   * @throws CodigoNoExisteException
   */
  public void eliminar(int codigo) throws CodigoNoExisteException {
    if (index(codigo) != -1) {
      almacen.remove(index(codigo));
    } else {
      throw new CodigoNoExisteException();
    }
  }

  /**
   * Muestra el listado de los artículos del almacen.
   * @return almacen
   */
  public void inventario() {
    for (Articulo articulos : almacen) {
      System.out.println(articulos);
    }
  }

  /**
   * Modifica el stock de un artículo.
   * @param codigo
   * @param stock
   * @throws CodigoNoExisteException
   * @throws StockNegativoException
   */
  public void modStock(int codigo, int stock)
      throws CodigoNoExisteException, StockNegativoException {
    if (index(codigo) != -1) {
      if (stock < 0)
        throw new StockNegativoException();
      almacen.get(index(codigo)).setStock(stock);
    } else {
      throw new CodigoNoExisteException();
    }
  }

  /**
   * Aumenta el número de existencias de un artículo.
   * @param codigo
   * @param cantidad
   * @throws StockNegativoException
   */
  public void incrementarStock(int codigo, int cantidad)
      throws CodigoNoExisteException, StockNegativoException {
    if (index(codigo) != -1) {
      if ((almacen.get(index(codigo)).getSotck() + cantidad) < 0)
        throw new StockNegativoException();
      almacen.get(index(codigo))
          .setStock(almacen.get(index(codigo)).getSotck() + cantidad);
    } else {
      throw new CodigoNoExisteException();
    }
  }

  /**
   * Reduce el número de existencias de un artículo.
   * @param codigo
   * @param cantidad
   * @throws CodigoNoExisteException
   * @throws StockNegativoException
   */
  public void decrementarStock(int codigo, int cantidad)
      throws CodigoNoExisteException, StockNegativoException {
    if (index(codigo) != -1) {
      if ((almacen.get(index(codigo)).getSotck() - cantidad) < 0)
        throw new StockNegativoException();
      almacen.get(index(codigo))
          .setStock(almacen.get(index(codigo)).getSotck() - cantidad);
    } else {
      throw new CodigoNoExisteException();
    }
  }

  /**
   * Modifica la descripción de un artículo.
   * @param codigo
   * @param descripcion
   * @throws CodigoNoExisteException
   */
  public void modDescripcion(int codigo, String descripcion)
      throws CodigoNoExisteException {
    if (index(codigo) != -1) {
      almacen.get(index(codigo)).setDescripcion(descripcion);
    } else {
      throw new CodigoNoExisteException();
    }
  }

  /**
   * Modifica el precio de compra de un artículo.
   * @param codigo
   * @param precioCompra
   * @throws CodigoNoExisteException
   * @throws PrecioNegativoException
   */
  public void modPrecioCompra(int codigo, double precioCompra)
      throws CodigoNoExisteException, PrecioNegativoException {
    if (index(codigo) != -1) {
      if (precioCompra < 0)
        throw new PrecioNegativoException(
            "\nEl precio de compra no puede ser negativo.");
      almacen.get(index(codigo)).setPrecioCompra(precioCompra);
    } else {
      throw new CodigoNoExisteException();
    }
  }

  /**
   * Modifica el precio de venta de un artículo.
   * @param codigo
   * @param precioVenta
   * @throws CodigoNoExisteException
   * @throws PrecioNegativoException
   */
  public void modPrecioVenta(int codigo, double precioVenta)
      throws CodigoNoExisteException, PrecioNegativoException {
    if (index(codigo) != -1) {
      if (precioVenta < 0)
        throw new PrecioNegativoException(
            "\nEl precio de venta no puede ser negativo.");
      almacen.get(index(codigo)).setPrecioVenta(precioVenta);
    } else {
      throw new CodigoNoExisteException();
    }
  }

  /**
   * Método para modificar el tipo de iva de un artículo.
   * @param codigo
   * @param iva
   * @throws CodigoNoExisteException
   * @throws IvaInvalidoException
   */
  public void modIva(int codigo, String iva)
      throws CodigoNoExisteException, IvaInvalidoException {
    if (index(codigo) != -1) {
      if (iva.equals("Null"))
        throw new IvaInvalidoException();
      almacen.get(index(codigo)).setIva(iva);
    } else {
      throw new CodigoNoExisteException();
    }
  }

  /**
   * Método para comprobar si el ArrayList está vacío o no.
   * @return vacio
   */
  public boolean vacio() {
    boolean vacio = almacen.isEmpty();
    return vacio;
  }

  /**
   * Método para comprobar que el código introducido se encuentra en el ArrayList y
   * devuelve el índice del mismo en el ArrayList. Si no lo encuentra, 
   * devuelve -1
   * @param codigo
   * @return indexArticulo
   */
  private int index(int codigo) {
    int i;
    boolean existe = false;
    for (i = 0; i < almacen.size(); i++) {
      if (almacen.get(i).getCodigo() == codigo) {
        existe = true;
        break;
      }
    }

    if (i == almacen.size() && i != 0) {
      existe = false;
    }

    if (existe == true) {
      return i;
    } else {
      return -1;
    }
  }
}
