
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author Daniela Victoria Mendoza Mejía
 */
public class Matriz_modificada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[3][5];         
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
               System.out.print("Ingrese un numero [" + i + "][" + j + "]: ");
                int numeroIngresado = sc.nextInt();
                matriz[i][j] = numeroIngresado + (i * j);
            }
        }
        System.out.println("--- MATRIZ MODIFICADA ---");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

