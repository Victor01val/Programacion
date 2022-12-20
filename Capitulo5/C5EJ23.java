/*
 * Víctor Valverde Olmedo
 * Escribe un programa que permita ir introduciendo una serie indeterminada
de números mientras su suma no supere el valor 10000. Cuando esto último
ocurra, se debe mostrar el total acumulado, el contador de los números
introducidos y la media.
 */
package Capitulo5;

import java.util.Scanner;

public class C5EJ23 {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    double suma = 0;
    int n = 0;
    double contador = 0;
    double media = 0;

    do {
      System.out.print("Escribe un número: ");
      n = s.nextInt();
      suma += n;
      contador++;
    } while (suma <= 1000);

    media = suma / contador;

    System.out.println("La suma de todos los números introducidos son: " + suma);
    System.out.print("La media de todos los números introducidos son: " + media);
  }
}
