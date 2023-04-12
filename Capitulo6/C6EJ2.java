/*
 * Víctor Valverde Olmedo
 * Muestra al azar un nombre de una baraja francesañ
 */
package Capitulo6;

public class C6EJ2 {
  public static void main (String args[]) {
    
    String palo = "";
    String carta = "";
    
    int n = (int)(Math.random()*4) + 1;
    
    switch(n){
      case(1):
      palo = "picas";
      break;
      case(2):
      palo = "corazones";
      break;
      case(3):
      palo = "diamantes";
      break; 
      case(4):
      palo = "tréboles";
      break;
      }
      
      int n2 = (int)(Math.random()*13) + 1;
      switch(n2){
        case(1):
        carta = "AS";
        break;
        case(11):
        carta = "J";
        break;
        case(12):
        carta = "Q";
        break;
        case(13):
        carta ="K"; 
        break;
        
        default:
        carta = String.valueOf(n2);
        
        }
        System.out.print("Ha salido la carta " + carta + " de " + palo);
  }
}

