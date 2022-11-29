/*
 * Víctor Valverde Olmedo
 * Lista de numeros naturales. Ejemplo 3
 */
package Capitulo5;

import java.util.Scanner;

public class C5Ejemplo2 {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    {
      System.out.println("Introduce un numero límite");
      int num_limite = s.nextInt();
      System.out.println("Lista de numeros naturales hasta el que eligas");

      for (int i = 0; i <= num_limite; i++) {
        System.out.println(i);
        s.close(); // Evitar errores
      }
    }
  }
}
