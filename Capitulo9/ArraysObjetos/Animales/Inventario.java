package Capitulo9.ArraysObjetos.Animales;

import java.util.ArrayList;
import java.util.Scanner;

public class Inventario { // Creamos la clase Inventario que almacenará una lista de todos los animales
                          // existentes en la tienda de mascotas
  // Atributo privado que será una lista de animales

  private ArrayList<Animal> listaAnimales;
  // Constructor de la clase Inventario, que inicializa la lista de animales vacía

  public Inventario() {
    listaAnimales = new ArrayList<Animal>();
  }
  // Método que muestra la lista de animales, solo tipo y nombre

  public void mostrarLista() {
    for (Animal animal : listaAnimales) {
      System.out.println(animal.getTipo() + " - " + animal.getNombre());
    }
  }
  // Método que muestra todos los datos de un animal concreto

  public void mostrarDatosAnimal(String nombreAnimal) {
    boolean encontrado = false;
    for (Animal animal : listaAnimales) { // Recorremos la lista de animales hasta encontrar el que tenga el nombre
                                          // pasado por parámetro

      if (animal.getNombre().equalsIgnoreCase(nombreAnimal)) {
        encontrado = true;
        animal.mostrarDatos();
        break;
      }
    }
    if (!encontrado) {
      System.out.println("No se encontró el animal con el nombre especificado.");
    }
  }
  // Método que muestra todos los datos de todos los animales

  public void mostrarDatosTodos() {
    for (Animal animal : listaAnimales) { // Recorremos la lista de animales e imprimimos todos sus datos

      animal.mostrarDatos();
      System.out.println();
    }
  }
  // Método que inserta un animal en el inventario

  public void insertarAnimal(Animal animal) {
    listaAnimales.add(animal); // Añadimos el animal a la lista de animales
    System.out.println("Se ha insertado el animal en el inventario.");
  }
  // Método que elimina un animal del inventario

  public void eliminarAnimal(String nombreAnimal) {
    boolean encontrado = false;
    for (int i = 0; i < listaAnimales.size(); i++) { // Recorremos la lista de animales hasta encontrar el que tenga el
                                                     // nombre pasado por parámetro
      if (listaAnimales.get(i).getNombre().equalsIgnoreCase(nombreAnimal)) {
        encontrado = true;
        listaAnimales.remove(i); // Eliminamos el animal de la lista de animales
        System.out.println("Se ha eliminado");
        break; // Salimos del bucle una vez eliminado
      }
    }
    if (!encontrado) {
      System.out.println("No se encontró el animal con el nombre especificado.");
    }
  }

  // Método que vacía el inventario
  public void vaciarInventario() {
    listaAnimales.clear(); // Borramos todos los elementos de la lista de animales
    System.out.println("Se ha vaciado el inventario.");
  }
}
