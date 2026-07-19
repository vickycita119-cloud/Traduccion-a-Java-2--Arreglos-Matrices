
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author Daniela Victoria Mendoza Mejía
 */
public class Suma_matriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[4][4];
        int suma= 0;
          for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Ingrese un numero: ");
                matriz[i][j] = sc.nextInt();
                suma += matriz[i][j]; 
            }
        }
        
        System.out.println("La suma total es: " + suma);
    }
}
