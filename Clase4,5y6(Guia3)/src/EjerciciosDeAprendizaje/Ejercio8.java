
package EjerciciosDeAprendizaje;

import java.util.Scanner;

public class Ejercio8 {
/*Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”. Por ejemplo,
si el cuadrado tiene 4 elementos por lado se deberá dibujar lo siguiente:
* * * *
*     *
*     *
* * * *          */

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String caracter = "* ";
        int elementos;
        System.out.println("Cuantos elementos va a utilizar:");
        elementos = leer.nextInt();
        for (int i = 0; i < elementos; i++) {
            if (i==elementos-1 || i==0) {
                for (int j = 0; j < elementos; j++) {
                    System.out.print(caracter);
                }
            }else{
                for (int j = 0; j < elementos; j++) {
                    if (j==elementos-1 || j==0) {
                        System.out.print(caracter);
                    }else{
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }
       
    }

}
