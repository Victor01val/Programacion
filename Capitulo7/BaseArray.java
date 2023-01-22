package Capitulo7;
import java.util.Scanner;
public class BaseArray {

  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    System.out.println();

    //Declaracion de variables y arrays//
    int tamF=6; //Tamanio de la fila//
    int tamC=4; //Tamanio de la columna//
    int valor=1; 
    int[][] num = new int[tamF][tamC]; // array de 4 filas por 5 columnas
    int fila;
    int columna;

    // Establecer los valores//
  
    for (columna = 0; columna < tamC; columna++){ 
      

      for (fila = 0; fila < tamF; fila++) { 
        num[fila][columna] = valor;
        valor++;
      }
      
    }

    
    System.out.println();

    // Imprimir el resultado//
    for(fila = 0; fila < tamF; fila++) {
      System.out.print(" Fila: " + fila + " |");
      for(columna = 0; columna < tamC; columna++) {
        System.out.printf("%10d ", num[fila][columna]);
      }
      System.out.println();
    }
    s.close(); //Evitar errores
  }
}

