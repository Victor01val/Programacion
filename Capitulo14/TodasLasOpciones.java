/**
 * @author Víctor Valverde Olmedo
 * Programa que comprueba los 5 errores
 */
package Capitulo14;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class TodasLasOpciones {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int opcion;
            do {
                System.out.println(
                        "Seleccione el tipo de error que quiere comprobar\n1.- ArithmeticError\n2.- ArrayIndexoutofBoundsException\n3.- NumberFormatException\n4.- FileNotFoundException\n5.- StackOverFlowError\n6.- Salir");
                opcion = s.nextInt();
                try {
                    switch (opcion) {
                        case 1:
                            // ArithmeticError
                            // División entre dos numeros. Si el divisor es 0, lanza un error, porque no se
                            // puede dividir entre 0
                            System.out.println("Escribe un número para dividir");
                            int n = s.nextInt();
                            System.out.println("Escribe el otro número");
                            int a = s.nextInt();

                            System.out.println("El resultado es " + dividir(n, a)); // Llama a la funcion dividir

                            break;
                        case 2:
                            // ArrayIndexOutOfBoundsException
                            // Ponemos una condicion del array como maximo 4. Si excede de 4, salta el error
                            int[] array = new int[4];
                            System.out.println("Introduce un número mayor de 4 para el índice del array:");
                            int nn = s.nextInt();
                            if (nn >= 4) {

                                array[nn] = (int) (Math.random() * 10);

                            } else {
                                array[nn] = (int) (Math.random() * 10);
                            }

                            break;
                        case 3:
                            // NumberFormatException
                            // Si el numero es decimal, salta el error

                            System.out.println("Introduce un número entero:");
                            int ae = Integer.parseInt(s.next());
                            System.out.println("El número introducido es " + entero(ae)); // Llama a la funcion entero

                            break;
                        case 4:
                            // FileNotFoundException

                            System.out.println("Introduce el nombre del archivo seguido del tipo. Ejemplo: Victor.txt");
                            BufferedReader br = new BufferedReader(new FileReader(s.next()));
                            String linea = "";
                            while (linea != null) {
                                System.out.println(linea);
                                System.out.println("Se ha encontrado el archivo");
                                linea = br.readLine();
                            }
                            br.close();

                            break;
                        case 5:
                            // StackOverflowError
                            // Llama a la funcion de metodo recursivo, y el contador sube sin control, hasta
                            // que detecta el error

                            metodoRecursivo(1);

                            break;
                        case 6:
                            // Salir del programa
                            System.out.println("Hasta luego!");
                            break;
                        default:
                            // Opción inválida
                            System.out.println("Opción inválida.");
                            break;
                    }
                } catch (ArithmeticException e) {
                    System.out.println("ArithmeticException!");
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("ArrayIndexOutOfBoundsException!");
                } catch (NumberFormatException ae) {
                    System.out.println("NumberFormatException!");
                } catch (FileNotFoundException fnfe) { // Si no encuentra
                    System.out.println("No se encuentra el fichero");
                } catch (IOException ioe) { // Si hay error de lectura
                    System.out.println("No se puede leer el fichero");
                }   catch (StackOverflowError e) {
                    System.out.println("StackOverflowError!");
                }
            } while (opcion != 6);
            s.close();
    }

    public static int dividir(int a, int b) {
        int resultado = a / b;
        return resultado;
    }

    // No hay funcion del ArrayIndexOutOfBoundsException

    public static int entero(int a) {
        return a;
    }

    public static void metodoRecursivo(int i) {
        System.out.println(i);
        i++;
        metodoRecursivo(i);
    }
}
