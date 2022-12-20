/*
 * Víctor Valverde Olmedo
 * Realiza un conversor del sistema decimal al sistema de “palotes”
 */
package Capitulo5;

import java.util.Scanner;

public class C5EJ37 {

  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    int n = 0;
    int r = 0;
    int n2 = 0;
    int contador = 0;
    int contador2 = 0;
    System.out.print("Escribe un número: ");
    n = s.nextInt();

    while (n > 0) {
      r = (r * 10) + (n % 10);
      n /= 10;
      contador++;
    }

    do {
      n2 = r % 10;
      r /= 10;
      contador2++;
      switch (n2) {
        case (1):
          System.out.print("|");
          break;
        case (2):
          System.out.print("||");
          break;
        case (3):
          System.out.print("|||");
          break;
        case (4):
          System.out.print("||||");
          break;
        case (5):
          System.out.print("|||||");
          break;
        case (6):
          System.out.print("||||||");
          break;
        case (7):
          System.out.print("|||||||");
          break;
        case (8):
          System.out.print("||||||||");
          break;
        case (9):
          System.out.print("|||||||||");
          break;

        default:
      }
      if (contador > contador2) {
        System.out.print("-");
      }
      n2 = 0;
    } while (r > 0);

  }
}
