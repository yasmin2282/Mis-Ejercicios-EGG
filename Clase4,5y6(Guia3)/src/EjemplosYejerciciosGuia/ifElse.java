package EjemplosYejerciciosGuia;

import java.util.Scanner;

public class ifElse {
//Implementar un programa que le pida dos números enteros al usuario 
//y determine si ambos o alguno de ellos es mayor a 25.

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int numero1, numero2;
        System.out.println("Ingrese dos numeros:");
        numero1 = leer.nextInt();
        numero2 = leer.nextInt();

        if (numero1 > 25 || numero2 > 25) {
            if (numero1 > 25 && numero2 > 25) {
                System.out.println("Los dos numeros ingresados son mayores a 25");
            } else {
                System.out.println("Uno de los numeros ingresados es mayo a 25");
            }
        } else {
            System.out.println("ninguno de los numeros ingresados es mayor a 25");
        }
    }

}
