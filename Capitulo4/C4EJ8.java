/*
* Víctor Valverde Olmedo  1 DAW TARDES
* Calcular media con resultados
*/
package Capitulo4;
import java.util.Scanner;

public class C4EJ8 {
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
    double suma = (num_uno + num_dos + num_tres) / 3; //Hago la media

    System.out.println("La media es " + suma);
    if (suma < 5)
    {

      System.out.println("Insuficiente"); //Aquí pondría un insuficiente
    }
    if (suma >= 5 && suma < 6)
    {
      System.out.println("Suficiente"); //Aquí pondría un suficiente
    }
    if (suma >= 6 && suma < 7)
    {
      System.out.println("Bien"); //Aquí pondría un bien
    }
    if (suma >= 7 && suma < 9)
    {
      System.out.println("Notable"); //Aquí pondría un notable
    }
    if (suma >= 9 && suma < 10)
    {
      System.out.println("Sobresaliente"); //Aquí pondría un sobresaliente
    }
    
    s.close(); // Evitar erroes

  }
}
