import java.util.ArrayList;

public class Supervisor extends Empleado{
    private ArrayList< Empleado > empleadosSupervisados;

    public Supervisor( String nombre,String apellidos,String dni,String direccion,String telefono,double salario ){
        super( nombre,apellidos,dni,direccion,telefono,salario );
        empleadosSupervisados = new ArrayList<>();
    }
}

