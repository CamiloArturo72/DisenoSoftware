import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese los datos del libro:");
        System.out.print("Título: ");
        String tituloLibro = scanner.nextLine();
        System.out.print("Precio: ");
        float precioLibro = scanner.nextFloat();
        System.out.print("Número de Páginas: ");
        int numPaginas = scanner.nextInt();
        System.out.print("Año de Publicación: ");
        int anioPublicacion = scanner.nextInt();

        // Crear instancia de Libro
        Libro libro = new Libro(tituloLibro, precioLibro, numPaginas, anioPublicacion);

        // Solicitar datos de un disco al usuario
        System.out.println("\nIngrese los datos del disco:");
        System.out.print("Título: ");
        scanner.nextLine(); // Limpiar el búfer del teclado
        String tituloDisco = scanner.nextLine();
        System.out.print("Precio: ");
        float precioDisco = scanner.nextFloat();
        System.out.print("Duración (minutos): ");
        float duracionDisco = scanner.nextFloat();

        // Crear instancia de Disco
        Disco disco = new Disco(tituloDisco, precioDisco, duracionDisco);

        // Mostrar detalles de las publicaciones
        System.out.println("\nDetalles del Libro:");
        libro.mostrar();

        System.out.println("\nDetalles del Disco:");
        disco.mostrar();

        scanner.close();
    }
}
