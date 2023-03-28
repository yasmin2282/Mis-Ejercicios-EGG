
package EjemplosYejerciciosGuia;

import java.util.Scanner;

public class While {
/*Escriba un programa que valide si una nota está entre 0 y 10, sino está
entre 0 y 10 la nota se pedirá de nuevo hasta que la nota sea correcta.*/

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num;
        System.out.println("Ingrese nota:");
        num = leer.nextInt();
        
        while (num<0 || num>10) {
            System.out.println("Nota incorrecta, Ingrese nota correcta");
            num = leer.nextInt();
            
        }
        System.out.println("Usted ingreso una nota correcta");
        
        
    }
    
}
