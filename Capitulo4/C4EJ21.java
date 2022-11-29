
/*
 * Víctor Valverde Olmedo 1 DAW TARDES
 * Calcular media
 */
package Capitulo4;
import java.util.Scanner;

public class C4EJ21 {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    {

      double media = 0;
      System.out.println("Introduce la nota del control 1");
      double control1 = s.nextDouble();
      System.out.println("Introduce la nota del control 2");
      double control2 = s.nextDouble();
      media = (control1 + control2) / 2;
      if (media >= 5) {
        System.out.println("Has aprobado");

      } else {
        System.out.println("No apto");
        System.out.println("Introduce la nota del exámen de recuperación");
        double recuperacion = s.nextDouble();
        if (recuperacion >= 5) {
          System.out.println("Apto");
        } else {
          System.out.println("Se mantiene la media anterior " + media);
          s.close(); //Evitar errores
        }
      }
    }
  }
}
