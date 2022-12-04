/*
 * Víctor Valverde Olmedo
 * Calcular tres potencias de los tres primeros numeros
 */
package Capitulo5;
import java.util.Scanner;
public class C5EJ11 {
  
  public static void main(String args[]) {
    
    Scanner s = new Scanner(System.in);
    int n = 0;
    int r = 0;
    
    System.out.print("Escribe un número:");
    n = s.nextInt();
    
    for(int i = 1; i <=5; i++){
      for(int j = i; j <= i; j++){
        r = (n+i);
        System.out.println("|" + r + "|" + (r*r) + "|" + (r*r*r) + "|");
        s.close(); //Evitar errores
      }
    }
  }
}
