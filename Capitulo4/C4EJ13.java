
/*
 * Víctor Valverde Olmedo 1 DAW
 * .
 */
package Capitulo4;
import java.util.Scanner;

public class C4EJ13 {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    int a = 0;
    int b = 0;
    int c = 0;

    System.out.println("Escriba usted el primer número");
    a = s.nextInt();

    System.out.println("Escriba usted el segundo número");
    b = s.nextInt();

    System.out.println("Escriba usted el tercer número");
    c = s.nextInt();

    if ((a <= b) && (a <= c)) {
      System.out.print(a + " < ");
      if (b <= c) {
        System.out.print(b + " < " + c);
      } else {
        System.out.print(c + " < " + b);
      }
    } else if ((b <= a) && (b <= c)) {
      System.out.print(b + " < ");
      if (a <= c) {
        System.out.print(a + "<" + c);
      } else {
        System.out.print(c + "<" + a);
      }
    } else if ((c <= a) && (c <= b)) {
      System.out.print(c + " < ");
      if (a <= b) {
        System.out.print(a + " < " + b);
      } else {
        System.out.print(b + " < " + a);
        s.close(); //Evitar errores
      }
    }
  }
}
