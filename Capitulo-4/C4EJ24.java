
/*
 * Víctor Valverde Olmedo 1 DAW TARDES
 * Calcular sueldo
 */
import java.util.Scanner;

public class C4EJ24 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    {
      System.out.println("Introduce el cargo del empleado\n1 - Programador junior\n2 - Prog. senior\n3.- Jefe de proyecto");
      int cargo = s.nextInt();

      System.out.println("Cuantos días ha estado de viaje visitando clientes?");
      int diasdevisita = s.nextInt();
      System.out.println("Introduzca su estado civil\n1.- Soltero\n2.- Casado");
      int estadoCivil = s.nextInt();
      double sueldoBase = 0;
      switch (cargo) {
        case 1:
          sueldoBase = 950;
          break;
        case 2:
          sueldoBase = 1200;
          break;
        case 3:
          sueldoBase = 1600;
          break;
        default:
          System.out.println("No ha elegido correctamente el sueldo base.");
      }
      double sueldodedietas = diasdevisita * 30;
      double sueldobruto = sueldoBase + sueldodedietas;
      double irpf = 0;
      if (estadoCivil == 1) {
        irpf = 25;
      } else if (estadoCivil == 2) {
        irpf = 20;
      } else {
        System.out.println("Incorrecto");
      }
      double cuantiaIrpf = (sueldobruto * irpf) / 100;
      System.out.printf("Sueldo base %7.2f \n", sueldoBase);
      System.out.printf("Dietas (%2d viajes) %7.2f \n", diasdevisita, sueldodedietas);
      System.out.printf("Retención IRPF (%.0f%%) %7.2f \n", irpf, cuantiaIrpf);
      System.out.printf("Sueldo neto %7.2f \n", sueldobruto - cuantiaIrpf);
      s.close(); //Evitar errores
    }
  }
}