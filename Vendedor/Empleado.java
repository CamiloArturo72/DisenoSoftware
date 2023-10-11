public class Empleado{
    private String nombre;
    private String apellidos;
    private String dni;
    private String direccion;
    private String telefono;
    private double salario;
    private int antiguedad;
    private Empleado supervisor;

    public Empleado( String nombre,String apellidos,String dni,String direccion,String telefono,double salario ){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.direccion = direccion;
        this.telefono = telefono;
        this.salario = salario;
        this.antiguedad = 0;
        this.supervisor = null;
    }

    public void imprimirDatos(  ){  
        System.out.println(" El nombre de el empleado es :  " + nombre);
        System.out.println(" El apellido de el empleado es :  " + apellidos);
        System.out.println(" El DNI de el empleado es :  " + dni);
        System.out.println(" La direccion de el empleado es :  " + direccion);
        System.out.println(" El teledono de el empleado es :  " + telefono);
        System.out.println(" El salario de el empleado es de :  " + salario);
        System.out.println(" El empleado lleva trabajando :  " + antiguedad + " con la empresa ");
        if( supervisor != null ){
            System.out.println( " El nombre de el supervisor es :  " + supervisor.getNombre() );
        }
    }

     public void cambiarSupervisor( Empleado supervisor ){ 
            this.supervisor = supervisor;
        }

        public void incrementarSalario( double incremento ){ 
            salario =+ incremento;
        }

    public String getNombre(){
        return nombre;
    }

}