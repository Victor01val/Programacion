/*
 * Víctor Valverde Olmedo
 */
package Capitulo7;

import java.util.Scanner;

public class C7Ejemplo1 {

  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    {
      int[] num = new int[100];
      num[0] = (int) Math.pow(2, 0);
      num[1] = (int) Math.pow(2, 1);
      num[2] = (int) Math.pow(2, 2);
      num[3] = (int) Math.pow(2, 3);
      num[4] = (int) Math.pow(2, 4);
      num[5] = (int) Math.pow(2, 5);
      num[6] = num[2] * 10;
      num[7] = num[2] / 10;
      num[8] = num[0] + num[1] + num[2];
      num[9] = num[8];
      System.out.print("Los valores del array n son los siguientes");
      System.out.print(num[0] + ", " + num[1] + ", " + num[2] + ", " + num[3] + ", " + num[4] + ", " + num[5] + ", "
          + num[6] + ", " + num[7] + ", " + num[8] + ", " + num[9] + ", ");
      for (int i = 0; i < 10; i++) {
        System.out.println("" + num[i]);
      }
      System.out.println("Dime la posicion que quieres mostrar en elemento: ");
      int posicion = s.nextInt();
      System.out.println(" " + num[posicion]);
      int suma = num[0] + num[2] + num[4] + num[6] + num[8];
      System.out.println("La suma de las posiciones pares es : " + suma);

    }
    s.close(); // Evitar errores
  }
}