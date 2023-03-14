package Capitulo8;
import java.util.Scanner;
import Capitulo8.misFunciones.Varias;
public class Ejercicio8 {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in); {
      System.out.println("Introduce un valor N");
      int n = s.nextInt();
      System.out.println("Suma:");
      for(int i=0; i<n; i++) {
        System.out.println("La suma es  " +i+ "+" +n+ "=" + Varias.suma(n, i));
      }
      System.out.println("Producto:");
      for(int i=0; i<n; i++){
        System.out.println("La multiplicación es  " +i+ "*" +n+ "=" + Varias.multiplica(n, i));
      }
      System.out.println("Intermedio:");
      for(int i=0; i<n; i++){
      
System.out.println("El valor intermedio entre  " +i+ "  y " +n+ "  es  " +Varias.media(n, i));
      }
    }
  }
}
