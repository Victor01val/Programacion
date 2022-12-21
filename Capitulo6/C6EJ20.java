/*
 * Víctor Valverde Olmedo
 * Pinta por pantalla una cuba de agua
 */
package Capitulo6;
import java.util.Scanner;
public class C6EJ20 {
  public static void main (String args[]) {
    
    Scanner s = new Scanner(System.in);
    int h = 0;
    int a = 0;
    
    System.out.print("Por favor, escriba la altura: ");
    h = s.nextInt();
    
    a = (int)(Math.random()*h-1); 
    for(int i = 1; i <= h-1; i++){
      System.out.print("*");
      if(h-a <= i){
        for(int j = 1; j <= 4;j++){
        System.out.print("=");
        }
        }else{
      for(int j = 1; j <= 4;j++){
        System.out.print(" ");
        }
      }
        System.out.print("*");
        System.out.println("");
       }
       
       for(int i = 1; i <= 6; i++){
         System.out.print("*");
         }
         s.close(); //Evitar errores
   }
 }

