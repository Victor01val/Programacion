/*
 * Víctor Valverde Olmedo
 * Numero entero y tabla de multiplicar
 */

package Capitulo5;

import java.util.Scanner;

public class C5EJ8 {

  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    {
      System.out.print("Introduzca un número entero y te mostrare la tabla de multiplicar: ");
      int numeroIntroducido = s.nextInt();
      for (int i = 0; i <= 10; i++) {
        System.out.println(numeroIntroducido + " x " + i + " = " + numeroIntroducido * i);
        s.close(); // Evitar errores
      }
    }

  }
}
