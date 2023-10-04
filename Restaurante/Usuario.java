class Usuario {
    private String nombreUsuario;
    private String contrasena;

    public Usuario(String nombreUsuario, String contrasena) {
        this.nombreUsuario = nombreUsuario;
        this.contrasena = contrasena;
    }

    public boolean iniciarSesion(String contrasena) {
        return this.contrasena.equals(contrasena);
    }
}

class Administrador extends Usuario {
    public Administrador(String nombreUsuario, String contrasena) {
        super(nombreUsuario, contrasena);
    }

    public void verListaRecetas(List<Receta> recetas) {
        // Lógica para mostrar la lista de recetas
    }

    public void agregarReceta(List<Receta> recetas, Receta nuevaReceta) {
        recetas.add(nuevaReceta);
    }

    public void verListaIngredientes(List<Ingrediente> ingredientes) {
        // Lógica para mostrar la lista de ingredientes
    }
}

class Receta {
    private String nombre;
    private double tiempoPreparacion;
    private int cantidadPe