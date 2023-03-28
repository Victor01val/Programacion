package Capitulo9.ArraysObjetos.Vehiculos;

import java.util.ArrayList;

public class Main {

  public static void main(String[] args) {

    ArrayList<Vehiculo> vehiculos = new ArrayList<>();

    // Creamos un coche con matrícula 1234ABC y modelo "Ford Fiesta"
    Coche coche1 = new Coche("1234ABC", "Ford Fiesta", 4, true);
    vehiculos.add(coche1);

    // Creamos una moto con matrícula 5678DEF y modelo "Honda CBR"
    Moto moto1 = new Moto("5678DEF", "Honda CBR", 0, "Rojo");
    vehiculos.add(moto1);

    // Creamos un barco con matrícula ABCDEF y modelo "Titanic"
    Barco barco1 = new Barco("ABCDEF", "Titanic", 300, false);
    vehiculos.add(barco1);

    // Creamos un avion con matricula ABCD1234 y modelo Boeing 737
    Avion avion1 = new Avion("ABCD1234", "Boeing 737", 150, 4);
    vehiculos.add(avion1);
    //Creamos un submarino con matricula XYZ789 y modelo Clase Los Angeles
    Submarino submarino1 = new Submarino("XYZ789", "Clase Los Angeles", 70.0, 500);
    vehiculos.add(submarino1);

    

    // Creamos un helicóptero con matricula AAAA1111 y modelo Apache
    Helicoptero helicoptero = new Helicoptero("AAAA1111", "Apache", 4, 2);

    vehiculos.add(helicoptero);

    // Recorremos la lista de vehículos y llamamos al método imprimir() de cada uno
    for (Vehiculo vehiculo : vehiculos) {
      System.out.println("-----------------------------------------------------------------------------------");
      vehiculo.imprimir();
    }
  }
}
