/**
 * @author Víctor Valverde Olmedo
 * Programa que comprueba los 5 errores
 */
package Capitulo14;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Random;
public class Ejercicio3 {
       public static void main(String[] args) {
           Random random = new Random();
           int randomNumber = random.nextInt(5); //Variable de tipo entero que introduce por teclado un numero aleatorio hasta 5
           try {
               switch (randomNumber) {
                   case 0:
                       throw new NumberFormatException();  
                   case 1:
                       throw new IOException();
                   case 2:
                       throw new FileNotFoundException();
                   case 3:
                       throw new IndexOutOfBoundsException();
                   case 4:
                       throw new ArithmeticException();
               }
           } catch (Exception e) {
               e.printStackTrace(); //Es un metodo de la excepcion que imprime el error de la consola
           }
       }
   }