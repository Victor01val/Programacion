/*
 * Víctor Valverde Olmedo
 * Tirada de tres dados. Suma total
 */
package Capitulo6;

public class C6EJ1 {
  public static void main (String args[]) {
    
    int suma = 0;
    
    for(int i = 1; i <= 3; i++){
      int tirada = (int)(Math.random()*6) + 1;
      System.out.println("El " + i + "º DADO ha salido: " + tirada);
      suma+=tirada;
      }
      System.out.print("La suma de todos los números del dado es: " + suma);
  }
}

