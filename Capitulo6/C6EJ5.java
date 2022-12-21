/*
 * Víctor Valverde Olmedo
 * Muestra 50 numeros aleatorios entre 100 y 199
 */
package Capitulo6;

public class C6EJ5 {
  public static void main (String args[]) {
    

    int a = 0;
    int M = 0;
    int m = 0;
    int contador = 0;
    int suma = 0;
    int r = 0;
    
    for(int i = 1; i <= 50; i++){
      a = (int)(Math.random()*100) + 100;
      System.out.print(a + " ");
      contador++;
      suma+=a;
      if(a > M){
        M = a;
        }
        if(a < m || contador == 1){
          m = a;
          }
      
      }
      
      r = suma / contador;
      System.out.println("");
      System.out.println("--------------------------------------------------------------------------------");
      System.out.println("El máximo es " + M);
      System.out.println("El mínimo es " + m);
      System.out.println("La media es " + r);
  }
}

