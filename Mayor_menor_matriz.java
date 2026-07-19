
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author Daniela Victoria Mendoza Mejía
 */
public class Mayor_menor_matriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[5][5];
        int mayor = matriz[0][0];
        int menor = matriz[0][0];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println("Ingrese un numero: ");
                matriz[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (matriz[i][j] > mayor) {
                    mayor = matriz[i][j];
                }
                if (matriz[i][j] < menor) {
                    menor = matriz[i][j];
                }
            }
        }
        System.out.println("Mayor: " + mayor);
        System.out.println("Menor: " + menor);
    }
}

