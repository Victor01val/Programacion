/*
 * Víctor Valverde Olmedo
 * Array con el numero, el cuadrado y el cubo de 20 numeros aleatorios entre 0 y 100
 */
package Capitulo7;

public class C7EJ4 {
  public static void main(String args[]) {
    int[] numero = new int[20];
int[] cuadrado = new int[20];
int[] cubo = new int[20];
int i;
for (i = 0; i < 20; i++) {
numero[i] = (int)(Math.random()*101);
cuadrado[i] = numero[i] * numero[i];
cubo[i] = cuadrado[i] * numero[i];
}
System.out.println("A continuación se muestra el numero, el cuadrado y el cubo");
for (i = 0; i < 20; i++) {
System.out.print(numero[i]+"   " + cuadrado[i]+"   " + cubo[i]+" "+"\n");
}
}
}


