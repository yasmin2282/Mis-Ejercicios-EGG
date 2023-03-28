
package EjerciciosDeAprensizaje;

import java.util.Scanner;

public class Ejercicio6Compañero {

    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        Scanner leer = new Scanner(System.in);
        int num;
        for (int i = 0; i < matriz[0].length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                do{
                    num = leer.nextInt();
                    if ((num <1 || num>9)) System.out.println("valor ingresado incorrecto");
                }while (num <1 || num>9 );
                matriz[i][j]=num;
            }
        }
        
        if (esMagica(matriz) == true){
            System.out.println("la matriz ES MAGICA ♥️ ,... infeliz!");
        }else{
            System.out.println("la matriz NO ES MAGICA ;)");
        }
        leer.close();
    }
    public static boolean esMagica(int[][] matriz){
        int sumaBandera = matriz[0][0] + matriz[0][1] + matriz[0][2];
        System.out.println(sumaBandera);
        int sumaFila, sumaColumna, sumaDiagonalPrincipal = 0,sumaDiagonalInversa=0;
        for (int i = 0; i < matriz[0].length; i++) {
            sumaFila = 0;
            sumaColumna = 0;
            for (int j = 0; j < matriz[i].length; j++) {
                sumaFila += matriz[i][j]; 
                
                sumaColumna += matriz[j][i]; // 2
                if (i==j){
                    sumaDiagonalPrincipal += matriz[i][j]; //2
                }
                if ( (i+j) == matriz.length-1){
                    sumaDiagonalInversa += matriz[i][j];  // 0
                }
                if (sumaFila != sumaBandera) return false;
                if (sumaColumna != sumaBandera) return false;
            }
            System.out.println(sumaFila);
            System.out.println(sumaColumna);
        }
        //if (sumaBandera != sumaDiagonalPrincipal || sumaBandera != sumaDiagonalInversa) return false;
        return true;
    }
//OJO FALTA CORREGIR LA POSICION DEL IF DONDE RETORNa
}
