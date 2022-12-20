/*
 * Víctor Valverde Olmedo
 * Escribe un programa que, dado un número entero positivo, diga cuáles son y
cuánto suman los dígitos pares. Los dígitos pares se deben mostrar en orden, de
izquierda a derecha. Usa long en lugar de int donde sea necesario para admitir
números largos.

 */
package Capitulo5;

import java.util.Scanner;

public class C5EJ32 {

  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    int n = 0;
    int r = 0;
    int contador = 0;
    int v = 0;
    int suma = 0;

    System.out.print("Porfavor introduzca un número entero positivo: ");
    n = s.nextInt();

    while (n > 0) {
      v = (v * 10) + (n % 10);
      n /= 10;
    }

    while (v > 0) {
      r = (v % 10);
      if (r % 2 == 0) {
        System.out.print(r + " ");
        suma += r;
      }
      v /= 10;
    }
    System.out.print("");
    System.out.print("La suma de los números pares son: " + suma);
  }
}
