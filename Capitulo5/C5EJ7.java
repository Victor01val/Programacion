/*
 *@Víctor Valverde Olmedo
 * Clave de caja fuerte
 */
package Capitulo5;

import java.util.Scanner;

public class C5EJ7 {

  public static void main(String args[]) {
    Scanner s = new Scanner(System.in); {
    int intentos = 0;
    int numero;
    boolean acertado = false;
    do {
      System.out.println("Introduce la clave de la caja fuerte: ");
      numero = s.nextInt();
      if (numero == 1254) {
        acertado = true;
      } else {
        System.out.println("Clave incorrecta");
      }
      intentos++;
    } while ((intentos <4) && (!acertado));
    if (acertado) {
      System.out.println("Has abierto la caja fuerte");
    } else {
      System.out.println("Has acabado las 4 oportunidades");
      s.close(); //Evitar errores
    }
  }
}
}
