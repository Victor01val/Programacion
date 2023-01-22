/*
 * Víctor Valverde Olmedo
 * Debe dar el maximo y el minimo en un array de 6 filas por 10 columnas y numeros entre 0 y 1000
 */
package Capitulo7;
import java.util.Scanner;
public class CEJ5 {
  public static void main (String args[])
  throws InterruptedException{
  
  Scanner s = new Scanner(System.in);
  int[][] n = new int[6][10];
  int M = 0;
  int m = 10002;
  int ci = 0;
  int cj = 0;
  int ci2 = 0;
  int cj2 = 0;
  
  for(int i = 0; i < 6; i++){
    for(int j = 0; j < 10; j++){
      n[i][j] =(int)(Math.random()*1001);
      System.out.print(n[i][j] + " ");
        Thread.sleep(1);
        if(n[i][j] > M){
          M = n[i][j];
          ci = i;
          cj = j;
          }
          
          if(n[i][j] < m){
            m = n[i][j];
            ci2 = i;
            cj2 = j;
            }
        }
        System.out.println("");
      }
   System.out.println("-----------------------------------"); 
  System.out.println("El número mayor es el " + M + " Que es encuenta en la coordenada n[" + ci+ "][" +cj + "]");
  System.out.print("El número menor es el " + m + " Que es encuenta en la coordenada n[" + ci2+ "][" +cj2 + "]");
    s.close(); //Evitar errores
}
}

