
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author Daniela Victoria Mendoza Mejía
 */
public class Diagonal_principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[4][4];
        int sumaDia = 0;
        for (int i= 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Ingrese valor para Fila " + i + ", Columna " + j + ": ");
                matriz[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < 4; i++) {
            System.out.print(matriz[i][i] + " ");
            sumaDia += matriz[i][i];
        }
        
        System.out.println("La suma de la diagonal principal es: " + sumaDia);
    }
}

