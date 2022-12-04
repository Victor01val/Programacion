/*
 * Víctor Valverde Olmedo
 * Calcular base elevado a un numero
 */
package Capitulo5;

import java.util.Scanner;
public class C5EJ14 {
	
	public static void main (String args[]) {
    
    Scanner s = new Scanner(System.in);
    int b = 0;
    int e = 0;
    int n = 1;
    
    
    System.out.print("Escribe la base: ");
    b = s.nextInt();
    
    System.out.print("Escribe el exponente: ");
    e = s.nextInt();
		
    for(int i = 0; i < e; i++){
      n*= b;
    }
      System.out.print(b + "^" + e + " = " + n);
      s.close(); //Evitar errores
	}
}