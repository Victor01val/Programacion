
/*
 * Víctor Valverde Olmedo 1 DAW TARDES
 * Dia de la semana
 */
package Capitulo4;
import java.util.Scanner;

public class C4EJ3 {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    {
      System.out.println("Escribe un día de la semana y te dire cuál es");
      int dia = s.nextInt();
      String diasemana;
      switch (dia) {
        case 1:
          diasemana = "Lunes";
          break;
        case 2:
          diasemana = "Martes";
          break;
        case 3:
          diasemana = "Miercoles";
          break;
        case 4:
          diasemana = "Jueves";
          break;
        case 5:
          diasemana = "Viernes";
          break;
        case 6:
          diasemana = "Sabado";
        case 7:
          diasemana = "Domingo";
          break;
        default:
          diasemana = "Incorrecto";

      }
      System.out.println("El día " + dia + "  de la semana es " + diasemana);
      s.close(); //Evitar errores
    }
  }
}
