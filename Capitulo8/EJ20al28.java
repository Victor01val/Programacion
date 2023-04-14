package Capitulo8;
import java.util.Scanner;
public class EJ20al28 {


   
   public static void main (String args[]) {
     
     try (Scanner sc = new Scanner(System.in)) {
      int max = 0;
       int min = 0;
       int n = 0;
       
       System.out.print("Escribe la cantidad de números que quieres que tenga el Arrays Unidimensional: ");
       n = sc.nextInt();
       
       System.out.print("Escribe el número máximo de los números aleatorios: ");
       max = sc.nextInt();
       
       System.out.print("Escribe el número minimo de los números aleatorios: ");
       min = sc.nextInt();
       
       
       int [] a = NumerosAleatorios(n, min, max);
       
       for(int num:a){
         System.out.print(num + " ");
         }
    }
   }
   
   public static int [] NumerosAleatorios(int c, int h , int z){
     int [] x = new int [c];
     for(int i = 0; i < x.length;i++){
       x[i] = (int)(Math.random()*(z-h+1)+h);
       }
       return x;
       
     }
 }
 

