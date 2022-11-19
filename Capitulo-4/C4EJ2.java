/* Víctor Valverde Olmedo EJ 2
 * Responder dependiendo de la hora
 */
import java.util.Scanner;
public class C4EJ2 {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    int hour = 0;
    System.out.println("Dime la hora del día");
    hour = s.nextInt();
    if ((hour>=6) && (hour<=12)){
      System.out.println("¡Buenos dias!");
    } else if ((hour>=13) && (hour<=20)){
      System.out.println("¡Buenas tardes!");
    } else if ((hour>=21) && (hour<=23)){
      System.out.println("¡Buenas noches!");
    } else if ((hour>=0) && (hour<=5)){
      System.out.println("¡Buenas noches!");
    } else {
      System.out.println("¡Error en el sistema!");
      s.close();
  }
 }
}