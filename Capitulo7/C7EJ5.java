/*
 * Víctor Valverde Olmedo
 * Array con maximos y minimos
 */
package Capitulo7;
import java.util.Scanner;
public class C7EJ5 {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    int[] n = new int[10];
    int M = 0;
    int m = 0;
    int contador = 0;
    
    System.out.println("Por favor, escribe 10 números: ");    
    for(int i = 0; i < 10; i++){
     n[i] = s.nextInt();
     if(n[i] >= M){
       M = n[i];
       }
       if((n[i]) < m || contador == 0){
         m = n[i];
         contador++;
         }
   }
         System.out.println("");
         System.out.println("Los números que has escrito son: ");
         System.out.println("");
      for(int num: n){
        if(M == num){
         System.out.println(num + " Máximo");
          }else if(m == num){
            System.out.println(num + " Mínimo");
          }else{
            System.out.println(num);
          }
          
      }
      s.close(); //Evitar errores
    }
  }