package EjerciciosExtras;

import java.util.Scanner;

public class Ejercicio1 {

    /*Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el usuario ingresa 1600 minutos, 
el sistema debe calcular su equivalente: 1 día, 2 horas.*/
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int dia, minutos;
        dia=0;
        double horas;
        System.out.println("ingrese los minutos que quiere convertir:");
        minutos = leer.nextInt();
        horas = minutos / 60;
        //System.out.println(minutos+" minutos = "+horas);
        System.out.println("");
        if (horas > 25 && horas < 48) {
            dia = 1;

        } else if (horas > 48 && horas < 72) {
            dia = 2;
        } else if (horas > 72 && horas < 96) {
            dia = 3;
        }
        System.out.println(minutos+" minutos = "+dia +"dias");
    }
}

}
