public class Main {
    public static void main(String[] args) {
        // Crear una cuenta sin cantidad inicial
        Cuenta cuenta1 = new Cuenta("Juan jose Arturo");
        
        // Crear una cuenta con cantidad inicial
        Cuenta cuenta2 = new Cuenta("Camilo Arturo", 1000.0);
        
        // Realizar operaciones en las cuentas
        cuenta1.ingresar(500.0);
        cuenta2.retirar(200.0);
        
        // Mostrar información de las cuentas
        System.out.println("Cuenta 1: " + cuenta1);
        System.out.println("Cuenta 2: " + cuenta2);
    }
}
