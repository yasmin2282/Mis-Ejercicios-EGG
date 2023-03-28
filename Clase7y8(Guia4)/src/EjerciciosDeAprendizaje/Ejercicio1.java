package EjerciciosDeAprendizaje;

import java.util.Scanner;

public class Ejercicio1 {

    /*Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar, restar, multiplicar y dividir. 
La aplicación debe tener una función para cada operación matemática y deben devolver sus resultados para imprimirlos en el main.*/
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1, num2;
        String op;
        System.out.println("Ingrese 2 numeros:");
        num1 = leer.nextInt();
        num2 = leer.nextInt();

        do {
            System.out.println("\nelija una de las opciones:"
                    + "\n1.Sumar"
                    + "\n2.Restar"
                    + "\n3.Multiplicar"
                    + "\n4.Dividir"
                    + "\n ");
   
            System.out.print("Ingrese una opcion:");
            int opcion = leer.nextInt();
            System.out.println(" ");
            switch (opcion) {
                case 1:
                    int retornoSuma = sumar(num1, num2);
                    System.out.println("La suma de ambos numeros es " + retornoSuma);//con retorno alojado en una variable
                    System.out.println(" ");
                    break;
                case 2:
                    
                    System.out.println("La resta de los dos numeros ingresados es " +restar(num1,num2));//con retormo directamente
                    System.out.println(" ");
                    break;
                case 3:
                    int retornoMult = multiplicar(num1, num2);
                    System.out.println("La multiplicacion de los dos numeros es " + retornoMult);
                    System.out.println(" ");
                    break;
                case 4:
                    float retornoDiv = dividir(num1, num2);
                    System.out.println("La division de los numerosa ingresados es " + retornoDiv);
                    System.out.println(" ");
                    break;
                default:
                    System.out.println("Opcion INCORRECTA!");
                    System.out.println(" ");
            }
            System.out.println("Desea realizar otra operacion con los mismos numeros ingresados? (S/N)");
            op = leer.next();
        } while (op.equalsIgnoreCase("S"));
        System.out.println("OK, Adios...");

    }

    public static int sumar(int num1, int num2) {
        int suma;
        suma = num1 + num2;
        return suma;
    }

    public static int restar(int num1, int num2) {
        int resta;//se define una variable auxiliar
        resta = num1 - num2;//se guarda en la variable auxiliar el resultado
        return resta;
    }

    public static int multiplicar(int num1, int num2) {
       
        return num1*num2;//se realiza la operacion sin usar una variable auxiliar
    }

    public static float dividir(int num1, int num2) {
        int division;
        division = num1 / num2;
        return division;

    }

}
