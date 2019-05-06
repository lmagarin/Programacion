package presentacion;

/**
 * Muestra los menús utilizados en la clase TestAlmacen
 * @author Damián Jesús Miquel Jiménez
 * @version 2.0
 * @see TestAlmacen.java
 */

public class Menu {	
	public static void menuPrincipal() {
		System.out.println("===========Menu Principal===========");
		System.out.println("Añadir Artículo ---------------- [1]");
		System.out.println("Borrar Artículo ---------------- [2]");
		System.out.println("Modificar Artículo ------------- [3]");
		System.out.println("Introducir Mercancía ----------- [4]");
		System.out.println("Extraer Mercancía -------------- [5]");
		System.out.println("Mostrar Artículos -------------- [6]");
		System.out.println("Salir del Progrma -------------- [7]");
	}
	
	public static void menuModificar() {
		System.out.println("===========Menu Modificar===========");
		System.out.println("Modificar Descripción ---------- [1]");
		System.out.println("Modificar Precio de Compra ----- [2]");
		System.out.println("Modificar Precio de Vetna ------ [3]");
		System.out.println("Modificar Sotck -----------------[4]");
	}
}
