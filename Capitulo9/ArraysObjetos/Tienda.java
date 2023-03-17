/*
 * Víctor Valverde Olmedo
 * (Ejercicio de JAVA más dificil hasta la fecha)
 */
package Capitulo9.ArraysObjetos;

import java.util.Scanner;
public class Tienda {
  private int codigo;
  private String descripcion;
  private double precioCompra;
  private double precioVenta;
  private int stock;

  public int getCodigo() {
    return this.codigo;
  }

  public void setCodigo(int codigo) {
    this.codigo = codigo;
  }

  public String getdescripcion(String descripcion) {
    return this.descripcion;
  }

  public void setdescripcion(String descripcion) {
    this.descripcion = descripcion;
  }

  public double getPrecioCompra(double precioCompra) {
    return this.precioCompra;
  }

  public void setPrecioCompra(double precioCompra) {
    this.precioCompra = precioCompra;
  }

  public double getPrecioVenta(double precioVenta) {
    return this.precioVenta;
  }

  public void setPrecioVenta(double precioVenta) {
    this.precioVenta = precioVenta;
  }

  public int getStock() {
    return this.stock;
  }

  public void setStock(int stock) {
    this.stock = stock;
  }

  public String toString() {

    return "\nCódigo: " + this.codigo + "\nDescripción: " + this.descripcion + "\nPrecio de compra: "
        + this.precioCompra + "\nPrecio de venta: " + this.precioVenta + "\nStock: " + this.stock + " unidades";

  }

  public static void main(String args[]) {
    int codigo;
    String descripcion;
    double precioCompra;
    double precioVenta;
    int stock;

    Tienda articulo[] = new Tienda[100];
    for (int i = 0; i < articulo.length; i++) {
      articulo[i] = new Tienda();
    }

    Scanner s = new Scanner(System.in);
    {
      int o = 0;
      int n = 0;
      while (n != 7) {
        System.out.println(
            "\n\n1. Listado\n2. Alta\n3. Baja\n4. Modificacion\n5. Entrada de mercancia\n6. Salida de mercancia\n7. Salir");
        n = s.nextInt();
        switch (n) {
          case 1:
            for (int i = 0; i < articulo.length; i++) {

              if (articulo[i].getCodigo() != 0)
                System.out.println(articulo[i]);
            }
            break;
          case 2:

            int primero = -1;
            do {
              primero++;
            } while (articulo[primero].getCodigo() != 0);

            System.out.println("Introduzca los siguientes datos para el alta del producto:");
            System.out.println("Codigo: (entero)");
            codigo = s.nextInt();
            articulo[primero].setCodigo(codigo);
            System.out.println("Descripcion:");
            descripcion = System.console().readLine();
            articulo[primero].setdescripcion(descripcion);

            System.out.println("Precio de compra:");
            precioCompra = s.nextDouble();
            if (precioCompra < 0) {

              int i = 0;
              do {
                System.out.println("Escriba un precio correcto");
                i++;
                precioCompra = s.nextDouble();
              } while (precioCompra < 0);

            }
            if (precioCompra > 0) {
              articulo[primero].setPrecioCompra(precioCompra);
            }

            System.out.println("precio de venta:");
            precioVenta = s.nextDouble();
            if (precioVenta < 0) {

              int i = 0;
              do {
                System.out.println("Escriba un precio correcto");
                i++;
                precioVenta = s.nextDouble();
              } while (precioVenta < 0);

            }
            if (precioVenta > 0) {
              articulo[primero].setPrecioVenta(precioVenta);
            }
            System.out.println("Stock: ");
            stock = s.nextInt();

            if (stock < 0) {

              int i = 0;
              do {
                System.out.println("Escriba un stock correcto");
                i++;
                stock = s.nextInt();
              } while (stock < 0);

            }
            if (stock > 0) {
              articulo[primero].setStock(stock);
            }

            articulo[primero].setStock(stock);
            break;
          case 3:
            System.out.println("Introduzca los siguientes datos para la baja del producto:");
            System.out.println("Codigo:");
            codigo = s.nextInt();
            int i = -1;
            do {
              i++;
            } while ((articulo[i].getCodigo() != (codigo)));
            articulo[i].setCodigo(0);
            break;
          case 4:

            do {
              System.out.println(
                  "\n\n¿Qué datos quieres modificar?\n1. Codigo\n2. Descripcion\n3. Precio de compra\n4. Precio de venta\n5. Stock\n6. Salir");
              o = s.nextInt();
              switch (o) {
                case 1:
                  System.out.println("Codigo:");
                  codigo = s.nextInt();
                  i = -1;
                  do {
                    i++;
                  } while ((articulo[i].getCodigo() != (codigo)));
                  System.out.println("Código: " + articulo[i].getCodigo());
                  System.out.println("Escribe nuevo codigo:");
                  codigo = s.nextInt();
                  if (codigo != 0) {
                    articulo[i].setCodigo(codigo);
                  }

                  break;
                case 2:
                  System.out.println("Escribe el codigo para identificar el producto:");
                  codigo = s.nextInt();
                  i = -1;
                  do {
                    i++;
                  } while ((articulo[i].getCodigo() != (codigo)));
                  System.out.println("Escribe una nueva descripcion:");
                  descripcion = System.console().readLine();
                  articulo[i].setdescripcion(descripcion);

                  break;
                case 3:

                  System.out.println("Escribe el codigo para identificar el producto:");
                  codigo = s.nextInt();
                  i = -1;
                  do {
                    i++;
                  } while ((articulo[i].getCodigo() != (codigo)));
                  System.out.println("Escribe un nuevo precio de compra:");
                  precioCompra = s.nextInt();
                  articulo[i].setPrecioCompra(precioCompra);
                  break;
                case 4:
                  System.out.println("Escribe el codigo para identificar el producto:");
                  codigo = s.nextInt();
                  i = -1;
                  do {
                    i++;
                  } while ((articulo[i].getCodigo() != (codigo)));
                  System.out.println("Escribe un nuevo precio de venta:");
                  precioVenta = s.nextInt();
                  articulo[i].setPrecioVenta(precioVenta);
                  break;
                case 5:
                  System.out.println("Escribe el codigo para identificar el producto:");
                  codigo = s.nextInt();
                  i = -1;
                  do {
                    i++;
                  } while ((articulo[i].getCodigo() != (codigo)));
                  System.out.println("Escribe un nuevo numero de stock:");
                  stock = s.nextInt();
                  articulo[i].setStock(stock);
                  break;

              }
            } while (o < 6);

            break;
          case 5:
            System.out.println("Escribe el codigo para identificar el producto:");
            codigo = s.nextInt();
            System.out.println("Escribe el número de stocks que quiere depositar");
            int numero = s.nextInt();
            i = -1;
            do {
              i++;
            } while ((articulo[i].getCodigo() != (codigo)));
            articulo[i].setStock(articulo[i].getStock() + numero);
            i = -1;
            do {
              i++;
            } while ((articulo[i].getCodigo() != (codigo)));
            articulo[i].setStock(numero);
            break;
          case 6:
            System.out.println("Escribe el codigo para identificar el producto:");
            codigo = s.nextInt();
            System.out.println("Escribe el numero de stocks que quiere retirar");
            numero = s.nextInt();

            i = -1;
            do {
              i++;
            } while ((articulo[i].getCodigo() != (codigo)));
            articulo[i].setStock(articulo[i].getStock() - numero);
            break;
          case 7:
          default:
        }
      }
      s.close();
    }
  }

}