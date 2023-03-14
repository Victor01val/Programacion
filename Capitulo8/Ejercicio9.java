package Capitulo8;
import java.util.Scanner;
import Capitulo8.misFunciones.Varias;
public class Ejercicio9 {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in); {
      System.out.print("Introduce el primer valor: ");
      int a = s.nextInt();
      System.out.print("Introduce el segundo valor: ");
      int b = s.nextInt();
      System.out.print("Introduce el tercer valor: ");
      int c = s.nextInt();
      int maximo = Varias.maximo(a, b);
      
     
      if(maximo>c) {
        int segundovalor = maximo;
        System.out.println(segundovalor);
      } else {
        int segundovalor = c;
        System.out.println(segundovalor);
      }
  }
  }
  }
