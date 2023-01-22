/*
 * Víctor Valverde Olmedo
 * Pregunta si quiere destacar el minimo o el maximo
 */
package Capitulo7;
import java.util.Scanner;
public class C7EJ13 {
  
	public static void main (String args[]) {
    
    Scanner s = new Scanner(System.in);
    
    int[]n = new int[100];
    int M = 0;
    int m = 501;
    
    for(int i = 0; i < n.length; i++){
      n[i] = (int)(Math.random()*501);
      if(n[i] >= M){
        M = n[i];
        }
        
        if(m >= n[i]){
          m = n[i];
          }
      }
    for(int num:n){
      System.out.print(num + " ");
      }
      
      System.out.println(" ");
      System.out.print("¿Que quieres destacar?: 1- Mínimo. 2- Máximo: ");
      int n2 = s.nextInt();
      
      if(n2 == 1){
        for(int i = 0; i < n.length; i++){
          if(n[i] == m){
            System.out.print("**" + n[i] + "**" + " ");
            }else{
              System.out.print(n[i] + " ");
            }
            
          }
        }
          
          if(n2 == 2){
        for(int i = 0; i < n.length; i++){
          if(n[i] == M){
            System.out.print("**" + n[i] + "**" + " ");
            }else{
              System.out.print(n[i] + " ");
            }
            
          }
        }
        s.close(); //Evitar errores
  }
}