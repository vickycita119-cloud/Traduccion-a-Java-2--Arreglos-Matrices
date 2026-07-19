
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author Danniela Victoria Mendoza Mejía
 */
public class Arreglo2 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numero = new int[12]; 
        for (int i = 0; i < 12; i++) {
            System.out.print("Ingrese un número positivo : ");
            int ingreso = sc.nextInt(); 
            numero[i] = ingreso + i; 
        }
        System.out.println("---ARREGLO---");
        for (int i = 0; i < 12; i++) {
            System.out.println("Posición " + i + ": " + numero[i]);
        }
    }
}