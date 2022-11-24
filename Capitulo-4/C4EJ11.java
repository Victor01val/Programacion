/*
 * Victor Valverde Olmedo 1 DAW TARDES
 * Calcular tiempo para la medianoche
 */
import java.util.Scanner;
public class C4EJ11 {
	
	public static void main (String args[]) {
    
    Scanner s = new Scanner(System.in);
    
    int num_uno = 0;
    int num_dos = 0;
    
    
    System.out.println("¿Que hora es? (sin los mínutos)");
    num_uno = s.nextInt();
    
    System.out.println("¿Que hora es? (Solo los mínutos)");
    num_dos = s.nextInt();
    
    int min_uno = (num_uno * 3600) + (num_dos * 60);;
    int min_medianoche = (24 * 3600) - min_uno;
    
    System.out.println("Desde las " + num_uno + ":" + num_dos + " faltan para la medianoche " + min_medianoche + " segundos");
    
    
    
    s.close(); // Evitar errores
		
	}
}