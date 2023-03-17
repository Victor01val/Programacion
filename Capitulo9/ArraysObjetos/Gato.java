package Capitulo9.ArraysObjetos;



public class Gato {
  private String nombre; 
  private int sardinas; 

  
  public Gato(String nombre, int sardinas) {
    this.nombre = nombre;
    this.sardinas = sardinas;
  }


  public void come(int s) {
    System.out.print(nombre + ": "); 
    if (s <= sardinas) { 
      for (int i = 0; i < s; i++) { 
        System.out.print("Ñam... "); 
      }
      System.out.println(); 
      sardinas -= s; 
    } else { 
      System.out.println("Ya no hay sardinas"); 
    }
  }

  public static void main(String args[]) {
    Gato gato = new Gato("Tom", 10);
  
 
    gato.come(3);

  
    gato.come(5);

    
    gato.come(4);
  }
}
