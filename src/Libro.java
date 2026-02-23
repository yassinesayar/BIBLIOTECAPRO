 class Libro {

    //Atributos del libro
    private String ISBN;
    private String titulo;
    private String autor;
    private int añoPublicacion;
    private String editorial;
    private Genero genero;
    private int copiasTotales;
    private int copiasDisponibles;
    private EstadoLibro estado;

    //Constructores del libro
     public Libro(String ISBN, String titulo, String autor, int añoPublicacion,
                  String editorial, Genero genero, int copiasTotales, int copiasDisponibles) {

         this.ISBN = ISBN;
         this.titulo = titulo;
         this.autor = autor;
         this.añoPublicacion = añoPublicacion;
         this.editorial = editorial;
         this.genero = genero;
         this.copiasTotales = copiasTotales;
         this.copiasDisponibles = copiasDisponibles;
         this.estado = EstadoLibro.DISPONIBLE;
     }
    // Getters
     public String getIsbn() {
         return ISBN;
     }

     public String getTitulo() {
         return titulo;
     }

     public String getAutor() {
         return autor;
     }

     public int getAnioPublicacion() {
         return añoPublicacion;
     }

     public String getEditorial() {
         return editorial;
     }

     public Genero getGenero() {
         return genero;
     }

     public int getCopiasTotales() {
         return copiasTotales;
     }

     public int getCopiasDisponibles() {
         return copiasDisponibles;
     }

     public EstadoLibro getEstado() {
         return estado;
     }

     //Metodos disponibles para el libro
     public void prestar() {

         if (copiasDisponibles <= 0) {
             throw new RuntimeException("No hay copias disponibles.");
         }

         copiasDisponibles--;

         if (copiasDisponibles == 0) {
             estado = EstadoLibro.PRESTADO;
         }
     }
     public void devolver() {

         if (copiasDisponibles >= copiasTotales) {
             throw new RuntimeException("No hay préstamos activos.");
         }

         copiasDisponibles++;
         estado = EstadoLibro.DISPONIBLE;
     }

    public void reservar() {

     if (estado == EstadoLibro.PRESTADO) {
         throw new RuntimeException("No se puede reservar. No hay copias.");
     }

     estado = EstadoLibro.RESERVADO;
 }
    //Metodo para actualizar
     private void actualizarEstado() {
         if (copiasDisponibles == 0) {
             estado = EstadoLibro.PRESTADO;
         } else if (estado != EstadoLibro.RESERVADO) {
             estado = EstadoLibro.DISPONIBLE;
         }
     }

     //Aqui usariamos el sobreescribir
     @Override
     public String toString() {
         return "------------------------\n" +
                 "ISBN: " + ISBN + "\n" +
                 "Título: " + titulo + "\n" +
                 "Autor: " + autor + "\n" +
                 "Año: " + añoPublicacion + "\n" +
                 "Editorial: " + editorial + "\n" +
                 "Género: " + genero + "\n" +
                 "Copias disponibles: " + copiasDisponibles + "/" + copiasTotales + "\n" +
                 "Estado: " + estado + "\n" +
                 "------------------------";
     }
 }


