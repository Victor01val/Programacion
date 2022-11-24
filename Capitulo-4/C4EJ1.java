
/*
 * Víctor Valverde Olmedo 1 DAW TARDES
 * Que asignatura toca a X hora
 */
import java.util.Scanner;

public class C4EJ1 {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    {
      System.out.println("Escribe un día de la semana y te diré que asignatura toca a primera hora");
      int dia = s.nextInt();
      String diasemana;
      switch (dia) {
        case 1:
          diasemana = "FOL";
          break;
        case 2:
          diasemana = "Bases de datos";
          break;
        case 3:
          diasemana = "Bases de datos";
          break;
        case 4:
          diasemana = "Sistemas informaticos";
          break;
        case 5:
          diasemana = "Lenguajes de marca";
          break;
        default:
          diasemana = "Incorrecto";

      }
      System.out.println("A primera hora toca " + diasemana);
      s.close(); //Evitar errores
    }
  }
}
