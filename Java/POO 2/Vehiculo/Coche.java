public class Coche extends Vehiculo{
  
  //Cilindrada del coche
  private int cilindrada;
  
  public Coche(int c) {
    super();
    this.cilindrada=c;
  }
  
  public void quemaRueda() {
    System.out.println("Estoy quemando rueda");
  }
}
