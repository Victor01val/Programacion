
/*
 * Víctor Valverde Olmedo 1 DAW TARDES
 * Estaciones del año
 */
import java.util.Scanner;

public class C4Estaciones {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    {
      System.out.println("Introduce la estación\n1: Invierno\n2: Primavera\n3: Verano\n4: Otoño");
      int estacion = s.nextInt();
      String NombreEstacion;
      switch (estacion) {
        case 1:
          NombreEstacion = "Invierno";
          break;
        case 2:
          NombreEstacion = "Primavera";
          break;
        case 3:
          NombreEstacion = "Verano";
          break;
        case 4:
          NombreEstacion = "Otoño";
          break;
        default:
          NombreEstacion = "No existe estacion";
      }
      System.out.println("La estación es  " + estacion + "  " + NombreEstacion);
      s.close(); // Evitar errores
    }
  }
}
