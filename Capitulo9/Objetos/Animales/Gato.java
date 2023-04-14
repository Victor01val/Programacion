package Capitulo9.Objetos.Animales;

public class Gato extends Animales {
  public static char[] setColor;
  private String nombre;
  private String color;
  private String raza;

  public Gato() {
    super();
  }

  public void moverCola() {
    System.out.println("Muevo la cola");
  }

  public void moverOrejas() {
    System.out.println("Muevo las orejas");

  }

  public void comer(int sardinas) {
    System.out.println("Estoy comiendo");
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public String getRaza() {
    return raza;
  }

  public void setRaza(String raza) {
    this.raza = raza;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public void setEdad(String string) {
  }

}
