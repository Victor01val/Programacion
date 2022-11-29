/* Víctor Valverde Olmedo Ejemplo 2
 * Pais e idiomas
 */
package Capitulo4;
import java.util.Scanner;
public class C4Ejemplo2 {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    {
      String miPais = "Brasil";
      if ("Brasil".equals(miPais)) {
        System.out.println("\033[91m El idioma es el portugués \033[39;49m");
      } else {
        System.out.println("\033[32m distintos \033[39;49m");
        s.close(); // Evitar errores
      }
    }
  }
}
