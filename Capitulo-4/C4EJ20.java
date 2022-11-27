
/*
 * Victor Valverde Olmedo 1 DAW TARDES
 * Numero capicua o no
 */
import java.util.Scanner;

public class C4EJ20 {

  public static void main(String args[]) {

    Scanner s = new Scanner(System.in);
    int num_uno = 0;
    boolean capicua = false;

    System.out.println("Escribe un número entero (Que tenga 5 cifras como máximo)");
    num_uno = s.nextInt();

    if (num_uno < 10) {
      capicua = true;

    } else if ((num_uno >= 10) && (num_uno <= 100)) {
      if ((num_uno / 10) == (num_uno % 10)) {
        capicua = true;
      }

    } else if ((num_uno >= 100) && (num_uno < 1000)) {
      if ((num_uno / 100) == (num_uno % 10)) {
        capicua = true;
      }

    } else if ((num_uno >= 1000) && (num_uno < 10000)) {
      if (((num_uno / 1000) == (num_uno % 10)) && (((num_uno / 100) % 10) == ((num_uno / 10) % 10))) {
        capicua = true;
      }

    } else if (num_uno >= 10000) {
      if (((num_uno / 10000) == (num_uno % 10)) && ((((num_uno / 1000) % 10)) == ((num_uno / 10) % 10))) {
        capicua = true;
      }
    }

    if (capicua) {

      System.out.println("El número introducido es capicua");

    } else {

      System.out.println("El número introducido no es capicua");
      s.close(); // Evitar errores
    }

  }
}