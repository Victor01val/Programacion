/*
 *Víctor Valverde Olmedo Ejercicio 10
 Conversor MB a KB
 */
import java.util.Scanner;
public class C3EJ10 {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    {
      System.out.println("Introduce un número de MB");
      int numero = s.nextInt();
      int resultado = numero * 1000;
      System.out.println("El resultado es " + resultado + " KB");
      s.close(); //Evitar errores
    }
  }
}
