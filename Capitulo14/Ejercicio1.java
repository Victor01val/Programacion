/**
 * @author Víctor Valverde Olmedo
 * Programa que dice el mayor numero de los 6, y si se escribe un numero decimal produce un error, que hay que volver a escribir
 */
package Capitulo14;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String args[]) {
Scanner s = new Scanner(System.in);
int max = Integer.MIN_VALUE; //Valor maximo
int num;

for (int i = 0; i < 6; i++) {
  boolean numerocorrecto = false; //Inicia el boolean en falso
  do {
    try {
      System.out.print("Ingrese un número: ");
      num = Integer.parseInt(s.next()); // Lee la entrada del usuario y la convierte en un número entero
      if (num > max) {
        max = num; //Si el numero es mayor que el maximo, la variable max cambia de valor
      }
      numerocorrecto = true; // Si no se produce una excepción, el boolean se establece en verdadero
    } catch (NumberFormatException e) { // Captura la excepción si el usuario ingresa algo que no es un número entero
      System.out.println("NumberFormatException!");
    }
  } while (!numerocorrecto); // Bucle do-while que se ejecuta mientras numerocorrecto sea falso
}

s.close();

System.out.println("El número máximo es " + max);
}
}





