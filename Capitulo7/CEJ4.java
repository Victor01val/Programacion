/*
 * Víctor Valverde Olmedo
 * Igual que el anterior pero las sumas parciales y totales se quedan pensando
 */
package Capitulo7;
import java.util.Random;

public class CEJ4 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] nnumero = new int[10];
       
        for (int i = 0; i < 10; i++) {
            nnumero[i] = rand.nextInt(201);
        }
  
        for (int i = 0; i < 10; i++) {
            System.out.println("Numeros " + i + ": " + nnumero[i]);
        }
       
        int[] nsorteado = new int[10];
        int index = 0;
        for (int i = 0; i < 10; i++) {
            if (nnumero[i] <= 100) {
                nsorteado[index] = nnumero[i];
                index++;
            }
        }
        for (int i = 0; i < 10; i++) {
            if (nnumero[i] > 100) {
                nsorteado[index] = nnumero[i];
                index++;
            }
        }
      
        for (int i = 0; i < 10; i++) {
            System.out.println("Numeros " + i + ": " + nsorteado[i]);
        }
    }
}