package Capitulo9.Entradas;

public class Main {
  public static void main(String args[]) {
    int opcion = 0;
  int opcion2 = 0;
    Zona principal = new Zona(1000);
    Zona compraventa = new Zona(200);
    Zona VIP = new Zona(25);
    while (opcion < 3) {
         System.out.println("1. Mostrar número de entradas disponibles");
      System.out.println("2. Vender entradas");
      System.out.println("3. Salir");
      opcion = Integer.parseInt(System.console().readLine());
      if(opcion==1){
        System.out.println("\n\nEn la zona principal hay " + principal.getEntradasPorVender());
        System.out.println("En la zona de compra venta hay " + compraventa.getEntradasPorVender());
        System.out.println("En la zona vip hay " + VIP.getEntradasPorVender());
  
        }
      
   
  
      if (opcion == 2) {
        System.out.println("¿Qué zona quieres acceder?");
        System.out.println("1. Sala principal");
        System.out.println("2. Compra-venta");
        System.out.println("3. VIP");
        System.out.println("4. Salir");

        opcion2 = Integer.parseInt(System.console().readLine());
        if (opcion < 4) {
          System.out.println("Elige la zona:  ");
          System.out.print("¿Cuántas entradas quiere? ");
          int entrada = Integer.parseInt(System.console().readLine());
          if(opcion==1){
            principal.vender(entrada);
          }
          if(opcion==2){
            compraventa.vender(entrada);
          }
          if(opcion==3){
            VIP.vender(entrada);
          }
    
        }
      }

    }
    }
  }

