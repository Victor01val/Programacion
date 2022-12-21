/*
 * Víctor Valverde Olmedo
 * Muestra 50 numeros aleatorios comprendidos entre -100 y 200
 */
package Capitulo6;

public class C6EJ19 {
  public static void main (String args[]) {
    
    
    int a = 0;
    int contador = 0;
    int M = -101;
    int m =201;
    int suma = 0;
    int resultado = 0;
    
    for(int i = 1; i <= 50; i++){
    a = (int)(Math.random()*301)-100;
    
    if(a % 2 == 0){
    if(a > M){
      M = a;
      }
    }else{
      
      if(a < m){
       m = a;
        }
      }
      
        contador++;
        suma+= a;
        System.out.print(a + " ");
  }
  resultado = suma / contador;
  System.out.println("");
  System.out.println("El número más alto de los pares es: " + M);
  System.out.println("El número más bajo de los impares es: " + m);
  System.out.println("La media de todos los números son: " + resultado);
		
	}
}

