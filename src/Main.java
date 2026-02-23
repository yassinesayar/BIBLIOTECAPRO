public class Main {
    public static void main(String[] args) {

        Usuario u1 = new Usuario(1, "Carlos");

        u1.prestarLibro("El Quijote");
        u1.prestarLibro("Harry Potter");
        u1.prestarLibro("1984");
        u1.prestarLibro("Otro libro");

        u1.mostrarInfo();

        u1.cambiarEstado(EstadoUsuario.SANCIONADO);
        u1.prestarLibro("Nuevo Libro");
    }
}