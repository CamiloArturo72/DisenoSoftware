import java.util.ArrayList;
import java.util.List;

public class SistemaDeCompras {
    List<Producto> catalogo = new ArrayList<>();
    List<Usuario> usuariosRegistrados = new ArrayList<>();
    CarritoDeCompras carrito = new CarritoDeCompras();

    public void agregarAlCatalogo(Producto producto){
        catalogo.add(producto);
    }

    public void registrarUsuario(Usuario usuario){
        usuariosRegistrados.add(usuario);
    }
    public boolean iniciarSesion(String email , String contrasena){
        for(Usuario usuario : usuariosRegistrados){
            if (usuario.email.equals(email) && usuario.contrasena.equals(contrasena)){
                return true;
            }
        }
        return false;
    }
    public void agregarProductoAlCarrito(int idProducto){
        for(Producto producto : catalogo){
            if (producto.getId() == idProducto) {
                carrito.agregarProducto(producto);
                break;
            }
        }
    }
    public double verificarCompra(){
        return carrito.calcularTotal();
    }
    public void completarLaCompra(){
        System.out.println(" La compra a sido realizada , su pedido esta en proceso ");
    }
}
