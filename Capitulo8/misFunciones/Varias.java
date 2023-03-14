package Capitulo8.misFunciones;

public class Varias {

  //
  public static boolean esPrimo(int x) {
    for (int i = 2; i < x; i++) {
      if ((x % i) == 0) {
        return false;
      }
    }
    return true;
  }

  public static int digitos(int x) {
    if (x == 0) {
      return 1;
    } else {
      int n = 0;
      while (x > 0) {
        x = x / 10;
        n++;
      }
      return n;
    }
  }

  public static double multiplica(double a, double b) {
    double resultado = a * b;
    return resultado;

  }

  public static boolean esMayorEdad(int a) {
    if (a >= 18) {
      return true;
    } else {
      return false;
    }
  }

  public static int minimo(int a, int b) {

    if (a < b) {
      return a;
    }
    return b;
  }

  public static int dimeSigno(int a) {
    if (a < 0) {
      a = -1;
      return a;
    } else if (a == 0) {
      a = 0;
      return a;
    } else if (a > 0) {
      a = 1;
      return a;
    }
    return a;
  }

  public static double millasAkilometros(int millas) {
    double resultado = millas * 1.60934;
    return resultado;
  }

  public static double precioConIva(double a) {

    a = a % 21;
    return a;

  }

  public static int suma(int a, int b) {
    a = a + b;
    return a;
  }

  public static int media(int a, int b) {
    int resultado = (a - b) / a + b;
    return resultado;
  }

  public static int maximo(int a, int b) {
    int resultado = 0;
    if (a > b) {
      resultado = a;
      return resultado;
    } else {
      resultado = b;
      return resultado;
    }

  }
  public static void tabla(int a){
    for(int i = 0; i<10; i++) {
      int resultado = i*a;
      System.out.println(+i+ "*" + a+ "=" + resultado);
    }
  }
public static void fecha(int dia, String mes, int ano) {
  
if(dia>31) {
  System.out.println("El día excede");
} else {
  System.out.println("El día no excede");
}
if (mes.equalsIgnoreCase("enero") ||
mes.equalsIgnoreCase("febrero") ||
mes.equalsIgnoreCase("marzo") ||
mes.equalsIgnoreCase("abril") ||
mes.equalsIgnoreCase("mayo") ||
mes.equalsIgnoreCase("junio") ||
mes.equalsIgnoreCase("julio") ||
mes.equalsIgnoreCase("agosto") ||
mes.equalsIgnoreCase("septiembre") ||
mes.equalsIgnoreCase("octubre") ||
mes.equalsIgnoreCase("noviembre") ||
mes.equalsIgnoreCase("diciembre")) {
System.out.println("Mes válido");
} else {
System.out.println("Mes no válido");
}
if ((ano >= 1910) && (ano > 2023)) {
  System.out.println("El año no es correcto");
} else {
  System.out.println("El año  es correcto");
}

}
}
