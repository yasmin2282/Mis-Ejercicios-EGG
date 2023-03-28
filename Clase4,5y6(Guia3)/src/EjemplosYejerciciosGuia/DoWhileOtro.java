package EjemplosYejerciciosGuia;

import java.util.Scanner;

public class DoWhileOtro {
/*Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe salir del bucle
y mostrar el mensaje "Se capturó el numero cero".  El programa deberá calcular y mostrar el resultado de la suma
de los números leídos, pero si el número es negativo no debe sumarse. Nota: recordar el uso de la sentencia break.*/
    public static void main(String[] args) {
        int numero, i = 0, suma = 0;
        Scanner entrada = new Scanner(System.in);

        do {
            System.out.println("Digite un numero " + (i + 1) + ": ");
            numero = entrada.nextInt();

            if (numero == 0) {
                System.out.println("Se capturó el numero cero");
                break;
            }

            i++;
            if (numero < 0) {
                continue;
            }

            suma = suma + numero;
            // i=i+1;

        } while (i < 20);

            System.out.println("La suma de los numero ingresados es: " + suma);
    }
}