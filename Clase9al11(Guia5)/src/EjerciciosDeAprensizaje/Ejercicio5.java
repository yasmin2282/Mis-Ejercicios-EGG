package EjerciciosDeAprensizaje;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio5 {

    public static void main(String[] args) {
        Random rd = new Random();
        int matrizO[][] = new int[3][3];
        int matrizT[][] = new int[3][3];
        int cont = 0;

        for (int i = 0; i < matrizO.length; i++) {
            for (int j = 0; j < matrizO.length; j++) {
                matrizO[i][j] = rd.nextInt(5);
            }
        }

        System.out.println("MATRIZ ORIGINAL");

        for (int i = 0; i < matrizO.length; i++) {
            for (int j = 0; j < matrizO.length; j++) {
                System.out.print("[" + matrizO[i][j] + "]");
            }
            System.out.println("");
        }
        System.out.println("==================");

        System.out.println("MATRIZ TRANSPUESTA");
        //Cargando matriz transpuesta
        for (int i = 0; i < matrizT.length; i++) {
            for (int j = 0; j < matrizT.length; j++) {
                matrizT[j][i] = -1 * (matrizO[i][j]);
            }
        }
        //Mostrando matriz transpuesta
        for (int i = 0; i < matrizT.length; i++) {
            for (int j = 0; j < matrizT.length; j++) {
                System.out.print("[" + matrizT[i][j] + "]");
            }
            System.out.println("");
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matrizO[i][j] == (-1) * (matrizT[i][j])) {
                    cont++;
                }
            }
        }
        System.out.println("===========================");
        if (cont == 9) {
            System.out.println("Las matrices SI son antisimetricas");

        } else {
            System.out.println("Las matrices NO son antisimetricas :)");
        }
    }

}




