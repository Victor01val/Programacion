/**
 * @Víctor
 * Tienda que muestra varias opciones, como listar los articulos, dar de alta, modificar, dar de baja, añadir y reducir mercancia, etc.
 */
package Capitulo10.Tienda;
import java.util.ArrayList;
import java.util.Scanner;
public class Tienda {
    // Declaracion de variables
  private int codigo;
  private String descripcion;
  private double precioCompra;
  private double precioVenta;
  private int stock;
  // Lista de metodos
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

  public String toString() { //Funcion toString para imprimir los objetos

    return "\nCódigo: " + this.codigo + "\nDescripción: " + this.descripcion + "\nPrecio de compra: "
        + this.precioCompra + "\nPrecio de venta: " + this.precioVenta + "\nStock: " + this.stock + " unidades";

  }


  public static void main(String args[]) {
    int codigo;
    String descripcion;
    double precioCompra;
    double precioVenta;
    int stock;
  // Definicion de variables
  ArrayList<Tienda> articulos = new ArrayList<Tienda>();
   

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
          for (Tienda art : articulos) {
            if (art.getCodigo() != 0) {
                System.out.println(art);
            }
        }
           
            break;
          case 2:

          Tienda articuloNuevo = new Tienda(); //Creamos array
          System.out.println("Introduzca los siguientes datos para dar de alta el producto:");
          System.out.println("Codigo:");
          codigo = s.nextInt();
          articuloNuevo.setCodigo(codigo);
          System.out.println("Descripcion:");
          descripcion = System.console().readLine();
          articuloNuevo.setdescripcion(descripcion);
          System.out.println("Precio de compra:");
          precioCompra = s.nextDouble();
          articuloNuevo.setPrecioCompra(precioCompra);
          System.out.println("Precio de venta:");
          precioVenta = s.nextDouble();
          articuloNuevo.setPrecioVenta(precioVenta);
          System.out.println("Stock:");
          stock = s.nextInt();
          articuloNuevo.setStock(stock);
          articulos.add(articuloNuevo); 
          
           
            break;
          case 3:
          System.out.println("Introduzca los siguientes datos para dar de baja el producto:");
                    System.out.println("Codigo:");
                    codigo = s.nextInt();
                    for (Tienda articulo : articulos) {
                        if (articulo.getCodigo() == codigo) { //El ArrayList recorre todo el array, si encuentra el codigo, lo retira
                            articulos.remove(articulo);
                           
                        }
                    }
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
                  for (Tienda articulo : articulos) {
                    if (articulo.getCodigo() == codigo) { //El ArrayList recorre todo el array, si encuentra el codigo, modifica el codigo
                        articulo.setCodigo(codigo);
                       
                    }
                }

                  break;
                case 2:
                  System.out.println("Escribe el codigo para identificar el producto:");
                  codigo = s.nextInt();
                  System.out.println("Escribe la descripción:");
                  descripcion = System.console().readLine();
                  for (Tienda articulo : articulos) {
                    if (articulo.getCodigo() == codigo) {
                        articulo.setdescripcion(descripcion); //El ArrayList recorre todo el array, si encuentra el codigo, modifica la descripcion
                       
                    }
                }

                  break;
                case 3:

                System.out.println("Escribe el codigo para identificar el producto:");
                codigo = s.nextInt();
                System.out.println("Escribe nuevo precio de compra:");
                precioCompra = s.nextInt();
                for (Tienda articulo : articulos) {
                  if (articulo.getCodigo() == codigo) {
                      articulo.setPrecioCompra(precioCompra); //El ArrayList recorre todo el array, si encuentra el codigo, modifica el precio
                     
                  }
              }
              break;
                case 4:
                System.out.println("Escribe el codigo para identificar el producto:");
                codigo = s.nextInt();
                System.out.println("Escribe nuevo precio de venta:");
                precioVenta = s.nextInt();
                for (Tienda articulo : articulos) {
                  if (articulo.getCodigo() == codigo) {
                      articulo.setPrecioVenta(precioVenta); //El ArrayList recorre todo el array, si encuentra el codigo, modifica el precio
                     
                  }
              }
                  break;
                case 5:
                  System.out.println("Escribe el codigo para identificar el producto:");
                codigo = s.nextInt();
                System.out.println("Escribe nuevo numero de stocks:");
                stock = s.nextInt();
                for (Tienda articulo : articulos) {
                  if (articulo.getCodigo() == codigo) {
                      articulo.setStock(stock); //El ArrayList recorre todo el array, si encuentra el codigo, modifica el stock
                     
                  }
              }
                  break;

              }
            } while (o < 6);

            break;
          case 5:
             System.out.println("Escribe el codigo para identificar el producto:");
                codigo = s.nextInt();
                System.out.println("Escribe la cantidad de stocks que quieres añadir:");
                stock = s.nextInt();
                for (Tienda articulo : articulos) {
                  int nuevoStock = articulo.getStock() + stock;
                  if (articulo.getCodigo() == codigo) {
                    articulo.setStock(nuevoStock); //El ArrayList recorre todo el array, si encuentra el codigo, modifica el precio
                     
                  }
              }
              break;
          case 6:
          System.out.println("Escribe el codigo para identificar el producto:");
          codigo = s.nextInt();
          System.out.println("Escribe la cantidad de stocks que quieres retirar:");
           stock = s.nextInt();
          for (Tienda articulo : articulos) {
            int nuevoStock = articulo.getStock() - stock;
            if (articulo.getCodigo() == codigo) {
                articulo.setStock(nuevoStock); //El ArrayList recorre todo el array, si encuentra el codigo, modifica el precio
                
            }
        }
            break;
          case 7:
          default:
        }
      }
      s.close();
    }
  }

}