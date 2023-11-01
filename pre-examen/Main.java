import java.sql.Date;

public class Main {
    public static void main(String[] args) {
        Puerto puerto = new Puerto();

        Velero velero = new Velero("VEL001", 12, 1995, 2);
        DeportivaMotor deportivo = new DeportivaMotor("DEP001", 10, 2005, 250);
        YateLujo yate = new YateLujo("YAT001", 20, 2010, 400, 4);

        Cliente cliente1 = new Cliente("Cliente1", "11111111A");
        Date fechaInicio1 = new Date(123456789L); // Reemplaza 123456789L con una marca de tiempo válida en milisegundos.
        Date fechaFinal1 = new Date(123456789L); // Reemplaza 123456789L con una marca de tiempo válida en milisegundos.
        Alquiler alquiler1 = new Alquiler(cliente1, fechaInicio1, fechaFinal1, 1, velero);

        Cliente cliente2 = new Cliente("Cliente2", "22222222B");
        Date fechaInicio2 = new Date(123456789L); // Reemplaza 123456789L con una marca de tiempo válida en milisegundos.
        Date fechaFinal2 = new Date(123456789L); // Reemplaza 123456789L con una marca de tiempo válida en milisegundos.
        Alquiler alquiler2 = new Alquiler(cliente2, fechaInicio2, fechaFinal2, 2, deportivo);

        Cliente cliente3 = new Cliente("Cliente3", "33333333C");
        Date fechaInicio3 = new Date(123456789L); // Reemplaza 123456789L con una marca de tiempo válida en milisegundos.
        Date fechaFinal3 = new Date(123456789L); // Reemplaza 123456789L con una marca de tiempo válida en milisegundos.
        Alquiler alquiler3 = new Alquiler(cliente3, fechaInicio3, fechaFinal3, 3, yate);

        puerto.agregarAlquiler(alquiler1);
        puerto.agregarAlquiler(alquiler2);
        puerto.agregarAlquiler(alquiler3);

        double ingresosTotales = puerto.calcularIngresosTotales();

        System.out.println("Ingresos totales del puerto: " + ingresosTotales + " pesetas");
    }
}
