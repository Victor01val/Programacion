
/*
 * Víctor Valverde Olmedo 1 DAW TARDES
 * Tienda banderas
 */
package Capitulo4;
import java.util.Scanner;

public class C4EJ25 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.print("Introduzca la altura de la bandera en cm: ");
    int altura = s.nextInt();
    System.out.print("Ahora introduzca la anchura: ");
    int anchura = s.nextInt();
    System.out.print("Quieres escudo bordado? (s/n): ");
    String conEscudo = s.next();
    String escudoCadena = "";
    double precioEscudo = 0;
    if (conEscudo.equalsIgnoreCase("S")) {
      escudoCadena = "Con escudo";
      precioEscudo = 2.5;
    } else if (conEscudo.equalsIgnoreCase("N")) {
      escudoCadena = "Sin escudo";
      precioEscudo = 0;
    }
    System.out.println("Aqui tiene el desglose  " +escudoCadena);
    System.out.println("Gracias. Aqui tiene el desglose de su compra.");
    System.out.printf("Bandera de %5d cm2: %5.2f euros\n", anchura * altura, (float) anchura * altura / 100);
    System.out.printf("%s: %5.2f euros\n", escudoCadena, precioEscudo);
    System.out.printf("Gastos de envío: %5.2f euros\n", 3.25);
    System.out.printf("Total: %5.2f \n", (float) anchura * altura / 100 + precioEscudo + 3.25);
    s.close(); //Evitar errores
  }
}
