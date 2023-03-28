
package EjemplosYejerciciosGuia;

import java.util.Scanner;

public class Aprueba {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int num1;
            System.out.println("Ingresar un numero!!");
            num1=leer.nextInt();
        
        if(num1>= 0 && num1<=20) {
       
            for(int i = 0; i < num1; i++) {
                System.out.print("*");
            }
            System.out.println();
        
        }else {
            System.out.println("Este numero excede el 20");
        }
    }

}
