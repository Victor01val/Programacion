/*
 * Víctor Valverde Olmedo 1 DAW TARDES
 * Piramide
 */

import java.util.Scanner;

public class C4EJ15 {

  public static void main(String args[]) {

    Scanner s = new Scanner(System.in);
    String a = "";
    int posci = 0;

    System.out.println("¿Con que caracter quieres hacer la piramide?");
    a = s.nextLine();

    System.out.println("Elige la orientación de la piramide : Arriba     = 1");
    System.out.println("                                      Abajo      = 2");
    System.out.println("                                      Izquierda  = 3");
    System.out.println("                                      Derecha    = 4");
    posci = s.nextInt();

    switch (posci) {

      case 1:
        System.out.println("    " + a + "                 ");
        System.out.println("   " + a + a + a + "           ");
        System.out.println("  " + a + a + a + a + a + "    ");
        System.out.println(" " + a + a + a + a + a + a + a);
        System.out.println(a + a + a + a + a + a + a + a + a);
        break;
      case 2:
        System.out.println(a + a + a + a + a + a + a + a + a);
        System.out.println(" " + a + a + a + a + a + a + a);
        System.out.println("  " + a + a + a + a + a + "      ");
        System.out.println("   " + a + a + a + "            ");
        System.out.println("    " + a + "                  ");
        break;
      case 3:
        System.out.println("              " + a);
        System.out.println("            " + a + a);
        System.out.println("        " + a + a + a);
        System.out.println("    " + a + a + a + a);
        System.out.println("" + a + a + a + a + a);
        System.out.println("    " + a + a + a + a);
        System.out.println("        " + a + a + a);
        System.out.println("            " + a + a);
        System.out.println("                " + a);
      case 4:
        System.out.println(a);
        System.out.println(a + a);
        System.out.println(a + a + a);
        System.out.println(a + a + a + a);
        System.out.println(a + a + a + a + a);
        System.out.println(a + a + a + a);
        System.out.println(a + a + a);
        System.out.println(a + a);
        System.out.println(a);

      default:

        s.close(); // Evitar errores
    }

  }
}