/*
 *@Víctor Valverde Olmedo
 * Elevar valor A y B. Ejemplo 5
 */
package Capitulo5;

import java.util.Scanner;

public class C5Ejemplo5 {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    {
      System.out.println("Elige el número A");
      int A = s.nextInt();
      System.out.println("Elige el númer B");
      int B = s.nextInt();
      int producto = 1;

      for (int i = 1; i <= B; i++) {
        producto = producto * A;

      }
      System.out.println(producto);

      s.close(); // Evitar errores

    }
  }
}