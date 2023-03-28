package Main;

import Entidad.Libro;
import java.util.Scanner;

public class MainLibro {

    /*Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor, Número de páginas, y un constructor 
con todos los atributos pasados por parámetro y un constructor vacío. Crear un método para cargar un libro pidiendo los datos 
al usuario y luego informar mediante otro método el número de ISBN, el título, el autor del libro y el número de páginas.*/
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Libro libro1 = new Libro();
        
        System.out.println("Ingrese Titulo: ");
        String Titulo = leer.nextLine();

        System.out.println("Ingrese Autor: ");
        String Autor = leer.nextLine();

        System.out.println("Ingrese numero de paginas: ");
        int paginas = leer.nextInt();
        
        System.out.println("Ingrese ISBN:");
        int ISBN = leer.nextInt();
        
        libro1.llenarLibro(ISBN, Titulo, Autor, paginas);
        
        System.out.println("=========================");
        
        libro1.mostrarLibro();
    }

    // L1.llenarLibro(ISBN,Titulo,Autor,paginas);
}
