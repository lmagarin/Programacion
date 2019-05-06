package gestion;

import excepciones.PrecioNegativoException;
import excepciones.StockNegativoException;
import excepciones.IvaInvalidoException;

/**
 * 
 * @author Damián Jesús Miquel Jiménez, Cristina Prieto Jalao
 *
 */

public class Articulo {

	private int codigo;
	private String descripcion;
	private double precioCompra;
	private double precioVenta;
	private int stock;
	private static int contador = 1;
	private String iva;


	Articulo(String descripcion, double precioCompra, double precioVenta,
			int stock, String tipoDeIva ) throws StockNegativoException, PrecioNegativoException, IvaInvalidoException {
		this.descripcion = descripcion;
		setPrecioCompra(precioCompra);
		setPrecioVenta(precioVenta);
		setStock(stock);
		this.codigo = generarCodigo();
		this.iva=iva;
	}

	/**
	 * Método para devolver el tipo de IVA de un artículo
	 * @return tipoDeIva
	 */
	public String getTipoDeIva() {
    return iva;
  }

	/**
	 * Método para modificar el valor de la variable tipoDeIva
	 * @param tipoDeIva
	 */
  public void setIva(String tipoDeIva)throws IvaInvalidoException {
    this.iva = tipoDeIva;
    if (tipoDeIva.equals(null))
      throw new IvaInvalidoException();
    
    this.iva = tipoDeIva;
  }

  /**
	 * Genera el código del artículo.
	 * 
	 * @return contador
	 */
	int generarCodigo() {
		return contador++;
	}

	/**
	 * Método para devolver el código de un artículo
	 * 
	 * @return codigo
	 */
	int getCodigo() {
		return codigo;
	}

	/**
	 * Método para asignar el código a un artículo.
	 * 
	 * @param incrementarCodigo
	 */
	void setCodigo(int incrementarCodigo) {
		this.codigo = incrementarCodigo;
	}

	/**
	 * Método para devolver el código de un artículo
	 * 
	 * @return descripcion
	 */
	String getDescripcion() {
		return descripcion;
	}

	/**
	 * Método para asignar el valor de la descripción a un artículo
	 * @param descripcion
	 */
	void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	/**
	 * Método para devolver el  precio de compra de un artículo
	 * @return precioCompra
	 */
	double getPrecioCompra() {
		return precioCompra;
	}

	/**
	 *Método para asginar el precio de compra de un artículo
	 * @param precioCompra
	 * @throws PrecioNegativoException
	 */
	void setPrecioCompra(double precioCompra) throws PrecioNegativoException {
		if (precioCompra < 0)
			throw new PrecioNegativoException(
					"El precio de compra no puede ser negativo.");

		this.precioCompra = precioCompra;
	}

	/**
	 * Método para devolver el precio de venta de un artículo
	 * @return precioVenta
	 */
	double getPrecioVenta() {
		return precioVenta;
	}

	/**
	 * Método que asigna el precio de venta de un artículo
	 * @param precioVenta
	 * @throws PrecioNegativoException
	 */
	void setPrecioVenta(double precioVenta) throws PrecioNegativoException {
		if (precioVenta < 0)
			throw new PrecioNegativoException(
					"El precio de venta no puede ser negativo.");
		this.precioVenta = precioVenta;
	}

	/**
	 * Método para devolver el stock de un artículo
	 * @return stock
	 */
	int getSotck() {
		return stock;
	}

	/**
	 * Método para asignar el valor del stock a un artículo
	 * @param stock
	 * @throws StockNegativoException
	 */
	void setStock(int stock) throws StockNegativoException {
		if (stock < 0)
			throw new StockNegativoException();
		this.stock = stock;
	}

	public String toString() {
		return "Código: " + codigo + "\nDescripción: " + descripcion
				+ "\nPrecio de compra: " + precioCompra + "\nPrecio de venta: "
				+ precioVenta + "\nStock: " + stock + "\nTipo de Iva: " + iva
				+ "\n------------------------------------";
	}

}
