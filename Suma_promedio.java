
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author Daniela Victoria Mendoza Mejía
 */
public class Suma_promedio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] numeros = new double[10];
        double suma = 0;
        double promedio = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese un numero Real:");
            numeros[i] = sc.nextDouble();
            suma = suma + numeros[i];
        }
        
        promedio = suma / 10;
        System.out.println("La suma es: " + suma);
        System.out.println("El promedio es: " + promedio);
   
}
}

