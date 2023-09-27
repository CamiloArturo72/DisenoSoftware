class Publicacion{
    private String titulo;
    private float precio;

    public Publicacion(String titulo , float precio){
        this.titulo = titulo;
        this.precio = precio;
    }

    public void mostrar(){
        System.out.println("Titulo :" + titulo);
        System.out.println("Precio :" + precio);

    }

}