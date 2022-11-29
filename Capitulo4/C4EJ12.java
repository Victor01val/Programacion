
/*
 * Víctor Valverde Olmedo 1 DAW
 * Cuestionario
 */
package Capitulo4;
import java.util.Scanner;

public class C4EJ12 {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    {
      int respuesta1 = 0;
      int acertadas = 0;
      String palabra;
      String nombre;
      int incorrectas = 0;
      System.out.println("Introduce tu nombre completo");
      nombre = s.nextLine();
      System.out.println(
          "1. Responde a este cuestionario para poner a prueba tus conocimientos sobre las materias de este curso.");
      System.out.println("¿Cuántos TBs puede tener como máximo una SSD?");
      respuesta1 = s.nextInt();
      if (respuesta1 == 4) {
        acertadas = acertadas + 1;
        System.out.println("Correcto");
      } else {
        System.out.println("Incorrecto");
        incorrectas = incorrectas + 1;
      }
      System.out.println("2. Git es...");
      System.out.println("A) Herramienta que los desarrolladores instalan localmente para gestionar el código fuente");
      System.out.println("B) Plataforma basada en la nube");
      palabra = s.next();
      if (palabra.equalsIgnoreCase("A")) {
        acertadas = acertadas + 1;
        System.out.println("Correcto");
      } else {
        System.out.println("Incorrecto");
        incorrectas = incorrectas + 1;
      }
      System.out.println("3. JAVA es...");
      System.out.println("A) Un lenguaje orientado a clases");
      System.out.println("B) Un lenguaje orientado a objetos");
      palabra = s.next();
      if (palabra.equalsIgnoreCase("B")) {
        acertadas = acertadas + 1;
        System.out.println("Correcto");
      } else {
        System.out.println("Incorrecto");
        incorrectas = incorrectas + 1;
      }
      System.out.println("4. ¿Cuál fue el primer ordenador del mundo?");
      System.out.println("A) Transistores");
      System.out.println("B) Microprocesadores");
      System.out.println("C) Valvulas de vacío");
      System.out.println("D) Chips");
      palabra = s.next();
      if (palabra.equalsIgnoreCase("C")) {
        acertadas = acertadas + 1;
        System.out.println("Correcto");
      } else {
        System.out.println("Incorrecto");
        incorrectas = incorrectas + 1;
      }
      System.out.println("5. ¿Cuál fue el primer juego del mundo?");
      System.out.println("A) Nought and Crosses");
      System.out.println("B) Mario Bros");
      System.out.println("C) Pac-Man");
      System.out.println("D) Terraria");
      palabra = s.next();
      if (palabra.equalsIgnoreCase("A")) {
        acertadas = acertadas + 1;
        System.out.println("Correcto");
      } else {
        System.out.println("Incorrecto");
        incorrectas = incorrectas + 1;
      }
      System.out.println("6. ¿Cuál es el lenguaje de programación más usado actualmente?");
      System.out.println("A) C++");
      System.out.println("B) Python");
      System.out.println("C) Java");
      System.out.println("D) Javascript");
      palabra = s.next();
      if (palabra.equalsIgnoreCase("C")) {
        acertadas = acertadas + 1;
        System.out.println("Correcto");
      } else {
        System.out.println("Incorrecto");
        incorrectas = incorrectas + 1;
      }
      System.out.println("7. ¿Qué son los lenguajes de marca?");
      System.out.println("A) Lenguajes hipertextuales");
      System.out.println("B) Lenguajes de alto nivel");
      System.out.println("C) Lenguajes orientado a objetos");
      System.out.println("D) Lenguaje de máquina");
      palabra = s.next();
      if (palabra.equalsIgnoreCase("A")) {
        acertadas = acertadas + 1;
        System.out.println("Correcto");
      } else {
        System.out.println("Incorrecto");
        incorrectas = incorrectas + 1;
      }
      System.out.println("8. ¿Cuál es el mejor IDE del mercado?");
      System.out.println("A) Visual Studio Code");
      System.out.println("B) Eclipse");
      System.out.println("C) Geany");
      System.out.println("D) Intellij Idea");
      palabra = s.next();
      if (palabra.equalsIgnoreCase("D")) {
        acertadas = acertadas + 1;
        System.out.println("Correcto");
      } else {
        System.out.println("Incorrecto");
        incorrectas = incorrectas + 1;
      }
      System.out.println("9. ¿Qué es una máquina virtual?");
      System.out.println("A) Un instalador");
      System.out.println("B) Software capaz de instalar S.Os dentro de tu S.O");
      System.out.println("C) Software capaz de iniciar una nueva sesión en tu escritorio");
      System.out.println("D) Un espacio aislado de Windows");
      palabra = s.next();
      if (palabra.equalsIgnoreCase("B")) {
        acertadas = acertadas + 1;
        System.out.println("Correcto");
      } else {
        System.out.println("Incorrecto");
        incorrectas = incorrectas + 1;
      }
      System.out.println("10. ¿Qué es la VRAM?");
      System.out.println("A) Memoria que permite tener abierta muchas tareas a la vez");
      System.out.println("B) Memoria diseñada para tareas específicas como videojuegos");
      System.out.println("C) Una RAM especial");
      System.out.println("D) Una nueva versión de RAM");
      palabra = s.next();
      if (palabra.equalsIgnoreCase("B")) {
        acertadas = acertadas + 1;
        System.out.println("Correcto");
      } else {
        System.out.println("Incorrecto");
        incorrectas = incorrectas + 1;

      }

      System.out.println(nombre + " tu nota fue de " + acertadas + " sobre 10.");
      System.out.println("Te has equivocado en: " + incorrectas + " preguntas.");
      s.close();
    }
  }
}
