/*
 * Víctor Valverde Olmedo
 * Muestra tres apuestas de la quiniela
 */
package Capitulo6;

import java.util.Scanner;

public class C6EJ7 {

  public static void main(String args[]) {

    Scanner s = new Scanner(System.in);
    {
      int a = 0;
      String r = "";
      for (int i = 1; i <= 3; i++) {
        System.out.print("Apuesta nº" + i + ": ");
        System.out.println("");
        for (int j = 1; j <= 15; j++) {
          a = (int) (Math.random() * 3) + 1;

          switch (a) {
            case (3):
              r = "X";
              break;
            default:
              r = String.valueOf(a);
          }
          System.out.println("fila " + j + ": " + r);
        }
        System.out.println();
      }

    }
    s.close(); // Evitar errores
  }
}
