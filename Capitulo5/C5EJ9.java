/*
 * Víctor Valverde Olmedo
 * Calcular numero de digitos de un numero introducido por teclado
 */
package Capitulo5;

import java.util.Scanner;

public class C5EJ9 {

  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    {
      System.out.println("Introduce un número");
      int numerointroducido = s.nextInt();
      int n = numerointroducido;
      int numeroDeDigitos = 1;
      while (numerointroducido > 10) {
        numerointroducido /= 10;
        numeroDeDigitos++;
      }
      System.out.println(n + " tiene " + numeroDeDigitos + " dígitos");

      s.close(); // Evitar errores
    }
  }
}