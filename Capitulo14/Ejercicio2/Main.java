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
            Gato gato1 = new Gato(sexo); // Crea un objeto Gato con el sexo ingresado por el usuario
            System.out.print("Ingrese el sexo del gato: ");
             sexo = s.nextLine();
            Gato gato2 = new Gato(sexo);
            gato1.aparear(gato2);  // Llama al método aparear() en el objeto garfield
        }
        s.close();
    }
}
