/*
 * Víctor Valverde Olmedo
 * Muestra 20 notas generadas al azar. Debe aparecer suspenso, aprobado, sobresaliente...
 */
package Capitulo6;
import java.util.Scanner;
public class C6EJ11 {
  public static void main (String args[]) {
    
    Scanner s = new Scanner(System.in);
    int a = 0;
    String n = "";
    int contador1 = 0;
    int contador2 = 0;
    int contador3 = 0;
    int contador4 = 0;
    int contador5 = 0;
    
    
    for(int i = 1; i <= 20; i++){
      a = (int)(Math.random()*5) + 1;
      switch(a){
        case(1):
        n = "Suspenso";
        contador1++;
        break;
        case(2):
        n ="Suficiente" ;
        contador2++;
        break;
        case(3):
        n = "Bien" ;
        contador3++;
        break;
        case(4):
        n = "Notable";
        contador4++;
        break;
        case(5):
        n = "Sobresaliente";
        contador5++;
        break;
        default:
        }
        System.out.print(n + " " );
      }
      System.out.println("");
      System.out.println("--------------------------------------------------------------------------------");
      System.out.println("Suspenso: " + contador1 + " notas");
      System.out.println("Suficiente: " + contador2 + " notas");
      System.out.println("Bien: " + contador3 + " notas");
      System.out.println("Notable: " + contador4 + " notas");
      System.out.println("Sobresaliente: " + contador5 + " notas");
      s.close(); //Evitar errores
		
	}
}

