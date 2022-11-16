/*
 *Víctor Valverde Olmedo Ejercicio 3
 Conversor pesetas a euros
 */
import java.util.Scanner;

public class C3EJ3 {
    public static void main(String args[]) {
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Introduce el número de pesetas");
            int num_uno = s.nextInt();
            double division = num_uno / 166;
            System.out.println(+num_uno + " pesetas son " + division + " euros");

        }

    }
}
