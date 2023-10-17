class Cancion {
    private String titulo;
    private int duracionMinutos;
    private int duracionSegundos;
    private String interpretes;
    private String compositor;

    public Cancion(String titulo, int duracionMinutos, int duracionSegundos, String interpretes, String compositor) {
        this.titulo = titulo;
        this.duracionMinutos = duracionMinutos;
        this.duracionSegundos = duracionSegundos;
        this.interpretes = interpretes;
        this.compositor = compositor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracionMinutos() {
        return duracionMinutos;
    }

    public void setDuracionMinutos(int duracionMinutos) {
        this.duracionMinutos = duracionMinutos;
    }

    public int getDuracionSegundos() {
        return duracionSegundos;
    }

    public void setDuracionSegundos(int duracionSegundos) {
        this.duracionSegundos = duracionSegundos;
    }

    public String getInterpretes() {
        return interpretes;
    }

    public void setInterpretes(String interpretes) {
        this.interpretes = interpretes;
    }

    public String getCompositor() {
        return compositor;
    }

    public void setCompositor(String compositor) {
        this.compositor = compositor;
    }

    public void modificarCancion(String nuevoTitulo, int nuevaDuracionMinutos, int nuevaDuracionSegundos, String nuevoCompositor) {
        this.titulo = nuevoTitulo;
        this.duracionMinutos = nuevaDuracionMinutos;
        this.duracionSegundos = nuevaDuracionSegundos;
        this.compositor = nuevoCompositor;
    }

    public void eliminarCancion() {
        
    }
}
