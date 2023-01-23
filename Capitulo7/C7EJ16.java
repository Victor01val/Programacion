/*
 * Víctor Valverde Olmedo
 * Pedirá si quiere resaltar los multiplos de 5 o de 7 en un array
 */
package Capitulo7;
import java.util.Scanner;
public class C7EJ16 {
  
	public static void main (String args[]) {
    
    Scanner s = new Scanner(System.in);
    int[]n = new int[20];
    int n2 = 0;
    
    for(int i = 0; i < n.length; i++){
      n[i] = (int)(Math.random()*401);
      System.out.print(n[i] + " ");
      }
      
      System.out.println("");
      System.out.println("");
      System.out.print("¿Que números quiere resaltar?: 1- Múltiplo de 5 ; 2- Múltiplo de 7: ");
      n2 = s.nextInt();
      System.out.println("");
      
      if(n2 == 1){
      for(int num:n){
        if(num % 5 == 0){
          System.out.print("[" + num + "] ");
            }else{
              System.out.print(num + " ");
            }
        }
     }else{
       if(n2 == 2){
      for(int num:n){
        if(num % 7 == 0){
          System.out.print("[" + num + "] ");
        }else{
          System.out.print(num + " ");
        }
      }
    }
   }
   s.close(); //Evitar errores
  }
}
