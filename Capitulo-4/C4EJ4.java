/* Víctor Valverde Olmedo EJ 4
 * Calcular sueldo por horas trabajadas
 */
import java.util.Scanner;
public class C4EJ4 {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    int sal = 0;
    System.out.println("Cuántas horas trabaja usted semanalmente");
    sal = s.nextInt();
    int operacion_uno = 40 * 12;
    int operacion_dos = ((sal - 40) * 16) + operacion_uno;
    if (sal <= 40) {
      System.out.println("El sueldo semanal que le corresponde es de " + operacion_uno);
    } else if (sal > 40) {
      System.out.println("El sueldo semanal que le corresponde es de " + operacion_dos);
    } else {
      System.out.println("Error");
      s.close(); // Evitar errores
    }
  }
}
