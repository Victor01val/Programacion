/*
 *Víctor Valverde Olmedo Ejercicio 6
 Area triangulo
 */
import java.util.Scanner;
public class C3EJ6 {
  public static void main(String args[]) {
    try (Scanner s = new Scanner(System.in)) {
      System.out.println("Introduce un número");
      int numero_uno = s.nextInt();
      System.out.println("Introduce otro número");
      int numero_dos = s.nextInt();
      int multiplicacion = numero_uno * numero_dos;
      int division = multiplicacion / 2;
      System.out.println("El area de un triangulo es  " + division);
      s.close(); //Evitar errores
    }
  }
}
