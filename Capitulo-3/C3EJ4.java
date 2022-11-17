/*
 *Víctor Valverde Olmedo Ejercicio 4
 Operaciones
 */
import java.util.Scanner;
public class C3EJ4 {
  public static void main(String args[]) {
    try (Scanner s = new Scanner(System.in)) {
      System.out.println("Introduce un número");
      int numero_uno = s.nextInt();
      System.out.println("Introduce otro número");
      int numero_dos = s.nextInt();
      int suma = numero_uno + numero_dos;
      int resta = numero_uno - numero_dos;
      int multiplicacion = numero_uno * numero_dos;
      int division = numero_uno / numero_dos;
      System.out.println("La suma es  " + suma);
      System.out.println("La resta es " + resta);
      System.out.println("La multiplicacion es " + multiplicacion);
      System.out.println("La division es " + division);
    }
  }
}
