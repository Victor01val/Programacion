/*
 * Víctor Valverde Olmedo
 * Temperatura media en cada mes
 */
package Capitulo7;
import java.util.Scanner;
public class C7EJ8 {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in); {
String[] mes = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
int[] temp = new int[40];
for(int i=0; i<12; i++) {
System.out.print("Dame una temperatura media para el mes " +mes[i]+": ");
temp[i] = s.nextInt();
}
for (int j = 0; j < 12; j++) {
  
  System.out.println(mes[j]+" "+temp[j]);


}

}
s.close(); //Evitar errores
  }
}
