
package EjerciciosExtras;

import java.util.Scanner;

public class Ejercicio1Compañera {
/*
    Realizar un algoritmo que calcule la suma de todos los elementos de un 
    vector de tamaño N, con los valores ingresados por el usuario.
     */
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, suma=0;
        System.out.println("Ingrese el tamaño del vector:");
        num = sc.nextInt();
        int vector[] = new int[num];
        
        for (int i = 0; i < vector.length; i++) {
            System.out.println("Ingrese el número a alojar en la posición " + i);
            vector[i]= sc.nextInt();
            suma += vector[i];
        }
        
        System.out.println("La suma de todos los números ingresados es: " + suma);

    }
}
