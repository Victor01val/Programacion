/*
 *Víctor Valverde Olmedo Ejercicio 5
 Area rectangulo
 */
package Capitulo3;
import java.util.Scanner;
public class C3EJ5 {
  public static void main(String args[]) {
    try (Scanner s = new Scanner(System.in)) {
      System.out.println("Dime un número");
      int numero_uno = s.nextInt();
      System.out.println("Dime otro número");
      int numero_dos = s.nextInt();
      int Producto = numero_uno * numero_dos;
      System.out.println("El area de un rectangulo es " + Producto);
      s.close(); //Evitar errores
    }
  }
}
