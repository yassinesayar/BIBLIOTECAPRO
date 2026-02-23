
import java.util.ArrayList;

    public class Usuario {

        private int id;
        private String nombre;
        private EstadoUsuario estado;
        private ArrayList<String> librosPrestados;

        private static final int MAX_LIBROS = 3;


        public Usuario(int id, String nombre) {
            this.id = id;
            this.nombre = nombre;
            this.estado = EstadoUsuario.ACTIVO;
            this.librosPrestados = new ArrayList<>();
        }


        public void prestarLibro(String tituloLibro) {

            if (estado == EstadoUsuario.SANCIONADO) {
                System.out.println("El usuario está sancionado.");
                return;
            }

            if (librosPrestados.size() >= MAX_LIBROS) {
                System.out.println("No puede tener más de 3 libros.");
                return;
            }

            librosPrestados.add(tituloLibro);
            System.out.println("Libro prestado correctamente.");
        }


        public void devolverLibro(String tituloLibro) {
            librosPrestados.remove(tituloLibro);
            System.out.println("Libro devuelto.");
        }


        public void mostrarInfo() {
            System.out.println("ID: " + id);
            System.out.println("Nombre: " + nombre);
            System.out.println("Estado: " + estado);
            System.out.println("Libros prestados: " + librosPrestados);
        }


        public void cambiarEstado(EstadoUsuario nuevoEstado) {
            this.estado = nuevoEstado;
        }
    }

