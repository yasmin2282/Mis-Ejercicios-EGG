
package EjemplosYejercicoGuia3;

import java.util.Scanner;

public class Ejercicio12 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese dos numeros");
        int numero1=leer.nextInt();
        int numero2=leer.nextInt();
        
        esMultiplo(numero1, numero2);
                
    }
    public static void esMultiplo(int num1, int num2) {
        if (num1%num2 == 0) {
            System.out.println(num1 +" es multiplo de "+num2 );
        }else{
            System.out.println(num1 +" no es multiplo de "+num2);
        }
    }
}
