package EjerciciosDeAprendizaje;

import java.util.Scanner;

public class Ejercicio2 {

    /*Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de las personas ingresadas por teclado e 
indique si son mayores o menores de edad. Después de cada persona, el programa debe preguntarle al usuario si quiere seguir 
mostrando personas y frenar cuando el usuario ingrese la palabra “No”.*/

    public static void main(String[] args) {
        int edad = 0;
        String nombre = "";

        datosPersonales(edad, nombre);
    }

    public static void datosPersonales(int edad, String nombre) {

        Scanner leer = new Scanner(System.in);
        String opcion;

        do {
            System.out.println("Ingrese nombre de la persona");
            nombre = leer.next();
            System.out.println("Ingrese la edad");
            edad = leer.nextInt();
           
            if (edad >18) {
                System.out.println(nombre +" tiene "+edad + " años y es mayor de edad");
            }else{
                System.out.println(nombre+" tiene "+edad + " años y es menor de edad");
            }
            System.out.println("Quiere seguir mostrando personas? (S/N)");
            opcion = leer.next();
            
        } while(opcion.equalsIgnoreCase("S"));
        System.out.println("Cerrando programa...");
    }
}
