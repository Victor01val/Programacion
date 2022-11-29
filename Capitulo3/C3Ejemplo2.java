
/*
 *Víctor Valverde Olmedo Ejemplo 2
 Leer numeros
 */
package Capitulo3;
import java.util.Scanner;

public class C3Ejemplo2 {

    public static void main(String args[]) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Introduce los números");
            int numero_uno = s.nextInt();
            System.out.println("Los números son: " + numero_uno);
        }
    }
}