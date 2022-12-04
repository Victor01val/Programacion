/*
 *@Víctor Valverde Olmedo
 * Suma de numeros pares e impares. Ejemplo 4
 */
package Capitulo5;

import java.util.Scanner;

public class C5Ejemplo4 {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    {
      int pares = 0;
      int impares = 0;
    
      for (int i = 100; i <= 200; i++) {
        if(i%2==0) {
        pares = pares + i;
        }
        else  {
          impares = impares + i;
        }
        
      }
      System.out.println("La suma de numeros pares es " +pares);
      System.out.println("La suma de numeros impares es " +impares);
      s.close(); // Evitar errores

    }
  }
}
