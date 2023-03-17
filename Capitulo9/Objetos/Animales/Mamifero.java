package Capitulo9.Objetos.Animales;

public class Mamifero extends Animales{

  Mamifero(String n, int e, int p) {
    super(n, e, p);
  
  }
  public void moverCola(){
    System.out.println("Muevo la cola");
  }
  public void moverOrejas(){
    System.out.println("Muevo las orejas");
  }
}
