
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author Daniela Victoria Mendoza Mejía
 */
public class Matrices3x4 {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[3][4]; 
        for (int i = 0; i< 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Ingrese un numero : ");
                matriz[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("\n--- MATRIZ 3x4 ---");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + "\t"); 
            }
            System.out.println(); 
        }
    }
}

