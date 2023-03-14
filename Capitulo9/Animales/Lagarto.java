package Capitulo9.Animales;

public class Lagarto extends Animales{

  Lagarto(String n, int e, int p) {
    super(n, e, p);
   
  }
  public void esconder(){
    System.out.println("Estoy escondiendome");
  }
  public void atacar(){
    System.out.println("Estoy atacando");
  }
}
