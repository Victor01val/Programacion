/*
 * Víctor Valverde Olmedo
 * Ejercicios del 1 al 14
 */
package Capitulo8;

import java.util.Scanner;

public class EJ1al6 {

  public static int esCapicua(int num) { 
    int numeroalreves = 0;
    while (num > 0) {
      numeroalreves = numeroalreves * 10 + num % 10;
      num /= 10;
    }
    return numeroalreves;
  }

  public static boolean esPrimo(int n) {

    for (int i = 2; i < n; i++) {
      if (n % i == 0) {
        return false;
      }
    }
    return true;
  }

  public static int siguientePrimo(int n) {
    boolean primo = false;
    while (primo == false) {
      n++;
      primo = esPrimo(n);
    }
    return n;
  }

  public static int potencia(int b, int e) {
    int p = 1;
    for (int i = 0; i < e; i++) {
      p = b * p;
    }
    return p;
  }
  public static int digitos(int n) {
    int numeroDeDigitos = 1;
    while (n > 10) {
      n /= 10;
      numeroDeDigitos++;
    }
    return numeroDeDigitos;

  }
public static int voltea(int numero) {
  int resto;
  int invertido = 0;
  while( numero > 0 ) {
    resto = numero % 10;
    invertido = invertido * 10 + resto;
    numero /= 10;
 }
  return invertido;
}

  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    {
      System.out.println("Ingresa un número: ");
      int num = s.nextInt();
      int numerooriginal = 0;
      int numeroalreves = 0;
      int num1 = esCapicua(num);
      if (numerooriginal == numeroalreves) {
        System.out.println("El número es capicúa");
      } else {
        System.out.println("El número no es capicúa");
      }
      System.out.println(num1);
      System.out.println("Introduce un número");
      int n = s.nextInt();
      boolean primo2 = esPrimo(n);
      if (primo2) {
        System.out.println("El número es primo");
      } else {
        System.out.println("El número no es primo");
      }
      System.out.println("Introduce un numero");
      n = s.nextInt();
      int primo3 = siguientePrimo(n);
      System.out.println(primo3);
    }
    System.out.println("Introduce una base y un exponente");
    int b = s.nextInt();
    int e = s.nextInt();
    int p = potencia(b, e);
    System.out.println(p);
    System.out.println("Introduce un numero de digitos");
    int numerodigitos = s.nextInt();
    int n = digitos(numerodigitos);
    System.out.println(n);
    System.out.println("Introduce un numero para voltear");
     n = s.nextInt();
     int numero = voltea(n);
     System.out.println(numero);
    s.close();
  }
}