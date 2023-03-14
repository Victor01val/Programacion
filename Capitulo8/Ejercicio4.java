package Capitulo8;

import Capitulo8.misFunciones.Varias;
import java.util.Scanner;

public class Ejercicio4 {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    {
      System.out.println("Introduce un numero");
      int n = s.nextInt();
      int resultado = Varias.dimeSigno(n);
      System.out.println(resultado);
      s.close();
    }
  }
}
