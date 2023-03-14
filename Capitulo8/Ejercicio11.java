package Capitulo8;

import java.util.Scanner;
import Capitulo8.misFunciones.Varias;

public class Ejercicio11 {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    {
      System.out.println("Introduce un numero");
      int n = s.nextInt();
      Varias.tabla(n);

    }
  }
}
