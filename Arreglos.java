package javaapplication1;

import java.util.Scanner;


/**
 *
 * @author  Daniela Victoria Mendoza Mejía
 */
public class Arreglos {

    
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int[] numeros = new int[10];
        for (int i =0; i<10; i++){
        System.out.println("Ingrese un numero: ");   
        numeros[i]= sc.nextInt();
    }
        System.out.println("POSICION DE LOS NUMEROS "); 
          for (int i=0; i<10; i++){
              
           System.out.println("Posicion " + i + ": " + numeros[i]);
          }    
              
    }
}
