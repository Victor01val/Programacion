/*
 * Víctor Valverde Olmedo
 * Cambiara los valores de uno a otro de un array
 */
package Capitulo7;

import java.util.Scanner;

public class C7EJ7 {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    {
      int[] n = new int[100];
      for (int i = 0; i < 100; i++) {
        n[i] = (int) (Math.random() * 20);
        System.out.print(n[i]);
        System.out.print("   ");
      }
      System.out.println("Introduce un valor");
      int valor1 = s.nextInt();
      System.out.println("Introduce otro valor");
      int valor2 = s.nextInt();
      for (int j = 0; j < 100; j++) {
        if (n[j] == valor1) {
          n[j] = valor2;
          System.out.print("\"" + n[j] + "\" ");
        } else {
          System.out.print(n[j] + " ");
        }
      }
    }
    s.close(); //Evitar errores
  }
}
