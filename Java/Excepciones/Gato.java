/**
 * 
 * @author Cristina Prieto Jalao
 *
 */
public class Gato {
  
  private String color;
  private String raza;
  private String sexo;

  public Gato(String s) {
    this.sexo = s;
  }
  
  public void maulla() {
    System.out.println("Miauuuu");
  }
  
  public Gato apareaCon(Gato pareja) throws ExcepcionApareamientoImposible {
    if (this.sexo.equals(pareja.sexo)) {
      throw new ExcepcionApareamientoImposible("Dos gatos del mismo sexo no se pueden aparear");
    }
    
    if( (int)(Math.random() * ((2 - 1) + 1)) + 1 == 1) {
      return "hembra";
      }
      else {
        return "macho";
      }
  }
}
