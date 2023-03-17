package Capitulo9.Objetos.Pizza;

public class Pizza {
  private String tamano;
  private String tipo;
  private String estado;
  private static int totalPedidas = 0;
  private static int totalServidas = 0;

  // Constructores
  Pizza(String tamano, String tipo) {
    this.tamano = tamano;
    this.tipo = tipo;
    this.estado = "pedida";
    Pizza.totalPedidas++;
  }

  // Metodos
  public void sirve() {
    if (this.estado.equals("pedida")) {
    this.estado = "servida";
    Pizza.totalServidas++;
    } else {
    System.out.println("esa pizza ya se ha servido");
    }
  }
  public String toString() {
    return "pizza " + this.tipo + " " + this.tamano + ", " + this.estado;
  }

  public void pedir(String tamano, String tipo) {
    System.out.println("pizza " + tipo + " " + tamano);
  }

  public static int getTotalPedidas() {
    return Pizza.totalPedidas;
  }

  public static int getTotalServidas() {
    return Pizza.totalServidas;
  }
}
