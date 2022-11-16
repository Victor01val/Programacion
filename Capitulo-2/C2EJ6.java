/* VICTOR VALVERDE OLMEDO   EJ6.java
factura a partir de la base imponible 
*/

public class C2EJ6 {

  public static void main(String args[]) {
    double baseImponible = 180.25;
    System.out.printf("Base imponible %10.2f\n", baseImponible);
    System.out.printf("IVA            %10.2f\n", (baseImponible * 0.21));
    System.out.printf("-----------------------\n");
    System.out.printf("Total          %10.2f\n", (baseImponible * 1.21));
  }
}
  
  

