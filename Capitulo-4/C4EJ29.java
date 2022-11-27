/*
 * Víctor Valverde Olmedo
 * Carta 
 */
import java.util.Scanner;

public class C4EJ29 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    String pitufo = "";
    String resultado = "";
    double pcomida = 0;
    double pbebida = 0;

    System.out.print("Que has tomado de comer? (palmera, donut o pitufo): ");
    String comida = s.nextLine();
    if (comida.equalsIgnoreCase("pitufo")) {
      System.out.print("Con que se ha tomado el pitufo? (aceite o tortilla): ");
      pitufo = s.nextLine();
      if (pitufo.equalsIgnoreCase("aceite")) {
        resultado = "Pitufo con aceite: 1,20 €";
        pcomida = 1.20;
      } else if (pitufo.equalsIgnoreCase("tortilla")) {
        resultado = "Pitufo con tortilla: 1,60 €";
        pcomida = 1.60;
      }
    } else if (comida.equalsIgnoreCase("palmera")) {
      resultado = "Palmera: 1,40 €";
      pcomida = 1.40;
    } else if (comida.equalsIgnoreCase("donut")) {
      resultado = "Donut: 1,00 €";
      pcomida = 1.00;
    }

    System.out.print("Que ha tomado de beber? (zumo o cafe): ");
    String bebida = s.nextLine();
    if (bebida.equalsIgnoreCase("zumo")) {
      resultado += "\nZumo: 1,50 €";
      pbebida = 1.50;
    } else if (bebida.equalsIgnoreCase("cafe")) {
      resultado += "\nCafe: 1,20 €";
      pbebida = 1.20;
    }
    System.out.println(resultado);
    System.out.printf("Total desayuno: %.2f €\n", pcomida + pbebida);
    s.close(); //Evitar errores
  }
}