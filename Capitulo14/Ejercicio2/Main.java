/**
 * @author Víctor Valverde Olmedo
 * Si dos gatos del mismo sexo aparean, se produce una excepcion
 */
package Capitulo14.Ejercicio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Excepcion {
        Scanner s = new Scanner(System.in);
        {
            System.out.print("Ingrese el sexo del gato: ");
            String sexo = s.nextLine();
            Gato garfield = new Gato(sexo); // Crea un objeto Gato con el sexo ingresado por el usuario
            Gato tom = new Gato("macho"); // Crea un objeto Gato con el sexo "macho"
            garfield.aparear(tom);  // Llama al método aparear() en el objeto garfield
        }
        s.close();
    }
}
