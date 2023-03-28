package EjerciciosDeAprendizaje;

import java.util.Scanner;

public class Ejercicio5 {
    /*Escriba un programa en el cual se ingrese un valor limite positivo, y a continuacion solicite numeros al usuario 
hasta que la suma de los números introducidos supere el limite inicial.*/
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int suma = 0;
        System.out.println("ingrese numero limite para la suma de los numeros a ingresar");
        int num = leer.nextInt();
        do {
            
            System.out.println("Ingrese numeros a sumar");
            int num2 = leer.nextInt();


            suma += num2;

        } while (suma < num);
        System.out.println("la suma de todos los numeros ingresados es "+suma + ", usted a superado el valor limite");

    }

}
