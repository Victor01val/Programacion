/*
 * Víctor Valverde Olmedo
 * Calcular base imponible
 * Este ejercicio funciona 100% pero el codigo es muy extenso y mal hecho por un error que no sabia solucionar antes
 * !
 * !
 * !
 * !
 * !
 */
package Capitulo4;
import java.util.Scanner;

public class C4EJ23 {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    {
      System.out.println("Introduce la base imponible");
      double baseimponible = s.nextDouble();
      System.out.println("Introduce el tipo de IVA\n1.- General\n2.- Reducido\n3.- Superreducido");
      int escoger = s.nextInt();
      switch (escoger) {
        case 1:
          break;
        case 2:
          break;
        case 3:
          break;
        default:

      }
      System.out.println("Introduce el código promocional\n1.- Nopro\n2.- Mitad\n3.- Meno5\n4.- 5porc");
      int escoger2 = s.nextInt();
      switch (escoger2) {
        case 1:
          break;
        case 2:
          break;
        case 3:
          break;
        case 4:
          break;
        default:
      }
     
      if (escoger == 1) {
        double IVA = 0.21 * baseimponible;
        double resultadoIVA = baseimponible + IVA;
        if (escoger2 == 1) {
        
          System.out.printf("%-10s      %8.2f\n", "Base imponible:", +baseimponible);
          System.out.printf("%-10s      %11s\n", "IVA:", "21%");
          System.out.printf("%-10s      %8.2f\n", "Precio con IVA:", +resultadoIVA);
          System.out.printf("%-10s      %3s\n", "Cod promocional:", "0");
          System.out.printf("%-10s      %13.2f\n", "TOTAL:", +resultadoIVA);

          
        }
        if (escoger2 == 2) {
        
          double resultadoPromocion = resultadoIVA/2;
    
          System.out.printf("%-10s      %8.2f\n", "Base imponible:", +baseimponible);
          System.out.printf("%-10s      %11s\n", "IVA:", "21%");
          System.out.printf("%-10s      %8.2f\n", "Precio con IVA:", +resultadoIVA);
          System.out.printf("%-10s      %7s\n",  "Cod promocional:", "-"+resultadoPromocion);
          System.out.printf("%-10s      %13.2f\n", "TOTAL:", +resultadoPromocion);
        }
        if (escoger2 == 3) {
        
          double resultadoPromocion = resultadoIVA-5;
          System.out.printf("%-10s      %8.2f\n", "Base imponible:", +baseimponible);
          System.out.printf("%-10s      %11s\n", "IVA:", "21%");
          System.out.printf("%-10s      %8.2f\n", "Precio con IVA:", +resultadoIVA);
          System.out.printf("%-10s      %3s\n", "Cod promocional:", "-5");
          System.out.printf("%-10s      %13.2f\n",  "TOTAL:", +resultadoPromocion);
        }
        if (escoger2 == 4) {
        
          double resultadoPromocion1 = (resultadoIVA*0.05);
          double resultadoPromocion2 = resultadoIVA - resultadoPromocion1;
          System.out.printf("%-10s      %8.2f\n", "Base imponible:", +baseimponible);
          System.out.printf("%-10s      %11s\n", "IVA:", "21%");
          System.out.printf("%-10s      %8.2f\n", "Precio con IVA:", +resultadoIVA);
          System.out.printf("%-10s      %4s\n", "Cod promocional:", "5%");
          System.out.printf("%-10s      %13.2f\n", "TOTAL:", +resultadoPromocion2);
        }
      }
      if (escoger == 2) {
        double IVA = 0.10 * baseimponible;
        double resultadoIVA = baseimponible + IVA;
        if (escoger2 == 1) {
        
          System.out.printf("%-10s      %8.2f\n", "Base imponible:", +baseimponible);
          System.out.printf("%-10s      %11s\n", "IVA:", "10%");
          System.out.printf("%-10s      %8.2f\n", "Precio con IVA:", +resultadoIVA);
          System.out.printf("%-10s      %3s\n", "Cod promocional:", "0");
          System.out.printf("%-10s      %13.2f\n", "TOTAL:", +resultadoIVA);
         
          
        }
        if (escoger2 == 2) {
        
          double resultadoPromocion = resultadoIVA/2;
          System.out.printf("%-10s      %8.2f\n", "Base imponible:", +baseimponible);
          System.out.printf("%-10s      %11s\n", "IVA:", "10%");
          System.out.printf("%-10s      %8.2f\n", "Precio con IVA:", +resultadoIVA);
          System.out.printf("%-10s      %7s\n", "Cod promocional:", "-"+resultadoPromocion);
          System.out.printf("%-10s      %13.2f\n", "TOTAL:", +resultadoPromocion);
        }
        if (escoger2 == 3) {
        
          double resultadoPromocion = resultadoIVA-5;
          System.out.printf("%-10s      %8.2f\n", "Base imponible:", +baseimponible);
          System.out.printf("%-10s      %11s\n", "IVA:", "10%");
          System.out.printf("%-10s      %8.2f\n", "Precio con IVA:", +resultadoIVA);
          System.out.printf("%-10s      %3s\n", "Cod promocional:", "-5");
          System.out.printf("%-10s      %13.2f\n", "TOTAL:", +resultadoPromocion);
        }
        if (escoger2 == 4) {
        
          double resultadoPromocion1 = (resultadoIVA*0.05);
          double resultadoPromocion2 = resultadoIVA - resultadoPromocion1;
          System.out.printf("%-10s      %8.2f\n", "Base imponible:", +baseimponible);
          System.out.printf("%-10s      %11s\n", "IVA:", "21%");
          System.out.printf("%-10s      %8.2f\n", "Precio con IVA:", +resultadoIVA);
          System.out.printf("%-10s      %4s\n", "Cod promocional:", "5%");
          System.out.printf("%-10s      %13.2f\n", "TOTAL:", +resultadoPromocion2);
        }
      }
      if (escoger == 3) {
        double IVA = 0.05 * baseimponible;
        double resultadoIVA = baseimponible + IVA;
        if (escoger2 == 1) {
        
          System.out.printf("%-10s      %8.2f\n", "Base imponible:", +baseimponible);
          System.out.printf("%-10s      %10s\n", "IVA:", "5%");
          System.out.printf("%-10s      %8.2f\n", "Precio con IVA:", +resultadoIVA);
          System.out.printf("%-10s      %3s\n", "Cod promocional:", "0");
          System.out.printf("%-10s      %13.2f\n", "TOTAL:", +resultadoIVA);
    
        }
        if (escoger2 == 2) {
        
          double resultadoPromocion = resultadoIVA/2;
          
          System.out.printf("%-10s      %8.2f\n", "Base imponible:", +baseimponible);
          System.out.printf("%-10s      %10s\n", "IVA:", "5%");
          System.out.printf("%-10s      %8.2f\n", "Precio con IVA:", +resultadoIVA);
          System.out.printf("%-10s      %7s\n", "Cod promocional:", "-"+resultadoPromocion);
          System.out.printf("%-10s      %13.2f\n", "TOTAL:", +resultadoPromocion);
        }
        if (escoger2 == 3) {
        
          double resultadoPromocion = resultadoIVA-5;
         
          System.out.printf("%-10s      %8.2f\n", "Base imponible:", +baseimponible);
          System.out.printf("%-10s      %10s\n", "IVA:", "5%");
          System.out.printf("%-10s      %8.2f\n", "Precio con IVA:", +resultadoIVA);
          System.out.printf("%-10s      %3s\n", "Cod promocional:", "-5");
          System.out.printf("%-10s      %13.2f\n", "TOTAL:", +resultadoPromocion);
        }
        if (escoger2 == 4) {
        
          double resultadoPromocion1 = (resultadoIVA*0.05);
          double resultadoPromocion2 = resultadoIVA - resultadoPromocion1;
          System.out.printf("%-10s      %8.2f\n", "Base imponible:", +baseimponible);
          System.out.printf("%-10s      %10s\n", "IVA:", "5%");
          System.out.printf("%-10s      %8.2f\n", "Precio con IVA:", +resultadoIVA);
          System.out.printf("%-10s      %4s\n", "Cod promocional:", "5%");
          System.out.printf("%-10s      %13.2f\n", "TOTAL:", +resultadoPromocion2);
        }
      }

      s.close(); // Evitar errores
    }
  }
}