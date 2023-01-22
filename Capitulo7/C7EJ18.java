/*
 * Víctor Valverde Olmedo
 * Ordena un numero mayor, despues un menor,  y asi consecutivamente
 */
package Capitulo7;
import java.util.Scanner;
public class C7EJ18 {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    int[]a = new int[10];
     int[]n3 = new int[10];
     int[]n4 = new int[10];
     int[]resultado = new int[10];
     int numeros = 0;
     int numero = 0;
     int contador = 0;
     int contador2 = 0;
     int ñ = 0;
    
    for(int i = 0; i < a.length;i++){
      a[i] = (int)(Math.random()*201);
      System.out.print(i + " ");
      }
      System.out.println("");
      
      for(int num:a){
        System.out.print(num + " ");
        }
        
        System.out.println("");
        System.out.println("");
        
        for(int num:a){
          if(num <= 100){
           n3[numeros++] = num;
          }else if(num > 100){
            n4[numero++] = num;
          
        }
    }
    contador = 0;
    contador2 = 0;
    do{
      
      if(contador < numeros++){
        resultado[ñ++] = n3[contador++];
        }
        if(contador2 < numero){
          resultado[ñ++] = n4[contador2++];
          }
      
      }while(ñ < 10);
      
      for(int num:resultado){
        System.out.print(num + " ");
        }
        s.close(); //Evitar errores
  }
}