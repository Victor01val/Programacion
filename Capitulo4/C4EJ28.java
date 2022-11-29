
/*
 * Víctor Valverde Olmedo
 * Piedra papel o tijeras
 */
package Capitulo4;
import java.util.Scanner;

public class C4EJ28 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Turno del jugador 1. Introduce piedra, papel o tijera: ");
    String jugador1 = s.nextLine();
    System.out.println("Turno del jugador 2. Introduce piedra, papel o tijera: ");
    String jugador2 = s.nextLine();
    if (jugador1.equals(jugador2)) {
      System.out.println("Empate");
    } else {
      int ganador = 2;
      switch (jugador1) {
        case "piedra":
          if (jugador2.equals("Tijera")) {
            ganador = 1;
          }
          break;
        case "papel":
          if (jugador2.equals("Piedra")) {
            ganador = 1;
          }
          break;
        case "tijera":
          if (jugador2.equals("Papel")) {
            ganador = 1;
          }
          break;
        default:

      }
      System.out.println("Gana el jugador " + ganador);
      s.close(); //Evitar errores
    }
  }
}
