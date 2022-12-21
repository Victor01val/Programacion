/*
 * Víctor Valverde Olmedo
 * Adivinar numero al azar entre 0 y 100
 */
package Capitulo6;

import java.util.Scanner;

public class C6EJ6 {
  public static void main(String args[]) {

    Scanner s = new Scanner(System.in);
    {
      int a = 0;
      int n = 0;
      int o = 0;
      int contador = 0;

      a = (int) (Math.random() * 101);

      do {
        System.out.print("Escribe el número que creas que es el correcto: ");
        n = s.nextInt();
        System.out.println("");
        contador++;
        o = 5 - contador;
        if (n != a) {
          if (n > a) {
            System.out.println("El número introducido es mayor al número secreto");
          } else {
            System.out.println("El número introducido es menor al número secreto");
          }
          System.out.println("");
          System.out.println("Te quedan: " + o + " oportunidades");
          System.out.println("");

        }

      } while (contador != 5 && n != a);
      System.out.println("");
      if (n != a) {
        System.out.print("Lo siento no has acertado el número.... El número era: " + a);
      } else {
        System.out.print("¡Enhorabuena has acertado el número!");
      }

    }
    s.close(); // Evitar errores
  }
}
