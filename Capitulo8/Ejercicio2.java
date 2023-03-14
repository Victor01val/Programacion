package Capitulo8;
import Capitulo8.misFunciones.Varias;
import java.util.Scanner;
public class Ejercicio2 {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in); {
System.out.println("Introduce tu edad");
int a = s.nextInt();
boolean edad = Varias.esMayorEdad(a);
System.out.println(edad);
s.close();
    }
  }
}
