package Capitulo8;
import java.util.Scanner;

import Capitulo8.misFunciones.Geometria;
public class Ejercicio7 {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in); {
System.out.println("Introduce una altura");
double altura = s.nextDouble();
System.out.println("Introduce un ancho");
double ancho = s.nextDouble();
double area = Geometria.areaRectangulo(ancho, altura);
double perimetro = Geometria.perimetroRectangulo(ancho, altura);
System.out.println("El area es " +(area)+ "cm. El perimetro es " +perimetro+ "cm");
s.close();
    }
  }
}
