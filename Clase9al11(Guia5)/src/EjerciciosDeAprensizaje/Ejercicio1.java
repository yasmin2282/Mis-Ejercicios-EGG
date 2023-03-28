
package EjerciciosDeAprensizaje;

import java.util.Scanner;

public class Ejercicio1 {
/*Realizar un algoritmo que llene un vector con los 100 primeros números enteros y 
los muestre por pantalla en orden descendente.*/
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int vector [] = new int[100];
        
        for (int i = 0; i < vector.length; i++) {
            vector[i]=i+1;
            
        }
         System.out.println("*VECTOR:");
        for (int i = 99; i >=0; i--) {
            System.out.print("[" +vector[i]+"]");
        }

    }

}
