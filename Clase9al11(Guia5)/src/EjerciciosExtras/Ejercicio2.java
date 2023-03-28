package EjerciciosExtras;

import java.util.Scanner;

public class Ejercicio2 {

    /*
     Escriba un programa que averigüe si dos vectores de N enteros son iguales 
    (la comparación deberá detenerse en cuanto se detecte alguna diferencia 
    entre los elementos).
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la longitud de los vectores:");
        int longitud = sc.nextInt();

        int vector1[] = new int[longitud], vector2[] = new int[longitud];
        boolean validar = true;

        for (int i = 0; i < vector2.length; i++) {
            vector1[i] = (int) (Math.random() * 100);
            vector2[i] = (int) (Math.random() * 100);
        }

        for (int i = 0; i < vector2.length; i++) {
            if (vector1[i] != vector2[i]) {
                System.out.println("Se detectó una diferencia");
                validar = false;
                break;
            }
        }
        if (validar) {
            System.out.println("Los vectores son iguales");
        } else {
            System.out.println("Los vectores son distintos");
        }
    }
}
