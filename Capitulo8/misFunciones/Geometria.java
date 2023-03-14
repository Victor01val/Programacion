package Capitulo8.misFunciones;

public class Geometria {
  public static double volumenCilindro(double r, double h) {
    return Math.PI * r * r * h;
  }

  public static double longitudCircunferencia(double r) {
    return 2 * Math.PI * r;
  }

  public static double perimetroRectangulo(double ancho, double alto) {

    double resultado = 2 * (ancho + alto);
    return resultado;
  }

  public static double areaRectangulo(double ancho, double alto) {
    double resultado = ancho*alto;
    return resultado;
  }
}
