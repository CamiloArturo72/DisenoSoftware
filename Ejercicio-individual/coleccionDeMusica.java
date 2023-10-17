import java.util.ArrayList;
import java.util.List;

class ColeccionDeMusica {
    private List<Album> listaDeAlbumes;

    public ColeccionDeMusica() {
        listaDeAlbumes = new ArrayList<>();
    }

    public Album buscarAlbum(String titulo) {
        for (Album album : listaDeAlbumes) {
            if (album.getTitulo().equals(titulo)) {
                return album;
            }
        }
        return null; // Si no se encuentra el presunto álbum
    }

    public Cancion buscarCancion(String titulo) {
        for (Album album : listaDeAlbumes) {
            for (Cancion cancion : album.getCanciones()) {
                if (cancion.getTitulo().equals(titulo)) {
                    return cancion;
                }
            }
        }
        return null; // Si no se encuentra la Canción
    }

    public void agregarAlbum(Album album) {
        listaDeAlbumes.add(album);
    }

    // Getter para obtener la lista de álbumes
    public List<Album> getListaDeAlbumes() {
        return listaDeAlbumes;
    }

    // Setter para establecer la lista de álbumes (si es necesario)
    public void setListaDeAlbumes(List<Album> listaDeAlbumes) {
        this.listaDeAlbumes = listaDeAlbumes;
    }
}
