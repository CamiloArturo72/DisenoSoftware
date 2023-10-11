public class Main {
    public static void main(String[] args) {
        Coche coche = new Coche("223AWQ", "Toyota", "Camry");
        jefeDeZona jefe = new jefeDeZona("Camilo", "Despacho 1", coche);
        Vendedor vendedor1 = new Vendedor("Juanjo");
        Vendedor vendedor2 = new Vendedor("Angela");

        jefe.darDeAltaVendedor(vendedor1);
        jefe.darDeAltaVendedor(vendedor2);

        jefe.imprimir();
        jefe.incrementarSalario();
        jefe.imprimir();
    }
}
