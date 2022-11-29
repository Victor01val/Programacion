/*Víctor Valverde Olmedo Ejemplo 1
*Leer nombre y apellidos
 */
package Capitulo3;
import java.util.Scanner;

public class C3Ejemplo1 {

    public static void main(String args[]) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Introduce nombre y apellidos");
            String nombreyapellidos = s.nextLine();
            System.out.println("El nombre y apellido es: " + nombreyapellidos);
        }
    }
}
