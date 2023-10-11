public class Vendedor extends Empleado{
    private double ventas;

    public Vendedor( String nombre ){  
        super( nombre );
        ventas = 0;
    }
    public void incrementarSalario(){ 
        ventas =+ 100;
    }
    public void imprimir(  ){
       super.imprimir();
        System.out.println(" El total de ventas es  : " + ventas);
    }
}
