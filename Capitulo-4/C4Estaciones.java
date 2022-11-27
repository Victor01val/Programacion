
/*
 * Víctor Valverde Olmedo 1 DAW TARDES
 * Estaciones del año
 */
import java.util.Scanner;

public class C4Estaciones {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    {
      System.out.println("Introduce el mes\n1: Enero\n2: Febrero\n3: Marzo\n4: Abril\n5: Mayo\n6: Junio\n7: Julio\n8: Agosto\n9: Septiembre\n10: Octubre\n11: Noviembre\n12: Diciembre");
      int estacion = s.nextInt();
      String NombreEstacion;
      switch (estacion) {
        case 1:
        case 2:
        case 3:
          NombreEstacion = "Invierno";
          break;
          case 4:
          case 5:
        case 6:
          NombreEstacion = "Primavera";
          break;
          case 7:
        case 8:
        case 9:
          NombreEstacion = "Verano";
          break;
          case 10:
          case 11:
          case 12:
        
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
