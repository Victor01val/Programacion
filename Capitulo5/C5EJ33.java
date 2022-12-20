/*
 * Víctor Valverde Olmedo
 * Realiza un programa que pinte la letra U por pantalla hecha con asteriscos. El
programa pedirá la altura. Fíjate que el programa inserta un espacio y pinta
dos asteriscos menos en la base para simular la curvatura de las esquinas
inferiores.

 */
package Capitulo5;

import java.util.Scanner;

public class C5EJ33 {

  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    int h = 0;

    System.out.print("Introduce la altura de la U: ");
    h = s.nextInt();

    for (int i = 1; i < h; i++) {
      System.out.print("*");
      for (int j = 1; j <= h - 2; j++) {
        System.out.print(" ");
      }
      System.out.print("*");
      System.out.println("");
    }
    for (int k = 0; k <= 0; k++) {
      System.out.print(" ");
      for (int l = 1; l <= h - 2; l++) {
        System.out.print("*");
        s.close(); //Evitar errores
      }
    }
  }
}
