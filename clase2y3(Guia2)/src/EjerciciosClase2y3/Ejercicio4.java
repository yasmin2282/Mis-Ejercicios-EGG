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
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int grados;
        System.out.println("Ingrese los grados centigrados:");  
        grados = leer.nextInt();
        System.out.println(grados + " grados es igual a " +(32+(9*grados/5)));
    }
    
}
