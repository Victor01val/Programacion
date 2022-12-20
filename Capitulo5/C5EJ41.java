/*
 * Víctor Valverde Olmedo
 * Escribe un programa que diga cuántos dígitos pares y cuántos dígitos impares
hay dentro de un número. Se recomienda usar long en lugar de int ya que el
primero admite números más largos.
 */
package Capitulo5;

import java.util.Scanner;

public class C5EJ41 {

  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    int n = 0;
    int contador = 0;
    int n2 = 0;
    int contadorpar = 0;
    int contadorimpar = 0;
    int r2 = 0;
    int r = 0;

    System.out.print("Escribe un número: ");
    n = s.nextInt();

    n2 = n;
    if (n2 == 0) {
      contador = 1;
    }

    while (n2 > 0) {
      r = (r * 10) + (n2 % 10);
      n2 /= 10;
      contador++;
    }
    for (int i = 0; i < contador; i++) {
      r2 = r % 10;
      if (r2 % 2 == 0) {
        contadorpar++;
      } else {
        contadorimpar++;
      }
      r /= 10;
    }
    System.out.println("El " + n + " tiene " + contadorpar + " números pares.");
    System.out.print("El " + n + " tiene " + contadorimpar + " números impares.");
  }
}
