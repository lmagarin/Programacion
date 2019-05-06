
public class PruebaTerminal {
  public static void main (String [] args) {
    //Creamos los objetos
    Terminal t1= new Terminal("678 11 22 33");
    Terminal t2= new Terminal("644 74 44 68");
    Terminal t3= new Terminal("622 32 89 09");
    Terminal t4= new Terminal("664 73 98 18");
    
    //Imprimimos los terminales antes de realizar ninguna llamada
    System.out.println(t1);
    System.out.println(t2);
    
    //Realizamos llamadas
    t1.llama(t2, 320);
    t1.llama(t3, 200);
    
    //Imprimimos los terminales después de realizar las llamadas
    System.out.println(t1);
    System.out.println(t2);
    System.out.println(t3);
    System.out.println(t4);
  }

}
