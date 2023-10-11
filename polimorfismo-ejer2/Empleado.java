public class Empleado{
    private String nombre;
    private double salario;

    public Empleado( String nombre , double salario){  
        this.nombre = nombre;
        this.salario = salario;
    }

    public void imprimir(  ){  
        System.out.println( " Nombre =  " + nombre );
        System.out.println( " Salario =  " + nombre );

    }
}