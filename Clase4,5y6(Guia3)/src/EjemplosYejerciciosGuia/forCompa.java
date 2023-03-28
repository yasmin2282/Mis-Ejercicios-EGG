package EjemplosYejerciciosGuia;

import java.util.Scanner;

public class forCompa {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero;
        String op;
        for (int i = 0; i < 4; i++) {
            System.out.print("Ingrese  numero del 1 al 20: ");
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

        }

    }

}
