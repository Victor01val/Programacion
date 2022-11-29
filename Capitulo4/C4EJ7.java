/*
* Víctor Valverde Olmedo
* Calcular media 
*/
package Capitulo4;
import java.util.Scanner;

public class C4EJ7 {
  public static void main(String args[]) {
    double num_uno = 0;
    double num_dos = 0;
    double num_tres = 0;
    Scanner s = new Scanner(System.in);
    System.out.println("Escribe el primer número");
    num_uno = s.nextInt();
    System.out.println("Escribe el segundo número");
    num_dos = s.nextInt();
    System.out.println("Escribe el tercer número");
    num_tres = s.nextInt();
    double suma = (num_uno + num_dos + num_tres) / 3;
    System.out.println("La media es " + suma);
    s.close(); // Evitar errores
  }
}
