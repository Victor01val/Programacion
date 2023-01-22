/*
 * Víctor Valverde Olmedo
 * Modifica el programa anterior generando numeros aleatorios entre 100 y 999
 */
package Capitulo7;
public class CEJ3 {
  public static void main(String args[]) {
 
    System.out.println();

    //Declaracion de variables y arrays//
    int tamF=4; //Tamanio de la fila//
    int tamC=5; //Tamanio de la columna//
    int[][] num = new int[tamF][tamC]; // array de 4 filas por 5 columnas
    int fila;
    int columna;

    // Imprimir el resultado//
    for(fila = 0; fila < tamF; fila++) {
      System.out.print(" Fila: " + fila + " |");
      for(columna = 0; columna < tamC; columna++) {
        num[fila][columna] = (int)(Math.random()*((999-100)+1)+1);
        System.out.print(num[fila][columna] + " ");
    
      }
      System.out.println();
    }
  }
}
