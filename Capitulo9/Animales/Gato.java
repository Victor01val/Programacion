package Capitulo9.Animales;

public class Gato extends Animales {

  Gato(String n, int e, int p) {
    super(n, e, p);
  
  }
  public void moverCola(){
    System.out.println("Muevo la cola");
  }
  public void moverOrejas(){
    System.out.println("Muevo las orejas");
  }
}
