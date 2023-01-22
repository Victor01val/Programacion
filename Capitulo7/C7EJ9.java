/*
 * Víctor Valverde Olmedo
 * 8 numeros y dice si es par o impar en un array
 */
package Capitulo7;
import java.util.Scanner;
public class C7EJ9 {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in); {
int[] n = new int[9];
int i;
System.out.print("Escribe 8 números");
for(i=0; i<8; i++) {
 n[i] = s.nextInt();
}

for(i=0; i<8; i++) {
 
if((n[i]% 2) == 0){
  System.out.print(n[i]+"par"+" ");
} else {
  System.out.print(n[i]+"impar"+" ");
}
}
s.close(); //Evitar errores
    }
  }
}
