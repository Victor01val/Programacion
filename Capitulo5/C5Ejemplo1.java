/*
 * Víctor Valverde Olmedo
 * Lista de numeros pares. Ejemplo 1
 */
package Capitulo5;
public class C5Ejemplo1 {
  public static void main(String args[]) {
    System.out.println("Lista de numeros pares");
    
    for (int i = 0; i <= 20; i++) {
      int modulo2;
      modulo2 = i % 2;
      if (modulo2 == 0)
        System.out.println(i);
    }
  }
}
