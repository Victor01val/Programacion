/*
 *Víctor Valverde Olmedo Ejercicio 8
 Numero de horas trabajadas
 */
import java.util.Scanner;
public class C3EJ8 {
  public static void main(String args[]) {
try(Scanner s = new Scanner(System.in)) {

System.out.println("Introduce número de horas");
int horas = s.nextInt();
int resultado = horas*12;
System.out.println("Al trabajador se le pagará  " +resultado+ " euros por la semana");

}


  }
}
