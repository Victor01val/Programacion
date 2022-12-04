/*
 *@Víctor Valverde Olmedo
 * Suma y producto de los 10 primeros números. Ejemplo 3
 */
package Capitulo5;

import java.util.Scanner;

public class C5Ejemplo3 {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    {
      int suma = 0;
      int multiplicacion = 1;


      for (int i = 1; i <= 10; i++) {
        suma = suma + i;
        multiplicacion = multiplicacion * i;
      }
        System.out.println(suma);
        System.out.println(multiplicacion);
        s.close(); // Evitar errores
      
    }
  }
}
