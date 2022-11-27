
/*
 * Víctor Valverde Olmedo 1 DAW TARDES
 * Calcular cuanto queda para el finde semana
 */
import java.util.Scanner;

public class C4EJ22 {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    {
      int mas_dias = 0;
      String diasemana;
      int resta = 0;

      System.out.println("Introduce un día (con números)\n1.- Lunes\n2.- Martes\n3.- Miercoles\n4.- Jueves\n5.- Viernes");
      int escoger = s.nextInt();
      switch (escoger) {
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
        default:
          diasemana = "Incorrecto";

      }
      if (escoger > 5) {
        
        System.out.println("Escoge un día correcto");
        s.close(); // Evitar errores
        return;
      }
      if (escoger == 0) {
        System.out.println("Escoge un día correcto");
        s.close(); // Evitar errores
        return;
      }
      System.out.println("El día escogido es  " + diasemana);
      System.out.println("Introduce una hora");
      int hora = s.nextInt();
      if (escoger == 5) {
        if (hora > 15 && hora <24) {
          System.out.println("A partir de las 15:00 es findesemana");
          s.close(); //Evitar errores
          return;
        }
         if(escoger ==5) { 
        if (hora > 24) {
          System.out.println("Hora incorrecta");
          s.close(); //Evitar errores  
          return;
        }
        }
        }
      
      if (hora > 24) {
        System.out.println("Hora incorrecta");
        s.close(); // Evitar errores
        return;
      }
      System.out.println("Introduce los minutos");
      int minutos = s.nextInt();
      if (minutos > 60) {
        System.out.println("Te has pasado");
        s.close(); // Evitar errores
        return;
      }
      int horamultiplicada = hora * 60;
      int horasyminutos = horamultiplicada + minutos;

      if (escoger == 1) {
        mas_dias = 6660; // Minutos totales desde el Lunes a las 00:00 hasta el Viernes a las 15:00

        resta = mas_dias - (horasyminutos);
        System.out.println("Quedan  " + resta + " minutos para el finde semana");
      }
      if (escoger == 2) {
        mas_dias = 5220; // Minutos totales desde el Martes a las 00:00 hasta el Viernes a las 15:00
        resta = mas_dias - (horasyminutos);
        System.out.println("Quedan  " + resta + " minutos para el finde semana");
      }
      if (escoger == 3) {
        mas_dias = 3780; // Minutos totales desde el Miercoles a las 00:00 hasta el Viernes a las 15:00
        resta = mas_dias - (horasyminutos);
        System.out.println("Quedan  " + resta + " minutos para el finde semana");
      }
      if (escoger == 4) {
        mas_dias = 2340; // Minutos totales desde el Jueves a las 00:00 hasta el Viernes a las 15:00
        resta = mas_dias - (horasyminutos);
        System.out.println("Quedan  " + resta + " minutos para el finde semana");
      }
      if (escoger == 5) {
        mas_dias = 900; // Minutos totales desde el Viernes a las 00:00 hasta el Viernes a las 15:00
        resta = mas_dias - horasyminutos;
        System.out.println("Quedan  " + resta + " minutos para el finde semana");
      }
      s.close(); // Evitar errores
    }
  }
}

