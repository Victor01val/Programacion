import java.util.Scanner;
/*
 *Víctor Valverde Olmedo Ejercicio 7
 Factura con IVA
 */
public class C3EJ7 {
  public static void main(String args[])  {
try (Scanner s = new Scanner(System.in)) {
System.out.println("Introduce un número");
int numero_uno = s.nextInt();
double baseimponible = 0.21;
double multiplicacion = (double) numero_uno * (double) baseimponible;
double resultado = numero_uno-multiplicacion;
System.out.println("La factura con IVA es " +resultado);
}


  }
}
