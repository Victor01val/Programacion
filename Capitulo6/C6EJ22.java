/*
 * Víctor Valverde Olmedo
 * Pinta por pantalla una serpiente que se mueva
 */
package Capitulo6;

public class C6EJ22 {
  public static void main(String[] args) {
    System.out.print("Por favor, introduzca la longitud de la serpiente en ");
    System.out.print("caracteres contando la cabeza: ");
    int longitud = Integer.parseInt(System.console().readLine());

    System.out.println(" @");

    int i;
    int x = 13;
    while (longitud > 1) {

      x += (int) (Math.random() * 3) - 1;

      for (i = 1; i < x; i++) {
        System.out.print(" ");
      }

      System.out.println("#");
      longitud--;
    }
  }
}
