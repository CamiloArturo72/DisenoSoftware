public class Producto{
    private int id;
    private String nombre;
    private String descripcion;
    private double precio;

    public Producto(int id , String nombre , String descripcion , double precio) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
    }
    public int getId(){
        return id;
    }
    public double getprecio(){
        return precio;
    }
}