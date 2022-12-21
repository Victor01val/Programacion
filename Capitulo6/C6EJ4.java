/*
 * Víctor Valverde Olmedo
 * Muestra 20 numeros enteros comprendidos entre 0 y 10
 */
package Capitulo6;

public class C6EJ4 {
  public static void main (String args[]) {
    
   
    int a = 0;
    
    for(int i = 1; i <= 20; i++){
      a = (int)(Math.random()*11);
      System.out.print(a + " ");
      }
		
	}
}

