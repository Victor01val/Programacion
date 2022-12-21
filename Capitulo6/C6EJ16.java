/*
 * Víctor Valverde Olmedo
 * Simulador de maquinas tragaperras
 */
package Capitulo6;

public class C6EJ16 {
  public static void main (String args[]) {
    

    int a = 0;
    String f = ""; 
    int contador = 0;
    String b = "";
    String c = "";
    String d = "";
    
    for(int i = 1; i <= 3; i++){
    a = (int)(Math.random()*5+1);
    switch(a){
      case(1):
      f = "Corazón";
      contador++;
      break;
      case(2):
      f = "Diamante";
      contador++;
      break;
      case(3):
      f = "Herradura";
      contador++;
      break;
      case(4):
      f = "Campana";
      contador++;
      break;
      case(5):
      f = "Limón";
      contador++;
      break;
      default:
     }
     System.out.print(f + " ");
      System.out.println("");
     
      if(contador == 1){
        b = f;
        }
        
         if(contador == 2){
        c = f;
        }
        
         if(contador == 3){
        d = f;
      }
          
          
        
    }
       
          
       if((b == c && c != d) || (b != c && c == d) || (b == d && c != b )){
          System.out.print("Bien, ha recuperado su moneda");
        }
          
        if(b == c && b == d && c == d){
          System.out.print("¡Enhorabuena ha ganado 10 monedas!");
        }
        if (b != c && b != d && c != d){
            System.out.print("Lo siento, ha perdido");
          }
  }
}

