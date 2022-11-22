/* 
* Víctor Valverde Olmedo 1 DAW TARDES
* Resolver la ecuacion de segundo grado
*/
import java.util.Scanner;

public class C4EJ9 {
  public static void main(String args[]) {
    int num_uno = 0;
    int num_dos = 0;
    int num_tres = 0;
    int resultado = 0;
    Scanner s = new Scanner(System.in);
    {

      System.out.println("Escribe el valor a");
      num_uno = s.nextInt();
      System.out.println("Escribe el valor b");
      num_dos = s.nextInt();
      System.out.println("Escribe el valor c");
      num_tres = s.nextInt();
      if ((num_uno == 0) && (num_dos == 0) && (num_tres == 0)) {
        System.out.println("La ecuación tiene infinitas soluciones.");
      }

      if ((num_uno == 0) && (num_dos == 0) && (num_tres != 0)) {
        System.out.println("La ecuación no tiene solución."); 
      }

      if ((num_uno != 0) && (num_dos != 0) && (num_tres == 0)) {
        System.out.println("x1 = 0");
        System.out.println("x2 = " + (-num_dos / num_uno));
      }

      if ((num_uno == 0) && (num_dos != 0) && (num_tres != 0)) {
        System.out.println("x1 = x2 = " + (-num_tres / num_dos));
      }

      if ((num_uno != 0) && (num_dos != 0) && (num_tres != 0)) {
        resultado = num_dos * num_dos - (4 * num_uno * num_tres);

        if (resultado < 0) {
          System.out.println("La ecuación no tiene soluciones reales"); //En caso de que el resultado sea 0 no habrian soluciones reales
        } else {

          System.out.println("x1 = " + (-num_dos + Math.sqrt(resultado)) / (2 * num_uno)); //Aqui calculo la raiz cuadrada en caso de que sea positivo y lo divido entre 2, multiplicado por el numero

          System.out.println("x2 = " + (-num_dos - Math.sqrt(resultado)) / (2 * num_uno)); //Aqui calculo la raiz cuadrada en caso de que sea negativo y lo divido entre 2, multiplicado por el numero
          s.close();
        }
      }
    }
  }
}