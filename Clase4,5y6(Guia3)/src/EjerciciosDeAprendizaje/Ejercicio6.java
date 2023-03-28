package EjerciciosDeAprendizaje;

import java.util.Scanner;

public class Ejercicio6 {

    /*Realizar un programa que pida dos números enteros positivos por teclado y muestre por pantalla el siguiente menú
El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla y luego volver al menú
El programa deberá ejecutarse hasta que se elija la opción 5. Tener en cuenta que, si el usuario selecciona la 
opción 5, en vez de salir del programa directamente, se debe mostrar el siguiente mensaje de confirmación: 
¿Está seguro que desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del programa, 
caso contrario se vuelve a mostrar el menú.
MENU:
1.Sumar
2.Restar
3.Multiplicar
4.Dividir
5.Salir
elija opcion:*/

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String opcion;

        System.out.println("Ingrese dos numeros enteros positivos");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        int suma = num1 + num2;
        int resta = num1 - num2;
        int multiplicacion = num1 * num2;
        double division = num1 / num2;

        do {
            System.out.println("MENU");
            System.out.println("1.Sumar");
            System.out.println("2.Restar");
            System.out.println("3.Multimplicar");
            System.out.println("4.dividir");
            System.out.println("5.Salir");
            System.out.println("================================");
            System.out.println("Digite una opcion");
            opcion = leer.next();

            switch (opcion) {
                case "1":
                    System.out.println("La suma de los numeros ingresados es " + suma);
                    break;
                case "2":
                    System.out.println("La resta de los numeros ingresados es " + resta);
                    break;
                case "3":
                    System.out.println("La multiplicacion de los numeros ingresados es " + multiplicacion);
                    break;
                case "4":
                    System.out.println("la division de los numeros ingresados es " + division);
                    break;
                case "5":
                    System.out.println("¿Está seguro que desea salir del programa (S/N)? ");
                    opcion = leer.next();

            }
        } while(!"S".equalsIgnoreCase(opcion));
          
        System.out.println("Saliendo.........");
    }

 }
