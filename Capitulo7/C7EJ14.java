/*
 * Víctor Valverde Olmedo
 * Pide 8 palabras y lo almacena en un array
 */
package Capitulo7;
import java.util.Scanner;
public class C7EJ14 {
  	
	public static void main (String args[]) {
    
    Scanner s = new Scanner(System.in);
    String [] c ={"verde", "rojo", "azul", "amarillo", "naranja", "rosa", "negro", "blanco" , "morado"};
    String [] n = new String[8];
    String [] r = new String[8];
    int resultado = 0;
    boolean color = false;
    
    for(int i = 0; i < 8; i++){
      n[i] = s.next();
      
      
      for(String a:c){
        if(n[i].equals(a)){
          r[resultado++] = a;
          }
        }
      }
      
      for(int i = 0; i < 8; i++){
        color = false;
        for(String a:c){
          if(n[i].equals(a)){
            color = true;
            }
          }
          
          if(!color){
            r[resultado++] = n[i];
            }
          
        }
        
         for(String a:r){
          System.out.print(a + " ");
        }
        s.close(); //Evitar errores
    }
  }

