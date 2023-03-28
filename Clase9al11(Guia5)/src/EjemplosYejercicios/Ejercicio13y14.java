
package EjemplosYejercicios;

import java.util.Scanner;

public class Ejercicio13y14 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String[] equipo=new String[6];
        String aux="";
        System.out.println("ingrese los valores del vector de tamaño"+equipo.length+":");
        for (int i = 0; i < equipo.length; i++) {
            System.out.print("v["+i+"]=");
            equipo[i]=leer.next();
        }
        System.out.println("==============");
        System.out.println("VECTOR: Equipo");
        for (int i = 0; i < equipo.length; i++) {
            System.out.print("["+equipo[i]+"]");
        }
    }

}
