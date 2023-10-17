import java.util.ArrayList;
import java.util.List;

class Album {
    private String titulo;
    private int ano;
    private String descripcion;
    private List<Cancion> canciones;
    private String medioGrabacion;

    public Album(String titulo, int ano, String descripcion, String medioGrabacion) {
        this.titulo = titulo;
        this.ano = ano;
        this.descripcion = descripcion;
        this.medioGrabacion = medioGrabacion;
        this.canciones = new ArrayList<>();
    }

    public void agregarCancion(Cancion cancion) {
        canciones.add(cancion);
    }

    public void modificarAlbum(String nuevoTitulo, int nuevoAno, String nuevaDescripcion, String nuevoMedioGrabacion) {
        this.titulo = nuevoTitulo;
        this.ano = nuevoAno;
        this.descripcion = nuevaDescripcion;
        this.medioGrabacion = nuevoMedioGrabacion;
    }

    public void eliminarAlbum() {
        // Implementa la lógica para eliminar el álbum si es necesario.
    }

    // Getters y setters para los atributos privados
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<Cancion> getCanciones() {
        return canciones;
    }

    public String getMedioGrabacion() {
        return medioGrabacion;
    }

    public void setMedioGrabacion(String medioGrabacion) {
        this.medioGrabacion = medioGrabacion;
    }
}
