package EjemplosYejercicoGuia3;

import java.util.Scanner;

public class EjemploFuncionVoid {

    public static void main(String[] args) {

        String nombre = "Mariano";

        int edad = 29;

        mostrarInfo(nombre, edad);
    }

    public static void mostrarInfo(String nombre, int edad) {

        System.out.println("El nombre del usuario es: " + nombre + "y su edad:" + edad);

    }

}
