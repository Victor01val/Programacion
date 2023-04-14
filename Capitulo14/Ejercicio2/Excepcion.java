/**
 * @author Víctor Valverde Olmedo
 * Si dos gatos del mismo sexo aparean, se produce una excepcion
 */
package Capitulo14.Ejercicio2;

public class Excepcion extends Exception { //Creación de una excepcion propia
    public Excepcion(){
System.out.println("No se pueden aparear dos gatos del mismo sexo");
    }
}
