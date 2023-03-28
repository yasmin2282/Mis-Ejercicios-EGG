/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjerciciosClase2y3;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Ejercicio1V2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
int numero1,numero2;
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite el primer numero: ");
        numero1 = entrada.nextInt();
        System.out.print("Digite el segundo numero: ");
        numero2 = entrada.nextInt();
        
        
        System.out.println("La suma de " + numero1 + " + " + numero2 + " es: " + (numero1+numero2));    }
    
}
