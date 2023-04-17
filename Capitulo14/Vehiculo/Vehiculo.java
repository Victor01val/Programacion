/**
 * @Victor Valverde Olmedo  1 DAW TARDES
 * Entradas modificando con una funcion isNumeric
 */
package Capitulo14.Vehiculo;


  public abstract class Vehiculo {
    // atributos de clase
    private static int kilometrosTotales = 0;
    // atributos de instancia
    private int kilometrosRecorridos;
    public Vehiculo() {
    this.kilometrosRecorridos = 0;
    }
    public int getKilometrosRecorridos() {
    return this.kilometrosRecorridos;
    }
    public static int getKilometrosTotales() {
    return Vehiculo.kilometrosTotales;
    }
  
    public void recorre(int k) {
    this.kilometrosRecorridos += k;
    Vehiculo.kilometrosTotales += k;
    }
    }
    

