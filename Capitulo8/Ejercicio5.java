package Capitulo8;
import java.util.Scanner;
import Capitulo8.misFunciones.Varias;
public class Ejercicio5 {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in); {
    System.out.println("Introduce un número");
    int n = s.nextInt();
    double resultado = Varias.millasAkilometros(n);
    System.out.println(n+ " millas son " +resultado+ " kilometros");
    s.close();
    }
  }
}
