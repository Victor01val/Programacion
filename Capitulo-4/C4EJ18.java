/*
 * Victor Valverde Olmedo 1 DAW TARDES
 * Primera cifra numero entero
 */

import java.util.Scanner;

public class C4EJ18 {

  public static void main(String args[]) {

    Scanner s = new Scanner(System.in);
    int num_uno = 0;
    int resultado = 0;

    System.out.println("Escribe un número cualquiera");
    num_uno = s.nextInt();

    resultado = num_uno / 10000;

    System.out.println("La primera cifra del número es: " + resultado);
    s.close(); // Evitar errores
  }
}
