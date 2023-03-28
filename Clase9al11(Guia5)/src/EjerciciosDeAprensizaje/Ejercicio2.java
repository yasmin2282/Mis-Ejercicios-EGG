package EjerciciosDeAprensizaje;

import java.util.Scanner;

public class Ejercicio2 {

    /*Realizar un algoritmo que llene un vector de tamaño N con valores aleatorios y le pida al usuario 
un número a buscar en el vector. El programa mostrará dónde se encuentra el numero y si se encuentra repetido*/
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int tamaño, num2, cont;
        String aux = "";
        cont = 0;
        System.out.print("De que tamaño sera el vector: ");
        tamaño = leer.nextInt();
        int vector[] = new int[tamaño];

        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 50);
        }
        //MOSTRAR VECTOR
        System.out.println("*VECTOR");
        //bucle for mejorado
        //for(tipo elemento:arreglo)
        for (int elemento : vector) {
            aux = aux + " [" + elemento + "]";
        }
        System.out.println(aux);

        System.out.print("Ingrese un numero natural menor o igual a 100: ");
        num2 = leer.nextInt();
        System.out.println("==================================================");
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == num2) {
                cont++;
                System.out.println("El numero " + num2 + " se encuentra alojado en el vector[" + i + "]");
            }
        }
        if (cont < 1) {
            System.out.println("El numero " + num2 + " NO SE A ENCONTRADO dentro d2el vector");
        } else {
            System.out.println("==================================================");
            System.out.println("El numero " + num2 + " se repite " + cont + " vez(ces) en el vector");
        }
    }
 }
