public class Vendedor extends Empleado{
    private double ventasaMensuales;

    public Vendedor( String nombre, String apellidos, String dni, String direccion, String telefono, double salario ){
        super(nombre, apellidos, dni, direccion, telefono, salario);
        this.ventasaMensuales = 0.0;
    }
    
    public void vender(  ){
        ventasaMensuales += 100.000;
    }
}
