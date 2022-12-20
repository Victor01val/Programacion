/*
 * Víctor Valverde Olmedo
 * Realiza un programa que pinte la letra L por pantalla hecha con asteriscos. El
programa pedirá la altura. El palo horizontal de la L tendrá una longitud de la
mitad (división entera entre 2) de la altura más uno.
 */
package Capitulo5;

import java.util.Scanner;

public class C5EJ31 {

  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    int n = 0;
    int r = 0;

    System.out.print("Introducimos la altura de la letra L: ");
    n = s.nextInt();

    for (int i = 0; i < n; i++) {
      System.out.println("*");
    }
    r = (n / 2) + 1;
    for (int j = 0; j < r; j++) {
      System.out.print("*");
      s.close(); //Evitar errores
    }
  }
}
