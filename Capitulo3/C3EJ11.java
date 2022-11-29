/*
 *Víctor Valverde Olmedo Ejercicio 11
 Conversor KB a MB
 */
package Capitulo3;
import java.util.Scanner;
public class C3EJ11 {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    {
      System.out.println("Introduce un número de KB");
      int numero = s.nextInt();
      int resultado = numero / 1000;
      System.out.println("El resultado es " + resultado + " MB");
      s.close(); //Evitar errores
    }
  }
}
