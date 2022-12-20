/*
 * Víctor Valverde Olmedo
 * Escribe un programa que pida dos números por teclado y que luego mezcle en
dos números diferentes los dígitos pares y los impares. Se van comprobando los
dígitos de la siguiente manera: primer dígito del primer número, primer dígito
del segundo número, segundo dígito del primer número, segundo dígito del
segundo número, tercer dígito del primer número… Para facilitar el ejercicio,
podemos suponer que el usuario introducirá dos números de la misma longitud
y que siempre habrá al menos un dígito par y uno impar. Usa long en lugar de
int donde sea necesario para admitir números largos.
 */
package Capitulo5;

import java.util.Scanner;

public class C5EJ34 {

  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    int n = 0;
    int n2 = 0;
    int r2 = 0;
    int r = 0;
    int par = 0;
    int impar = 0;
    int aux = 0;
    int aux2 = 0;

    System.out.print("Escribe un número entero: ");
    n = s.nextInt();

    System.out.print("Escribe un segundo número entero: ");
    n2 = s.nextInt();

    while (n > 0) {
      r = (r * 10) + (n % 10);
      n /= 10;
    }
    while (n2 > 0) {
      r2 = (r2 * 10) + (n2 % 10);
      n2 /= 10;
    }

    while (r2 > 0) {
      par = r % 10;
      if (par % 2 == 0) {
        aux = (aux * 10) + par;
      } else {
        aux2 = (aux2 * 10) + par;
      }

      impar = r2 % 10;
      if (impar % 2 == 0) {
        aux = (aux * 10) + impar;
      } else {
        aux2 = (aux2 * 10) + impar;
      }
      par /= 10;
      impar /= 10;
      r2 /= 10;
      r /= 10;
    }

    System.out.println("Los números pares son: " + aux);
    System.out.print("Los números impares son: " + aux2);
  }
}