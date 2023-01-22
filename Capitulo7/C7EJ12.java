/*
 * Víctor Valverde Olmedo
 * El numero inicial pasara a la final
 */
package Capitulo7;
import java.util.Scanner;
public class C7EJ12 {
  public static void main (String args[]) {
    
    Scanner s = new Scanner(System.in);
		int[]n = new int[10];
    int[]r = new int[10];
    int r1 = 0;
    int r2 = 0;
    
    
    for(int i = 0; i < n.length; i++){
      n[i] = s.nextInt();
      r[i] = n[i];
      }
      System.out.println("");
      System.out.print("Escribe el primer valor: ");
      r1 = s.nextInt();
      System.out.print("Escribe el segundo valor: ");
      r2 = s.nextInt();
      
      r[r2] = r[r1];
      
      for(int i = r2 + 1; i < n.length; i++){
        r[i] = n[i-1];
        }
        
        r[0] = n[9];
        for(int i = 0; i < r1; i++){
          r[i+1] = n[i];
          }
          
          for(int num:r){
            System.out.print(num + " ");
            }
            s.close(); //Evitar errores
	}
}

