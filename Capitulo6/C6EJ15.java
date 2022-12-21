/*
 * Víctor Valverde Olmedo
 * Generador de melodía
 */
package Capitulo6;

public class C6EJ15 {
  public static void main(String args[]) {

    int a = 0;
    int a2 = 0;
    String n2 = "";
    int i = 0;
    String nfinal = "";
    int contador = 0;
    int contador2 = 0;

    a2 = 4 * (int) (Math.random() * 7 + 1);

    for (i = 1; i <= a2; i++) {
      a = (int) (Math.random() * 7 + 1);
      switch (a) {
        case (1):
          n2 = "Do";
          contador++;
          contador2++;
          break;
        case (2):
          n2 = "Re";
          contador++;
          contador2++;
          break;
        case (3):
          n2 = "Mi";
          contador++;
          contador2++;
          break;
        case (4):
          n2 = "Fa";
          contador++;
          contador2++;
          break;
        case (5):
          n2 = "Sol";
          contador++;
          contador2++;
          break;
        case (6):
          n2 = "La";
          contador++;
          contador2++;
          break;
        case (7):
          n2 = "Si";
          contador++;
          contador2++;
          break;
        default:
      }

      if (contador2 == 1) {
        nfinal = n2;
      }

      if (i == a2 && contador == 4) {
        System.out.print(nfinal + " ");
      } else {
        System.out.print(n2 + " ");
      }

      if (i == a2) {
        System.out.print("||");
      }
      if (i % 4 == 0 && i != a2) {
        System.out.print("|");
        contador = 0;
      }

    }

  }
}
