/*
 * Víctor Valverde Olmedo
 * Array con las posiciones de derecha en la primera lista
 */
package Capitulo7;

public class C7EJ10 {
  public static void main(String args[]) {
    
    
   
      
      int[] n = new int[20];
      int[] n2 = new int[20];
      int contador = 0;
          
      for(int i = 0; i < n.length; i++){
        n[i] =(int)(Math.random()*101);
        }
        
        for(int num:n){
          if(num % 2 == 0){
            
            n2[contador] = num;
            contador++;
            
            }
          }
         for(int num:n){
          if(num % 2 != 0){
            n2[contador] = num;
            contador++;
            }
          }
          
          for(int num:n2){
            System.out.print(num + " ");
            }
            
    }
  }
  

