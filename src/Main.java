import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        Libro libro = new Libro(
                "123456",
                "El Quijote",
                "Miguel de Cervantes",
                1605,
                "Planeta",
                Genero.NOVELA,
                2,
                2
        );

        int opcion;

        do {
            System.out.println(" MENÚ BIBLIOTECA ");
            System.out.println("1. Mostrar libro");
            System.out.println("2. Prestar libro");
            System.out.println("3. Devolver libro");
            System.out.println("4. Reservar libro");
            System.out.println("5. Salir");
            System.out.print("Opción: ");

            opcion = sc.nextInt();

            try {
                switch (opcion) {

                    case 1:
                        System.out.println(libro);
                        break;

                    case 2:
                        libro.prestar();
                        System.out.println("Libro prestado.");
                        break;

                    case 3:
                        libro.devolver();
                        System.out.println("Libro devuelto.");
                        break;

                    case 4:
                        libro.reservar();
                        System.out.println("Libro reservado.");
                        break;

                    case 5:
                        System.out.println("Saliendo...");
                        break;

                    default:
                        System.out.println("Opción no válida.");
                }

            } catch (IllegalStateException e) {
                System.out.println("Error: " + e.getMessage());
            }

        } while (opcion != 5);

        sc.close();
    }
}
