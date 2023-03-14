package Capitulo8;
import Capitulo8.misFunciones.Varias;
import java.util.Scanner;
public class Ejercicio3 {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in); {
      System.out.println("Introduce un numero");
      int a = s.nextInt();
      System.out.println("Introduce otro numero");
      int b = s.nextInt();
      int n = Varias.minimo(a, b);
      System.out.println("El numero " +n+ " es el minimo");
      s.close();
    }
  }
}
