package EjerciciosDeAprensizaje;

import java.util.Scanner;

public class Ejercicio3 {

    /*Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos)*/
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int cont1, cont2, cont3, cont4, cont5;
        cont1 = 0;
        cont2 = 0;
        cont3 = 0;
        cont4 = 0;
        cont5 = 0;
        System.out.println("Indique tamaño del vector:");
        int tamaño = leer.nextInt();
        int vector[] = new int[tamaño];

        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 20000);
        }
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] < 10) {
                cont1++;
            }
            if (vector[i] > 9 && vector[i] < 99) {
                cont2++;
            }
            if (vector[i] > 99 && vector[i] < 999) {
                cont3++;
            }
            if (vector[i] > 999 && vector[i] < 9999) {
                cont4++;
            }
            if (vector[i] > 9999) {
                cont5++;
            }
        }
        System.out.println("====================================");
        if (cont1 > 0) {
            System.out.println(cont1 + " numeros son de 1 digito");
        }
        if (cont2 > 0) {
            System.out.println(cont2 + " numeros son de 2 digito");
        }
        if (cont3 > 0) {
            System.out.println(cont3 + " numeros son de 3 digito");
        }
        if (cont4 > 0) {
            System.out.println(cont4 + " numeros son de 4 digito");
        }
        if (cont5 > 0) {
            System.out.println(cont5 + " numeros son de 5 digito");
        }

    }

}
