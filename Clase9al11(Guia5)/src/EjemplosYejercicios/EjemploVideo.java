package EjemplosYejercicios;

import java.util.Scanner;

public class EjemploVideo {

    /*realizar la multiplicacion de un vector por una matriz.
dado un vector 1xN y una matriz NxM, el resultado del producto es 1xM
ej. vector 1x2 * matriz 2x3 = producto 1x3
    vector=[3,5] * m=[4,8,6] = |3*4+5*2,3*8+5*1,3*6+3*7| = |22,29,53|
                     [2,1,7]
     */
    public static void main(String[] args) {
        //declaracion y creacion de arreglos
        int[] vector = new int[2];//arreglo de una dimension
        int[] producto = new int[3];//arreglo donde se guardara los resultados
        int[][] matriz = {{4, 8, 6}, {2, 1, 7}};//matriz declarada e inicializada con valores predeterminados
        //si no la inicializamos debemos declararla tipo[][] nombreMatriz=new tipo [filas][columnas]
        System.out.println("INGRESE LOS VALORES DEL VECTOR DE TAMAÑO " + vector.length + ":");
        Scanner leer = new Scanner(System.in);
        for (int i = 0; i < vector.length; i++) {
            System.out.print("V [" + i + "]=");
            vector[i] = leer.nextInt();
        }
        //multiplicar vector por matriz
        int sum;
        for (int j = 0; j < matriz[0].length; j++) {
            sum = 0;
            //recorro elvetor y multiplico
            for (int i = 0; i < vector.length; i++) {
                sum += vector[i] * matriz[i][j];
            }
            producto[j] = sum;
        }
        String aux = "";

        //MOSTRAR VECTOR
        System.out.println("*VECTOR");
        //bucle for mejorado
        //for(tipo elemento:arreglo)
        for (int elemento : vector) {
            aux = aux + " " + elemento;
        }
        System.out.println(aux);

        //MOSTRAR MATRIZ
        System.out.println("\n*MATRIZ");
        //para cada fila de matriz
        for (int[] fila : matriz) {
            aux = "";
            //para cada elemento de la fila
            for (int elemento : fila){
            aux += " " + elemento;
            }
            System.out.println(aux);
        }
        //MOSTRAR RESULTADOS
        aux="";
        System.out.println("\n*VECTOR x MATRIZ:);");
        for (int elemento:producto) {
            aux += " "+elemento;
        }
        System.out.println(aux);
        
    }

}


