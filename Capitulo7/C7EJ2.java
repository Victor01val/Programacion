package Capitulo7;

public class C7EJ2 {
  public static void main(String args[]) {
    char[] letra = new char[12];
    letra[0] = 'a';
    letra[1] = 'x';
    letra[4] = '@';
    letra[6] = '.';
    letra[7] = '+';
    letra[8] = 'Q';
    letra[9] = '.';
    for (int i = 0; i < 12; i++) {
      System.out.print(+i + ": " + "Letra " + letra[i] + " \n");
    }
  }
}
