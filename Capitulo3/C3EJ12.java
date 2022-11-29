/*Víctor Valverde Olmedo EJ 12
 *Media examen
 */
package Capitulo3;
import java.util.Scanner;
public class C3EJ12 {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    {
      int num_uno = 0;
      int num_dos = 0;
      double resultado = 0;
      System.out.println("Cuanto has sacado en el primer examén?");
      num_uno = s.nextInt();
      System.out.println("¿Que nota media deseas tener?");
      num_dos = s.nextInt();
      resultado = (num_dos * 2) - num_uno;
      int resultado2 = (int) resultado;
      System.out.println("La nota que tienes que sacar es " + resultado2);
      s.close(); //Evitar errores
    }
  }
}