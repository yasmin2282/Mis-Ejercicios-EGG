
package EjemplosYejercicoGuia3;

import java.util.Scanner;

public class Ejercicio11Compa {

    public static void main(String[] args) {
        System.out.println("Ingrese frase:");
        Scanner leer = new Scanner(System.in);
         String frase = leer.nextLine().toLowerCase();
        if (frase.isEmpty()) {
            System.out.println("tu frase esta vacia intente nuevamente");
        } else if (frase.substring((frase.length() - 1), frase.length()).equals(".")) {
            String fra = codificar(frase);
            System.out.println(fra);
        } else {
            System.out.println("tu frase no termina con punto, intente nuevamente");
        }
    }

    public static String codificar(String frase) {
        String agregar = "";

        for (int i = 0; i < frase.length(); i++) {

            String letra = frase.substring(i, (i + 1));

            switch (letra) {
                case "a":
                    //System.out.print("@");
                    agregar += "@";
                    break;
                case "e":
                    //System.out.print("#");
                    agregar += "#";
                    break;
                case "i":
                    //System.out.print("$");
                    agregar += "$";
                    break;
                case "o":
                    // System.out.print("%");
                    agregar += "%";
                    break;
                case "u":
                    //System.out.print("*");
                    agregar += "*";
                    break;
                default:
                    //System.out.print(letra);
                   agregar+= letra;
            }
        }
        return agregar;
    }
}
    


