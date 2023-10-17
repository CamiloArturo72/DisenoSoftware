public class Main {
    public static void main(String[] args) {
        // Ejemplo de uso
        Secretario secretario = new Secretario("Juan", 3000.0);
        Vendedor vendedor = new Vendedor("Maria", 35000, "ABC123", "Toyota", "Camry", "555-555-555", "Ventas Norte", 0.1);

        secretario.imprimir();
        System.out.println("-------");
        vendedor.imprimir();
        System.out.println("-------");

        vendedor.cambiarCoche("XYZ456", "Ford", "Focus");
        System.out.println("Nueva Matrícula del Coche del Vendedor: " + vendedor.getMatricula());

        vendedor.darAltaACliente("Cliente1", "cliente1@email.com", "123-456-789");
        vendedor.darAltaACliente("Cliente2", "cliente2@email.com", "987-654-321");

        System.out.println("Clientes del Vendedor:");
        for (Cliente cliente : vendedor.getListaClientes()) {
            cliente.imprimir();
            System.out.println("-------");
        }
    }
}

