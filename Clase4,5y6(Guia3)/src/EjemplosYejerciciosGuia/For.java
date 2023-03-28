package EjemplosYejerciciosGuia;

import java.util.Scanner;

public class For {

    /*Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima 
el número ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
5 *****
3 ***
11 ***********
2 ** */
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int numero;
        String op;
        do {

            System.out.print("Ingrese un numero del 1 al 20: ");
            numero = entrada.nextInt();

            if (numero > 0 && numero <= 20) {

                System.out.print(numero + " ");
                for (int j = 0; j < numero; j++) {
                    System.out.print("*");
                }
                System.out.println("");

            } else {
                System.out.println("unted ingreso un numero fuera de rango");
                
            }
            System.out.println("Desea seguir ingresando numeros? (S/N)");
            op = entrada.next();
            
        } while (op.equalsIgnoreCase("S"));
        System.out.println("Adios....");
    }

}
