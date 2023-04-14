package Capitulo7;

public class Ejercicio {
  public static void main(String args[]) {
    int t = 100;
    int[] num = new int[t];
    for (int i = 0; i < t; i++) {
      num[i] = (int) (Math.random() * 10 + 1);
      System.out.printf("%3d", +num[i]);
    }
  }
}