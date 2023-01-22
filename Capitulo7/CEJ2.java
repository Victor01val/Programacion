/*
 * Víctor Valverde Olmedo
 * Pide 20 numeros por teclado en un array de 4 filas por 5 columnas
 */
package Capitulo7;

import java.util.Scanner;

public class CEJ2 {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    {

      int sumaFilas = 0;
      int sumaTotal = 0;
      int sumaColumnas = 0;
      System.out.print("Escribe 20 números enteros:");
      int[][] n = new int[4][5];
      
      for (int i = 0; i < 4; i++) {
        for (int j = 0; j < 5; j++) {
          n[i][j] = s.nextInt();
        }
      }                     
      System.out.println("---------------------------");
      for (int i = 0; i < 4; i++) {
        sumaFilas = 0;
        for (int j = 0; j < 5; j++) {
          sumaFilas += n[i][j];
          System.out.printf("%4d", +n[i][j]);
        }

        System.out.println("|  "   +sumaFilas);
        sumaTotal += sumaFilas;
      }
      System.out.println("---------------------------");
      // Sumo las columnas
      for (int i = 0; i < 5; i++) {
        sumaColumnas = 0;
        for (int j = 0; j < 4; j++) {
          sumaColumnas += n[j][i];
        }
        System.out.printf("%4d", +sumaColumnas);
        sumaTotal += sumaColumnas;
      }
      
      // Calculamos las dos sumas.
     
      System.out.print("| "+ "Total " + sumaTotal);
    }
    s.close(); //Evitar errores
  }

}

