public class Main {
    public static void main(String[] args) {
        Supervisor supervisor1 = new Supervisor("Supervisor1", "Apellido1", "12345678A", "Dirección1", "123456789", 3000.0);
        Vendedor vendedor1 = new Vendedor("Vendedor1", "Apellido2", "98765432B", "Dirección2", "987654321", 2000.0);

        // Llama al método vender() en vendedor1
        vendedor1.vender();

        supervisor1.imprimirDatos();
        System.out.println("-------------");
        vendedor1.imprimirDatos();
    }
}
