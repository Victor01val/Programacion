/*
 *Víctor Valverde Olmedo Ejercicio 9
 Volumen de un cono
 */
import java.util.Scanner;

public class C3EJ9 {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    {
      System.out.println("Introduce un radio");
      int radio = s.nextInt();
      int radio2 = radio * radio;
      System.out.println("Introduce la altura");
      int altura = s.nextInt();
      double Resultado = 3.14 * altura * radio2;
      int Resultado2 = (int) Resultado;
      System.out.println("El volumen de un cono es " + Resultado2);
      s.close(); //Evitar errores
    }
  }
}