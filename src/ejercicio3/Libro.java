/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

/**
 *
 * @author Marco
 */
public class Libro {
    //Atributos 
    String titulo, autor, estado;
    int paginas;
    //Constructor

    public Libro(String titulo, String autor, String estado, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.estado = estado;
        this.paginas = paginas;
    }
    //Métodos
    public void prestar() {
        if (estado.equalsIgnoreCase("disponible")) {
            estado = "prestado";
            System.out.println("Prestamo exitoso.");
        } else {
            System.out.println("No se puede prestar el libro. Estado actual: " + estado);
        }
    }

    public void devolver() {
        if (estado.equalsIgnoreCase("prestado")) {
            estado = "disponible";
            System.out.println("Devolucion exitosa.");
        } else {
            System.out.println("El libro no se encuentra prestado.");
        }
    }

    public void mostrarInfo() {
        System.out.println("=== DATOS DEL LIBRO ===");
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Estado: " + estado);
        System.out.println("Paginas: " + paginas);
    }
    
}

