package Capitulo9.Animales;

public class Animales {
  private String nombre;
  private int edad;
  private int peso;

  // Constructores
  Animales(String n, int e, int p) {
    this.nombre = n;
    this.edad = e;
    this.peso = p;
  }

  // Getter
  public String getNombre() {
    return this.nombre;
  }

  public int getEdad() {
    return this.edad;
  }

  public int getPeso() {
    return this.peso;
  }
  public void dormir(){
    System.out.println("Zzzzzzz");

  }
  public void comer(){
    System.out.println("Mmmmmmm");
  }
  public void hablar(String h){
    System.out.println(h);
  }
  public void caminar(){
    System.out.println("Estoy caminando");
  }
}
