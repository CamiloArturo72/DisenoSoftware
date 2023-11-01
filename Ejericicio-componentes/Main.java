public class Main {
    public static void main(String[] args) {
        // Crear productos
        Producto producto1 = new Producto(1, "Producto 1", "Descripción del producto 1", 100.0);
        Producto producto2 = new Producto(2, "Producto 2", "Descripción del producto 2", 50.0);
        
        // Crear un sistema de compras
        SistemaDeCompras sistema = new SistemaDeCompras();
        
        // Agregar productos al catálogo
        sistema.agregarAlCatalogo(producto1);
        sistema.agregarAlCatalogo(producto2);
        
        // Registrar usuarios
        Usuario usuario1 = new Usuario("Usuario1", "usuario1@email.com", "password1");
        Usuario usuario2 = new Usuario("Usuario2", "usuario2@email.com", "password2");
        sistema.registrarUsuario(usuario1);
        sistema.registrarUsuario(usuario2);
        
        // Iniciar sesión
        boolean inicioSesionExitoso = sistema.iniciarSesion("usuario1@email.com", "password1");
        if (inicioSesionExitoso) {
            System.out.println("Sesión iniciada.");
        } else {
            System.out.println("Inicio de sesión fallido.");
        }
        
        // Agregar productos al carrito
        sistema.agregarProductoAlCarrito(1);
        sistema.agregarProductoAlCarrito(2);
        
        // Verificar la compra
        double totalCompra = sistema.verificarCompra();
        System.out.println("Total de la compra: $" + totalCompra);
        
        // Completar la compra
        sistema.completarLaCompra();
    }
}
