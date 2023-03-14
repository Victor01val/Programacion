package Capitulo9.Animales;
public class Ave extends Animales{

  Ave(String n, int e, int p) {
    super(n, e, p);
  
 
  }
  public void volar(){
    System.out.println("Estoy volando");
  }
  public void deslizar(){
    System.out.println("Estoy haciendo un nido");
  }
}