/*
 * Víctor Valverde Olmedo
 * (Ejercicio de JAVA más dificil hasta la fecha) <---------------- (Anotacion personal para identificar el ejerficio...)
 */
package Capitulo9.ArraysObjetos;

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

  public String toString() {

    return "\nCódigo: " + this.codigo + "\nDescripción: " + this.descripcion + "\nPrecio de compra: "
        + this.precioCompra + "\nPrecio de venta: " + this.precioVenta + "\nStock: " + this.stock + " unidades";

  }


  // AQUÍ ESTA EL EJECUTABLE
  public static void main(String args[]) {
    int codigo;
    String descripcion;
    double precioCompra;
    double precioVenta;
    int stock;
  // Definicion de variables
    Tienda articulo[] = new Tienda[100]; // Creamos un array de 100 articulos como maximo
    for (int i = 0; i < articulo.length; i++) {
      articulo[i] = new Tienda();
    }
// Mientras que i sea inferior a la longitud del array, el contador va sumando y va creando articulos
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
            // Va recorriendo el array, y ponemos una condicion que es que si no es 0 el codigo imprima el articulo. Si es 0 no tiene que aparecer
            break;
          case 2:

            int primero = -1;
            do {
              primero++;
            } while (articulo[primero].getCodigo() != 0);
            // Va recorriendo cada uno de los articulos del array mientras el codigo no sea 0
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
//El bucle no acaba hasta que se introduce un numero mayor a 0
            }
            if (precioCompra > 0) {
              articulo[primero].setPrecioCompra(precioCompra);
            }
//Si el precio es mayor de 0, la variable del array se cambia al puesto por teclado 
            System.out.println("precio de venta:");
            precioVenta = s.nextDouble();
            if (precioVenta < 0) {

              int i = 0;
              do {
                System.out.println("Escriba un precio correcto");
                i++;
                precioVenta = s.nextDouble();
              } while (precioVenta < 0);
//El bucle no acaba hasta que se introduce un numero mayor a 0
            }
            if (precioVenta > 0) {
              articulo[primero].setPrecioVenta(precioVenta);
            }
            //Si el precio es mayor de 0, la variable del array se cambia al puesto por teclado (Igual que el precio de la compra)
            System.out.println("Stock: ");
            stock = s.nextInt();

            if (stock < 0) {

              int i = 0;
              do {
                System.out.println("Escriba un stock correcto");
                i++;
                stock = s.nextInt();
              } while (stock < 0);
//El bucle no acaba hasta que se introduce un numero mayor a 0
            }
            if (stock > 0) {
              articulo[primero].setStock(stock);
                   //Si el stock es mayor de 0, la variable del array se cambia al puesto por teclado 
            }

           
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
            //El bucle empieza por -1 y va recorriendo todas las posiciones. Si encuentra uno que sea 0, directamente desaparece del listado,
            // ya que en la línea 89 pusimos esa condicion para el listado
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