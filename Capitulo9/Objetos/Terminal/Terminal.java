package Capitulo9.Objetos.Terminal;

public class Terminal {
  public static void main(String args[]) {
    Term t1 = new Term("644 23 50 69");
    Term t2 = new Term("644 74 44 69");
    Term t3 = new Term("622 32 89 09");
    Term t4 = new Term("664 73 98 18");
    System.out.println(t1);
    System.out.println(t2);
    t1.llama(t2, 500);
    t2.llama(t3, 900);
    System.out.println(t1);
    System.out.println(t2);
    System.out.println(t3);
    System.out.println(t4);

  }
}