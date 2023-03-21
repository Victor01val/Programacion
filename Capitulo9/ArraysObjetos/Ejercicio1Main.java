package Capitulo9.ArraysObjetos;
import java.util.Scanner;
import Capitulo9.Objetos.Animales.Gato;

public class Ejercicio1Main {

  public static void main(String args[]) {
   


    Scanner s = new Scanner(System.in); {
        Gato[] gato = new Gato[4];
        int i;
    
        for (i = 0; i < 4; i++) {
          gato[i] = new Gato();
          System.out.println(" \nGato n: " + (i + 1));
          System.out.print("Nombre: ");
          gato[i].setNombre(s.nextLine());
          System.out.print("Color: ");
          gato[i].setColor(s.nextLine());
          System.out.print("Raza: ");
          gato[i].setRaza(s.nextLine());
        }
        System.out.println("\n\n\n\nDatos de los gatos");
        for (i = 0; i < 4; i++) {
          
          
          System.out.println("\nGato n: " + (i + 1));
          System.out.println("Nombre: " + gato[i].getNombre());
          System.out.println("Color: " + gato[i].getColor());
          System.out.println("Raza: " + gato[i].getRaza());
          }
        }
        s.close();
        }
      }
    
    
    

