package Capitulo9.ArraysObjetos.Animales;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Inventario inventario = new Inventario();
    int opcion;

    do {

      System.out.println("\n\n=== Menú de opciones ===");
      System.out.println("1. Mostrar lista de animales.");
      System.out.println("2. Mostrar datos de un animal concreto.");
      System.out.println("3. Mostrar todos los datos de todos los animales.");
      System.out.println("4. Insertar un animal en el inventario.");
      System.out.println("5. Eliminar un animal del inventario.");
      System.out.println("6. Vaciar el inventario.");
      System.out.println("7. Salir.");
      System.out.print("Introduce la opción deseada: ");
      opcion = sc.nextInt();

      switch (opcion) {
        case 1:
          inventario.mostrarLista();
          break;
        case 2:
          System.out.print("Introduce el nombre del animal: ");
          String nombreAnimal = sc.next();
          inventario.mostrarDatosAnimal(nombreAnimal);
          break;
        case 3:
          inventario.mostrarDatosTodos();
          break;
        case 4:
          System.out.println("1. Perro");
          System.out.println("2. Gato");
          System.out.println("3. Loro");
          System.out.println("4. Canario");
          System.out.print("Introduce el tipo de animal: ");
          int tipoAnimal = sc.nextInt();
          System.out.print("Introduce el nombre del animal: ");
          String nombreNuevoAnimal = sc.next();
          switch (tipoAnimal) {
            case 1:
              System.out.print("Introduce la edad del perro: ");
              int edadPerro = sc.nextInt();
              Perro perro = new Perro(nombreNuevoAnimal, edadPerro);
              inventario.insertarAnimal(perro);
              break;
            case 2:
              System.out.print("Introduce la raza del gato: ");
              String razaGato = sc.next();
              Gato gato = new Gato(nombreNuevoAnimal, razaGato);
              inventario.insertarAnimal(gato);
              break;
            case 3:
              System.out.print("Introduce el color del loro: ");
              String colorLoro = sc.next();
              Loro loro = new Loro(nombreNuevoAnimal, colorLoro);
              inventario.insertarAnimal(loro);
              break;
            case 4:
              System.out.print("Introduce si el canario canta (true o false): ");
              boolean cantaCanario = sc.nextBoolean();
              Canario canario = new Canario(nombreNuevoAnimal, cantaCanario);
              inventario.insertarAnimal(canario);
              break;
            default:
              System.out.println("Opción no válida.");
              break;
          }
          break;
        case 5:
          System.out.print("Introduce el nombre del animal a eliminar: ");
          String nombreAnimalEliminar = sc.next();
          inventario.eliminarAnimal(nombreAnimalEliminar);
          break;
        case 6:
          inventario.vaciarInventario();
          break;
        case 7:
          System.out.println("Hasta pronto!");
          break;
        default:
          System.out.println("Opción no válida.");
          break;
      }
    } while (opcion != 7);

    sc.close();

  }
}
