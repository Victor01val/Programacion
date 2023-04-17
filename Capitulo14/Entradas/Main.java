/**
 * @Victor Valverde Olmedo  1 DAW TARDES
 * Entradas modificando con un try catch
 */
package Capitulo14.Entradas;

public class Main {
  public static void main(String args[]) {
    int opcion = 0;
    // Crear las distintas zonas
    Zona principal = new Zona(1000);
    Zona compraventa = new Zona(200);
    Zona VIP = new Zona(25);
    
    // Menú de opciones
    while (opcion < 3) {
      System.out.println("1. Mostrar número de entradas disponibles");
      System.out.println("2. Vender entradas");
      System.out.println("3. Salir");
      opcion = Integer.parseInt(System.console().readLine());
      
      // Opción de mostrar el número de entradas disponibles en cada zona
      if(opcion == 1){
        System.out.println("\n\nEn la zona principal hay " + principal.getEntradasPorVender());
        System.out.println("En la zona de compra venta hay " + compraventa.getEntradasPorVender());
        System.out.println("En la zona vip hay " + VIP.getEntradasPorVender());
      }
      
      // Opción de vender entradas
      if (opcion == 2) {
        System.out.println("¿Qué zona quieres acceder?");
        System.out.println("1. Sala principal");
        System.out.println("2. Compra-venta");
        System.out.println("3. VIP");
        System.out.println("4. Salir");

        // Leer la zona elegida por el usuario
        int zonaElegida = Integer.parseInt(System.console().readLine());
        
        // Si se eligió una zona válida
        if (zonaElegida < 4) {
          System.out.print("¿Cuántas entradas quiere? ");
          int entradas = Integer.parseInt(System.console().readLine());
          
          try {
            // Vender las entradas en la zona correspondiente
            if(zonaElegida == 1){
              principal.vender(entradas);
            } else if(zonaElegida == 2){
              compraventa.vender(entradas);
            } else if(zonaElegida == 3){
              VIP.vender(entradas);
            }
          } catch (Exception e) {
            // Manejo de excepciones
            System.out.println("Se ha producido un error de tipo " + e.getClass().getName() + ": " + e.getMessage());
          }
        }
      }
    }
  }
}
