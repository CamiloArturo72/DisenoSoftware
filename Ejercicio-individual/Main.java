public class Main {
    public static void main(String[] args) {
        // Crear canciones
        Cancion cancion1 = new Cancion("Canción 1", 3, 30, "Interprete 1", "Compositor 1");
        Cancion cancion2 = new Cancion("Canción 2", 4, 15, "Interprete 2", "Compositor 2");
        
        // Crear álbumes
        Album album1 = new Album("Álbum 1", 2022, "Descripción Álbum 1", "Medio 1");
        Album album2 = new Album("Álbum 2", 2021, "Descripción Álbum 2", "Medio 2");

        // Agregar canciones a álbumes
        album1.agregarCancion(cancion1);
        album2.agregarCancion(cancion2);

        // Crear colección de música y agregar álbumes
        ColeccionDeMusica coleccion = new ColeccionDeMusica();
        coleccion.agregarAlbum(album1);
        coleccion.agregarAlbum(album2);

        // Buscar un álbum por título
        Album albumEncontrado = coleccion.buscarAlbum("Álbum 1");
        if (albumEncontrado != null) {
            System.out.println("Álbum encontrado: " + albumEncontrado.getTitulo());
        } else {
            System.out.println("Álbum no encontrado.");
        }

        // Buscar una canción por título
        Cancion cancionEncontrada = coleccion.buscarCancion("Canción 2");
        if (cancionEncontrada != null) {
            System.out.println("Canción encontrada: " + cancionEncontrada.getTitulo());
        } else {
            System.out.println("Canción no encontrada.");
        }
    }
}
