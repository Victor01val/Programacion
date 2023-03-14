package Capitulo8;
import java.util.Scanner;
import Capitulo8.misFunciones.Varias;
public class Ejercicio10 {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in); {

   
    
System.out.println("Introduce día");
int dia = s.nextInt();
System.out.println("Introduce el mes en letras");
String mes = s.next();

System.out.println("Introduce año");
int ano = s.nextInt();
Varias.fecha(dia, mes, ano);

    }
    s.close(); //Evitar errores
  }
}