/*
 * Víctor Valverde Olmedo
 * Arrays rotados
 */
package Capitulo7;
import java.util.Scanner;
public class C7EJ6 {
  public static void main(String args[]) {


    Scanner s = new Scanner(System.in);
    
    int[] n = new int[15];
   
    
    System.out.println("Escribe 15 números: ");
    for(int i = 0; i <15 ; i++){
      if(i == (n.length-1)){
        n[i*0] = s.nextInt();
        }else{
      
      n[i+1] = s.nextInt();
    }
    
  }
  System.out.println("");
  System.out.println("Se muestra el contenido del Arrays: ");
  System.out.println("");
  for(int num:n){
    System.out.print(num + " ");
    }
    s.close(); //Evitar errores
	}
}