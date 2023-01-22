/*
 * Víctor Valverde Olmedo
 * Desplaza los primos primero y despues los que no lo son
 */
package Capitulo7;
import java.util.Scanner;
public class C7EJ11 {
  
  public static void main (String args[]) {
    
    Scanner s = new Scanner(System.in);
    int[] n = new int[10];
    int[] primo = new int[10];
    int[] noprimo = new int[10];
    boolean esPrimo = true;
    int primos = 0;
    int noprimos = 0;
    
    
    System.out.println("Escriba 10 números por telcado: ");
    for(int i = 0; i <n.length;i++){
      n[i] = s.nextInt();
      esPrimo = true;
      for(int j = 2; j < n[i]; j++){
        if(n[i]%j == 0){
          esPrimo = false;
          
          }
        }
        if(esPrimo){
          primo[primos++] = n[i];
          }else{
           noprimo[noprimos++] = n[i]; 
         }
      }
      
      for(int i = 0; i <primos; i++){
        n[i] = primo[i];
        }
          
        for(int i = primos; i < n.length;i++){
          n[i] = noprimo[i-primos];
          }
          
          for(int num:n){
            System.out.print(num + " ");
            }
            s.close(); //Evitar errores
  }
}
