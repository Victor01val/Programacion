/* VICTOR VALVERDE OLMEDO   EJ4.java
Conversor de euros a pesetas
*/
package Capitulo2;
public class C2EJ4 {

  public static void main(String[] args) {
    double peseta = 166.386;
    double euros = 1;
    int resultado;
    resultado= (int) (peseta*euros);
    System.out.println(euros + " euro son " + resultado + " pesetas");
  }
}
