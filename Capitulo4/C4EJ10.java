/*
 * Víctor Valverde Olmedo 1 DAW TARDES
 * 
 */
package Capitulo4;
import java.util.Scanner;
public class C4EJ10 {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in); {
      System.out.println("Escribe un mes y te diré tu horóscopo");
      int dia = s.nextInt();
      String horoscopo;
      switch (dia) {
        case 1:
          horoscopo = "Capricornio";
          break;
        case 2:
          horoscopo = "Acuario";
          break;
        case 3:
          horoscopo = "Piscis";
          break;
        case 4:
          horoscopo = "Aries";
          break;
        case 5:
          horoscopo = "Tauro";
          break;
        case 6:
          horoscopo = "Geminis";
        case 7:
          horoscopo = "Cancer";
          break;
          case 8:
          horoscopo ="Leo";
          break;
          case 9:
          horoscopo ="Virgo";
          break;
          case 10:
          horoscopo="Libra";
          case 11: 
        horoscopo="Escorpio";
        break;
        case 12:
        horoscopo= "Sagitario";
        break;
        default:
          horoscopo = "Incorrecto";

      }
      System.out.println("El mes " + dia + "  es " + horoscopo);
      s.close(); //Evitar errores
    }


      s.close(); //Evitar errores
    }
  }

