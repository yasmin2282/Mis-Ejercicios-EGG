package EjerciciosDeAprendizaje;

import java.util.Scanner;

public class Ejercicio3 {

    /*Crea una aplicación que a través de una función nos convierta una cantidad de euros introducida por teclado a otra moneda, 
estas pueden ser a dólares, yenes o libras. La función tendrá como parámetros, la cantidad de euros y la moneda a convertir que 
será una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio (void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 € */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int euros = 0;
        String moneda = "";

        cambioMoneda(euros, moneda);

    }

    public static void cambioMoneda(int euros, String moneda) {

        

            Scanner leer = new Scanner(System.in);
            String op;
            do {
            System.out.println("Cuantos euros desea cambiar:");
            euros = leer.nextInt();
            System.out.println("A que moneda va a cambiar:"
                    + "Libras, Dolares o Yenes?");
            moneda = leer.next();
            switch (moneda) {
                case "Libras":
                    System.out.println(euros+" euros = "+euros * 0.86 +" libras");
                    System.out.println("===============================");
                    break;
                case "Dolares":
                    System.out.println(euros+" euros = "+euros * 1.28611 +" Dolares");
                    System.out.println("===============================");
                    break;
                case "Yenes":
                    System.out.println(euros+" euros = "+euros * 129.852 +" yenes");
                    System.out.println("===============================");
                    break;
                default:
                    System.out.println("La moneda ingresada no esta en el sistema o verifique que no aya error de ortografia");
                    
            }System.out.println("Quiere continuar cambiando? (S/N");
             op = leer.next();

        } while (op.equalsIgnoreCase("S"));
         System.out.println("Ok, que tenga un indo dia...");   

    }
}
