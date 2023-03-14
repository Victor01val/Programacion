package Capitulo9.Animales;

public class Perro extends Animales{

  Perro(String n, int e, int p) {
    super(n, e, p);

  }
  public void moverCola(){
    System.out.println("Muevo la cola");
  }
  public void moverOrejas(){
    System.out.println("Muevo las orejas");
  }
}
