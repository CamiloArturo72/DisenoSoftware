public class Empleado{  
    private String nombre;
    private double salario;

    public Empleado( String nombre ){ 
        this.nombre = nombre;
        this.salario = 0;
    }

    public void  incrementarSalario(){
        salario *=1.2; 
    }
    public void imprimir(  ){
        System.out.println( " Name :  " + nombre );
        System.out.println( " Salario :  " + salario );

    }
}