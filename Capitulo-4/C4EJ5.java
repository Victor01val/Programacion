
/* Víctor Valverde Olmedo EJ 5
 * Calcular ecuacion
 */
import java.util.Scanner;
public class C4EJ5 {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    double num_uno = 0;
    double num_dos = 0;
    double resultado = 0;
    System.out.println("Este programa calcula ecuaciones tipo: ax + b = 0");
    System.out.println("Escribe el valor de a");
    num_uno = s.nextInt();
    if (num_uno == 0) {
      System.out.println("Esa ecuación no tiene solución real");
      s.close(); // Evitar errores
      return;
    }
    System.out.println("Escribe el valor de b");
    num_dos = s.nextInt();
    resultado = (-num_dos / num_uno);
    System.out.println("El resultado de la ecuación es: x = " + resultado);
    s.close(); // Evitar errores
  }
}
