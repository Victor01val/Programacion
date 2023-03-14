package Capitulo8;
import java.util.Scanner;
import Capitulo8.misFunciones.Varias;
public class Ejercicio6 {
  public static void main(String args[]) {
Scanner s = new Scanner(System.in); {

for(int i=0; i<5; i++) {
  double a = s.nextDouble();

  System.out.println("El precio es  " +Varias.precioConIva(a));
}
  s.close();
}
  }
}
