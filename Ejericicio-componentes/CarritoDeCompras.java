import java.util.ArrayList;
import java.util.List;

public class CarritoDeCompras {
    private List <Producto> productosEnElCarrito = new ArrayList<>();

    public void agregarProducto(Producto producto){
        productosEnElCarrito.add(producto);
    }

    public double calcularTotal(){
        double total = 0;
        for(Producto producto : productosEnElCarrito){
            total += producto.getprecio();
        }
        return total;
    }

}
