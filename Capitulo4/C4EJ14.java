/*
 *Víctor Valverde Olmedo
 */
package Capitulo4;
import java.util.Scanner;

public class C4EJ14 {

  public static void main(String args[]) {

    Scanner s = new Scanner(System.in);
    int num_uno = 0;

    System.out.println("Escribe un número al azar");
    num_uno = s.nextInt();

    if ((num_uno % 2) == 0) {
      System.out.print("El número introducido es par");
    } else {
      System.out.print("El número es impar");
    }

    if ((num_uno % 5) == 0) {
      System.out.println(" y es divisible entre 5.");
    } else {
      System.out.println(" y no es divisible entre 5.");
      s.close(); // Evitar errores
    }

  }
}
