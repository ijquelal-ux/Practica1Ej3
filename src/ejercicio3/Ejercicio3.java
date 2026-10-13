/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;
import java.util.Scanner;
/**
 *
 * @author Marco
 */
public class Ejercicio3 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int op;
        Libro libros[] = null;
        System.out.println("Cuantos libros desea registrar: ");
        int n = sc.nextInt();
        sc.nextLine();
        do {
            System.out.println("====SISTEMA DE PRESTAMO DE LIBROS====");
            System.out.println("1. Ingresar libros");
            System.out.println("2. Prestar libro");
            System.out.println("3. Devolver libro");
            System.out.println("4. Mostrar Informacion");
            System.out.println("5. Salir");
            System.out.print("Ingrese una opcion: ");
            op = sc.nextInt();
            sc.nextLine();
            switch (op) {
                case 1:
                    libros = new Libro[n];
                    for (int i = 0; i < n; i++) {
                        System.out.println("Datos del libro Nº" + (i + 1) + ": ");
                        System.out.print("Titulo: ");
                        String titulo = sc.nextLine();
                        System.out.print("Autor: ");
                        String autor = sc.nextLine();
                        System.out.print("Estado (disponible, prestado, extraviado): ");
                        String estado = sc.nextLine();
                        System.out.print("Paginas: ");
                        int paginas = sc.nextInt();
                        sc.nextLine();
                        libros[i] = new Libro(titulo, autor, estado, paginas);
                    }
                    break;
                case 2:
                    for (int i = 0; i < n; i++) {
                        libros[i].prestar();
                    }
                    break;
                case 3:
                    for (int i = 0; i < n; i++) {
                        libros[i].devolver();
                    }
                    break;
                case 4:
                    for (int i = 0; i < n; i++) {
                        libros[i].mostrarInfo();
                    }
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        } while (op != 5);
    }
}
