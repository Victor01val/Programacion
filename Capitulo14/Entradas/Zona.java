/**
 * @Victor Valverde Olmedo  1 DAW TARDES
 * Entradas modificando con un try catch
 */
package Capitulo14.Entradas;

public class Zona {
  private int entradasPorVender;
  
  // Constructor
  public Zona(int n){
    entradasPorVender = n;
  }
  
  // Obtener el número de entradas disponibles
  public int getEntradasPorVender() {
    return entradasPorVender;
  }
  
  // Vender entradas
  public void vender(int n) throws Exception {
    // Comprobar si quedan entradas disponibles
    if (this.entradasPorVender == 0) {
      throw new Exception("Lo siento, las entradas para esa zona están agotadas.");
    } else if (this.entradasPorVender < n) {
      throw new Exception("Sólo me quedan " + this.entradasPorVender + " entradas para esa zona.");
    }
    
    // Vender las entradas
    entradasPorVender -= n;
    System.out.println("Aquí tiene sus " + n + " entradas, gracias.");
  }
}