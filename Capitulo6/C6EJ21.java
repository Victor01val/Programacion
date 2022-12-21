/*
 * Víctor Valverde Olmedo
 * Lanza una secuencia de cinco monedas lanzadas
 */
package Capitulo6;

public class C6EJ21 {
  public static void main (String args[]) {

    int a = 0;
    String M = "";
    String s = "";
    
    for(int i = 1; i <= 5; i++){
      a = (int)(Math.random()*2)+1;
      
      switch(i){
        case(1):
        M = " 2 céntimos";
        break;
        case(2):
        M = " 20 céntimos";
        break;
        case(3):
        M = " 50 céntimos";
        break;
        case(4):
        M = " 1 €uros";
        break;
        case(5):
        M = " 2 €uros";
        break;
        }
        
        switch(a){
          case(1):
          s = "Cara";
          break;
          case(2):
          s = "Cruz";
          break;
          }
          
          System.out.println(M + " - " + s);
      }
    
	}
}

