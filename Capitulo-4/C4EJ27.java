/*
 * Victor Valverde Olmedo
 * Factura de una tarta
 */
import java.util.Scanner;

public class C4EJ27 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Elija un sabor: manzana, fresa o chocolate: ");
    String sabor = s.nextLine();
    double psabor = 0;
    double pnata = 0;
    double pnombre = 0;
    String tipodechocolate = "";
    switch (sabor) {
      case "manzana":
        psabor = 18;
        break;
      case "fresa":
        psabor = 16;
        break;
      case "chocolate":
        System.out.print("Que tipo de chocolate quieres? (negro o blanco): ");
        tipodechocolate = s.nextLine();
        if (tipodechocolate.equals("negro")) {
          psabor = 14;
        } else if (tipodechocolate.equals("blanco")) {
          psabor = 15;
        }
        break;
      default:
    }
    System.out.print("Quieres nata? (si o no): ");
    boolean conNata = s.nextLine().equals("si");
    System.out.print("Quiere ponerle un nombre? (si o no): ");
    boolean conNombre = s.nextLine().equals("si");
    System.out.print("Tarta de " + sabor);
    if (sabor.equals("chocolate")) {
      System.out.print(" " + tipodechocolate);
    }
    System.out.printf(": %.2f euros\n", psabor);
    if (conNata) {
      pnata = 2.5;
      System.out.printf("Con nata: %.2f euros\n", pnata);
    }
    if (conNombre) {
      pnombre = 2.75;
      System.out.printf("Con nombre: %.2f euros\n", pnombre);
    }
    System.out.printf("Total: %.2f euros\n", psabor + pnata + pnombre);
    s.close(); // Evitar errores
  }
}
