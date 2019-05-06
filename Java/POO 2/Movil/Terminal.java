/**
 * Implementa la clase Terminal. Un terminal tiene asociado un número. Los
 * terminales se pueden llamar unos a otros y el tiempo de conversación corre
 * para ambos. A continuación se proporciona el contenido del main y el resultado
 * que debe aparecer por pantalla.
 * Contenido del main
 * Terminal t1 = new Terminal("678 11 22 33");
 * Terminal t2 = new Terminal("644 74 44 69");
 * Terminal t3 = new Terminal("622 32 89 09");
 * Terminal t4 = new Terminal("664 73 98 18");
 * System.out.println(t1);
 * System.out.println(t2);
 * t1.llama(t2, 320);
 * t1.llama(t3, 200);
 * System.out.println(t1);
 * System.out.println(t2);
 * System.out.println(t3);
 * System.out.println(t4);
 * Salida
 * Nº 678 11 22 33 - 0s de conversación
 * Nº 644 74 44 69 - 0s de conversación
 * Nº 678 11 22 33 - 520s de conversación
 * Nº 644 74 44 69 - 320s de conversación
 * Nº 622 32 89 09 - 200s de conversación
 * Nº 664 73 98 18 - 0s de conversación
 * @author Cristina Prieto Jalao
 *
 */
public class Terminal {
  private String numero;  //Numero del terminal 
  private int tiempoDeConversacion; //Tiempo de conversación
  
  //Creamos el objeto terminal con sus atributos
  Terminal(String numero){
    this.numero=numero;
    this.tiempoDeConversacion=0;
  }
  
  //Método para obtener el número 
  public String getNumero() {
    return this.numero;
  }
  
  //Método para modificar el número
  public void setNumero(String numero) {
    this.numero=numero;
  }
  
  //Método para obtener el tiempo de conversación
  public int getTiempoDeConversacion() {
    return this.tiempoDeConversacion;
  }
  
  //Método para modificar el tiempo de conversación
  public void setTiempoDeConversacion(int tiempoDeConversacion) {
    this.tiempoDeConversacion=tiempoDeConversacion;
  }
  
  //Método para llamar a un terminal
  public void llama(Terminal t, int segundosDeLlamada) {
    this.tiempoDeConversacion+=segundosDeLlamada;
    t.tiempoDeConversacion+=segundosDeLlamada;
  }
}
