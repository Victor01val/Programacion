/*
 * Víctor Valverde Olmedo
 * Contar numeros positivos y negativos
 */
package Capitulo5;

import java.util.Scanner;

public class C5EJ13 {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    {
      System.out.println("Por favor, introduzca 10 números enteros: ");
      int numero = s.nextInt();
      int negativos = 0;
      int positivos = 0;
      for (int i = 0; i < 10; i++) {
        if (numero < 0) {
          negativos++;
        } else {
          positivos++;
        }
      }
      System.out.println("Ha introducido " + positivos + " positivos y " + negativos + " negativos");
    }
    s.close(); //Evitar errores
  }
}