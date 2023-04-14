package Capitulo7;

import java.util.Scanner;

public class Ejercicio2 {

  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    {
      System.out.print("Introduce el tamaño de las filas del array");
      int f = s.nextInt();
      System.out.print("Introduce el tamaño de las columnas del array");
      int c = s.nextInt();
      int[][] array = new int[f][c];
      for (int i = 0; i < f; i++) {
        for (int j = 0; j < c; j++) {
          array[i][j] = (int) (Math.random() * 101 + 100);
        }
      }
      for (int i = 0; i < f; i++) {
        for (int j = 0; j < c; j++) {
          System.out.print(array[f][c]);
        }
      }
      for (int i = 0; i < f; i++) {
        for (int j = 0; j < c; j++) {

          System.out.printf("| %3-d", array[f][c]);
        }
        System.out.println("|");
      }

    }
    s.close();
  }
}
