
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author Daniela Victoria Mendoza Mejía
 */
public class Mayor_menor {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        int[] numero = new int[15]; 
        int mayor, menor, posMayor, posMenor;
        mayor = numero[0];
        menor = numero[0];
        posMayor = 0;
        posMenor = 0;
        for (int i = 0; i < 15; i++) { 
            System.out.println("Ingrese un numero entero");
            numero[i] = sc.nextInt();
        }
        
        for (int i = 1; i < 15; i++) { 
            if (numero[i] > mayor) {
                mayor = numero[i];
                posMayor = i;
            }
            if (numero[i] <= menor) {
                menor = numero[i];
                posMenor = i;
            }
        }
        System.out.println("Numero mayor: " + mayor);
        System.out.println("Numero menor: " + menor);
        System.out.println("Posicion donde se encuentra el mayor: " + posMayor);
        System.out.println("Posicion donde se encuentra el menor: "+ posMenor);
    }
}
