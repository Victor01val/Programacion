package Capitulo9.Animales;

public class Main {
  public static void main(String args[]) {
    // No hay metodo to String
    Ave ave = new Ave("Ave", 4, 5);
    System.out.print(ave.getNombre() + " ");
    System.out.print("edad " + ave.getEdad() + " ");
    System.out.print("peso " + ave.getPeso() + " ");
    System.out.println();
    ave.dormir();
    ave.comer();
    ave.volar();
    //
    Canario canario = new Canario("Canario", 2, 1);
    System.out.println();
    System.out.print(canario.getNombre() + " ");
    System.out.print("edad " + canario.getEdad() + " ");
    System.out.print("peso " + canario.getPeso() + " ");
    System.out.println();
    canario.caminar();
    canario.volar();


    canario.hablar("pio");
    //
    Gato gato = new Gato("Gato", 15, 5);
    System.out.println();
    System.out.print(gato.getNombre() + " ");
    System.out.print("edad " + gato.getEdad() + " ");
    System.out.print("peso " + gato.getPeso() + " ");
    System.out.println();
    gato.moverCola();
    gato.moverOrejas();
    gato.caminar();
    gato.hablar("MIAUUUUUUUUUUU");
    //
    Perro perro = new Perro("Perro", 10, 2);
    System.out.println();
    System.out.print(perro.getNombre() + " ");
    System.out.print("edad " + perro.getEdad() + " ");
    System.out.print("peso " + perro.getPeso() + " ");
    System.out.println();
    perro.moverCola();
    perro.moverOrejas();
    perro.dormir();
    gato.hablar("GUAU GUAU");
    //
    Pinguino pinguino = new Pinguino("Pinguino", 5, 5);
    System.out.println();
    System.out.print(pinguino.getNombre() + " ");
    System.out.print("edad " + pinguino.getEdad() + " ");
    System.out.print("peso " + pinguino.getPeso() + " ");
    System.out.println();
    pinguino.deslizar();
    pinguino.dormir();
    pinguino.caminar();
    //
    Lagarto lagarto = new Lagarto("Lagarto", 1, 1);
    System.out.println();
    System.out.print(lagarto.getNombre() + " ");
    System.out.print("edad " + lagarto.getEdad() + " ");
    System.out.print("peso " + lagarto.getPeso() + " ");
    System.out.println();
    lagarto.atacar();
    lagarto.esconder();
    lagarto.comer();
    //
    Mamifero mamifero = new Mamifero("Mamifero", 6, 9);
    System.out.println();
    System.out.print(mamifero.getNombre() + " ");
    System.out.print("edad " + mamifero.getEdad() + " ");
    System.out.print("peso " + mamifero.getPeso() + " ");
    System.out.println();
    mamifero.moverCola();
    mamifero.moverOrejas();
    mamifero.comer();
  }

}
