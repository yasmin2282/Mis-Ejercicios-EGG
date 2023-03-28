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
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int numero1, numero2;
    Scanner leer = new Scanner(System.in);
    System.out.println("Ingrese primer numero:");
    numero1 = leer.nextInt();
    System.out.println("Ingrese segundo numero:");
    numero2 = leer.nextInt();
    int suma = numero1 + numero2;
        System.out.println(" la suma de los numeros ingresados es: " +suma);
    }
    
      
}
