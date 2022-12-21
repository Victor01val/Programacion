/*
 * Víctor Valverde Olmedo
 * Pecera con pez dentro
 */
package Capitulo6;
import java.util.Scanner;
public class C6EJ17 {
  public static void main (String args[]) {
    
    Scanner s = new Scanner(System.in);
    int h = 0;
    int x = 0;
    int a = 0;
    int n2 = 1;
    
    System.out.print("Por favor, introduce una altura(superior a 4): ");
    h = s.nextInt();
    
    System.out.print("Por favor, introduce una anchura(superior a 4): ");
    x = s.nextInt();
    
    for(int i = 1 ; i <= x; i++){
      System.out.print("*");
      }
      System.out.println("");
    for(int i = 1; i <= h-2; i++){
      System.out.print("*");
      for(int j =1; j <= x-2; j++){
       a = (int)(Math.random()*(x-2)*(h-2));
       if(n2 != 0){
       switch(a){
         case(0):
         System.out.print("&");
         n2 = 0;
         break;
         default: 
         System.out.print(" ");
         }
       }else{
         System.out.print(" ");
       }
      }
        
        
        System.out.print("*");
        System.out.println("");
        }
      
      for(int i = 1; i <= x; i++){
      System.out.print("*");
      }
      s.close(); //Evitar errores
	}
}

