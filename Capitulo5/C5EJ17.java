/*
 * Víctor Valverde Olmedo
 */
package Capitulo5;

import java.util.Scanner;

public class C5EJ17 {

  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    {
      int suma = 0;
      int n = 0;
      int i = 0;
      System.out.println("Introduce un número por teclado");
      n = s.nextInt();
      for (i = 0; i <= 100; i++) {
        suma += (n + i);
      }
      System.out.println(suma);
    }
  
    s.close(); // Evitar errores
  }
}
