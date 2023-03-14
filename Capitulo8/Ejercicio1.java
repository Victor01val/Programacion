package Capitulo8;
import Capitulo8.misFunciones.Varias;
import java.util.Scanner;
public class Ejercicio1 {
  public static void main(String args[]) {
  Scanner s = new Scanner(System.in); {
    System.out.println("Introduce un numero");
double a = s.nextInt();
System.out.println("Introduce otro numero");
double b = s.nextInt();
double multiplica = Varias.multiplica(a, b);
System.out.println(multiplica);

s.close();
  }
}
}