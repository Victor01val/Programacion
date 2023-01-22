/*
 * Víctor Valverde Olmedo
 */
package Capitulo7;

import java.util.Scanner;

public class C7Ejemplo5 {
  public static void main(String args[]) {

    Scanner s = new Scanner(System.in);
    {
      String[] color = { "rojo", "amarillo", "verde", "blanco", "azul", "negro" };
      System.out.println("Generador aleatorio de banderas");

      System.out.print("¿Cuántas franjas quiere para la bandera? ");
      int franjas = Integer.parseInt(s.nextLine());
      System.out.println("--------------");
      for (int i = 0; i < franjas; i++) {
        System.out.println(color[(int) (Math.random() * 6)]);
        System.out.println("--------------");
      }
    }
    s.close(); // Evitar errores
  }

}
