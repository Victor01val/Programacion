/*
 * Víctor Valverde Olmedo
 *  probabilidad de que salga un 1 sea de 1/2, la probabilidad de que salga x sea de 1/3 y la probabilidad de que salga 2 sea de 1/6. Pista: 1/2 = 3/6 y 1/3 = 2/6.
 */
package Capitulo6;
import java.util.Scanner;
public class C6EJ9 {
  public static void main (String args[]) {
    
    Scanner s = new Scanner(System.in);
    int a = 0;
    int contador = 0;
    
    a = (int)(Math.random()*101);
    
    while(a != 24){
      if(a %2 ==0){
        contador++;
        System.out.print(a + " ");
        }
      a = (int)(Math.random()*101);
      }
      System.out.println("");
      System.out.println("");
      System.out.print("Se han generado " + contador + " números antes de llegar al número 24");
      s.close(); //Evitar errores
  }
}

