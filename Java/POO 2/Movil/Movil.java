/**
 * Implementa la clase Movil como subclase de Terminal (la clase del ejercicio
 * anterior que ya no hace falta modificar). Cada móvil lleva asociada una tarifa
 * que puede ser “rata”, “mono” o “bisonte”. El coste por minuto es de 6, 12 y
 * 30 céntimos respectivamente. Se tarifican los segundos exactos. Obviamente,
 * cuando un móvil llama a otro, se le cobra al que llama, no al que recibe la
 * llamada. A continuación se proporciona el contenido del main y el resultado
 * que debe aparecer por pantalla. Para que el total tarificado aparezca con dos
 * decimales, puedes utilizar DecimalFormat.
 * Contenido del main
 * Movil m1 = new Movil("678 11 22 33", "rata");
 * Movil m2 = new Movil("644 74 44 69", "mono");
 * Movil m3 = new Movil("622 32 89 09", "bisonte");
 * System.out.println(m1);
 * System.out.println(m2);
 * m1.llama(m2, 320);
 * m1.llama(m3, 200);
 * m2.llama(m3, 550);
 * System.out.println(m1);
 * System.out.println(m2);
 * System.out.println(m3);
 * Salida
 * Nº 678 11 22 33 - 0s de conversación - tarificados 0,00 euros
 * Nº 644 74 44 69 - 0s de conversación - tarificados 0,00 euros
 * Nº 678 11 22 33 - 520s de conversación - tarificados 0,52 euros
 * Nº 644 74 44 69 - 870s de conversación - tarificados 1,10 euros
 * Nº 622 32 89 09 - 750s de conversación - tarificados 0,00 euros
 * 
 * @author Cristina Prieto Jalao
 *
 */

import java.text.DecimalFormat;

public class Movil extends Terminal{
  
  //Atributos de la clase Movil
  private String tarifa;
  private double totalTarificado;
  
  //Objeto Movil
  public Movil (String numero, String tarifa) {
    super(numero);
    this.tarifa=tarifa;
    this.totalTarificado=0;
  }
  
  //Método para llamar
  public void llama(Terminal t, int segundosDeLlamada) {
    super.llama(t, segundosDeLlamada);
    double minutos = (double) segundosDeLlamada / 60;

   //Switch para asociar a cada tarifa su precio correspondiente
   switch (this.tarifa) {
     case "rata":
       this.totalTarificado += minutos * 0.06;
       break;
     case "mono":
       this.totalTarificado += minutos * 0.12;
       break;
     case "bisonte":
       this.totalTarificado += minutos * 0.30;
       break;
     default:
   }
  }
  
  public String toString() {
    DecimalFormat formatoEuros = new DecimalFormat("0.00");
    return "Nº " + this.getNumero() + " - " + this.getTiempoDeConversacion() + "s de conversación - tarificados " + formatoEuros.format(this.totalTarificado) + " euros";
  }

}
