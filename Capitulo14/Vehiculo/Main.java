/**
 * @Victor Valverde Olmedo  1 DAW TARDES
 * Entradas modificando con una funcion isNumeric
 */
package Capitulo14.Vehiculo;

public class Main {
  private static boolean isNumeric(String str){
    return str != null && str.matches("[0-9.]+"); //Funcion añadida
}
  public static void main(String[] args) {
    int opcion = 0;
    int km;
    Bicicleta bhSpeedrom = new Bicicleta(9);
    Coche saab93 = new Coche(1900);
    while (opcion != 8) {
      System.out.println("1. Anda con la bicicleta");
      System.out.println("2. Haz el caballito con la bicicleta");
      System.out.println("3. Anda con el coche");
      System.out.println("4. Quema rueda con el coche");
      System.out.println("5. Ver kilometraje de la bicicleta");
      System.out.println("6. Ver kilometraje del coche");
      System.out.println("7. Ver kilometraje total");
      System.out.println("8. Salir");
      System.out.println("Elige una opción (1-8): ");
      opcion = Integer.parseInt(System.console().readLine());
      switch (opcion) {

        
        case 1:
        System.out.print("¿Cuántos kilómetros quiere recorrer? ");
        String kmStr = System.console().readLine();
        if (isNumeric(kmStr)) { //Se utiliza la funcion
            km = Integer.parseInt(kmStr);
            bhSpeedrom.recorre(km);
        } else {
            System.out.println("Debe introducir un número válido.");
        }
        break;
    case 2:
        bhSpeedrom.hazCaballito();
        break;
    case 3:
        System.out.print("¿Cuántos kilómetros quiere recorrer? ");
        kmStr = System.console().readLine();
        if (isNumeric(kmStr)) {  //Se utiliza la funcion
            km = Integer.parseInt(kmStr);
            saab93.recorre(km);
        } else {
            System.out.println("Debe introducir un número válido.");
        }
        break;
        case 5:
          System.out.println("La bicicleta lleva recorridos ");
          System.out.println(bhSpeedrom.getKilometrosRecorridos() + " Km");
          break;
        case 6:
          System.out.println("El coche lleva recorridos ");
          System.out.println(saab93.getKilometrosRecorridos() + " Km");
          break;
        case 7:
          System.out.println("Los vehículos llevan recorridos ");
          System.out.println(Vehiculo.getKilometrosTotales() + " Km");
        default:
      } // switch
    } // while
  }
}
