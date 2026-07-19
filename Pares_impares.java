
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author Daniela Victoria Mendoza Mejía
 */
public class Pares_impares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numero = new int[20];
        int cantPares = 0, cantImpares = 0;
        int sumaPares = 0, sumaImpares = 0;
        for (int i = 0; i < 20; i++) {
            System.out.println("Ingrese un número entero: ");
            numero[i] = sc.nextInt();
            if (numero[i] % 2 == 0) {
                cantPares++;
                sumaPares += numero[i];
            } else {
                cantImpares++;
                sumaImpares += numero[i];
            }
        }
        System.out.println("Cantidad de números pares: " + cantPares);
        System.out.println("Cantidad de números impares: " + cantImpares);
        System.out.println("Suma de los pares: " + sumaPares);
        System.out.println("Suma de los impares: " + sumaImpares);
    }
}
