/**
 * @Víctor
 * Tienda que muestra varias opciones, como listar los articulos, dar de alta, modificar, dar de baja, añadir y reducir mercancia, etc.
 */
package Capitulo10.Tienda;

public class Funciones {
    
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
}
