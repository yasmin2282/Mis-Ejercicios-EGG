
package EjerciciosDeAprendizaje;

import java.util.Scanner;

public class Ejercicio1 {
//Crear un programa que dado un número determine si es par o impar.
    public static void main(String[] args) {
        int numero;
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese un numero:");
        numero = leer.nextInt();
        
        if((numero % 2) != 0) {
            System.out.println("el numero ingresado es impar");
        }else{
            System.out.println("El numero ingresado es par");
        }
        
    }
    
}
