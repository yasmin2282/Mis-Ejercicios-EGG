package Entidad;

/*Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor, Número de páginas, y un constructor 
con todos los atributos pasados por parámetro y un constructor vacío. Crear un método para cargar un libro pidiendo los datos 
al usuario y luego informar mediante otro método el número de ISBN, el título, el autor del libro y el número de páginas.*/

public class Libro {

    public int ISBN;
    public String Titulo;
    public String Autor;
    public int paginas;

    public Libro(int ISBN, String Titulo, String Autor, int paginas) {
        this.ISBN = ISBN;
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.paginas = paginas;
    }

    public Libro() {
    }

    public void llenarLibro(int ISBN, String Titulo, String Autor, int paginas) {
        this.ISBN = ISBN;
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.paginas = paginas;
    }
    
    
    public void mostrarLibro(){
        System.out.println("ISBN: "+ISBN);
        System.out.println("Titulo: "+Titulo);
        System.out.println("Autor: " +Autor);
        System.out.println("Paginas: "+paginas);
    }

}
