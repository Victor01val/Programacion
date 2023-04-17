/**
 * @author Víctor Valverde Olmedo
 * Si dos gatos del mismo sexo aparean, se produce una excepcion
 */
package Capitulo14.Ejercicio2;

public class Gato {
    private String sexo; 
    public Gato(String s){ 
    this.sexo = s; 
    }
    public Gato aparear(Gato pareja) throws Excepcion{ // Método que toma un objeto Gato como argumento y lanza una excepción si los sexos son iguales
        if(this.sexo.equals(pareja.sexo)) { // Compara los sexos de los dos objetos Gato
            throw new Excepcion(); // Lanza una excepción si los sexos son iguales
        } else {
            System.out.println("Apareando...");
        }
        String s = (int)(Math.random() * 2) == 0 ? "hembra" : "macho"; //Se compara con un operador ternario "?", si sale 0, se hembra, de lo contrario será macho
        return new Gato(s);
        
    }
}
