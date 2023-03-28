package EjemplosYejercicios;

import java.util.Scanner;

public class EjemploArreglos {

    public static void main(String[] args) {

        // Creo un arreglo llamado vector con dimensión 5 que
        // solo pueda alojar números enteros
        int[] vector = new int[5];
        // Puedo asignar valores de esta manera
        vector[0] = 3;

        // Asigno valores mediante el for
        for (int i = 0; i < 5; i++) {

            vector[i] = i + 3;
        }
        // Muestro el vector
        System.out.println("VECTOR");
        for (int i = 0; i < vector.length; i++) {
            System.out.print("[" + vector[i] + "]");
        }
        System.out.println("");

        System.out.println("============");
        // Creo una matriz con dimensión 3x3 que
        // solo pueda alojar cadenas
        String[][] matriz = new String[3][3];
// Puedo asignar valores de esta manera
        matriz[0][0] = "A";

        // Asigno valores mediante el For
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = "A";
            }
        }

        // Muestro la matriz
        System.out.println("MATRIZ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                System.out.print("[" + matriz[i][j] + "]");

            }
            System.out.println("");
        }

    }

}
