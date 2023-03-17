package Capitulo9.Objetos.Animales;

public class Pinguino extends Animales{

  Pinguino(String n, int e, int p) {
    super(n, e, p);
   
  }
  public void deslizar(){
    System.out.println("Estoy deslizandome por el hielo");
  }
}
