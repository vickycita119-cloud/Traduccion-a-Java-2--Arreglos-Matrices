
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author Danniela Victoria Mendoza Mejía
 */
public class Arreglo2 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[12];
        for (int i = 0; i < 12; i++) {
            int num;
            do {
                System.out.print("Ingrese un numero positivo " + i + ": ");
                num = sc.nextInt();
                if (num < 0) {
                    System.out.println("El numero debe ser positivo.");
                }
            } while (num < 0); 
            numeros[i] = num + i;
        }
        System.out.println("======");
        for (int i = 0; i < 12; i++) {
            System.out.println("Posicion " + i + ": " + numeros[i]);
        } 
    }
    
}