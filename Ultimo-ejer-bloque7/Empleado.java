public class Empleado extends Persona{
    private int anoIncorporacion;
    private String numeroDespacho;

    public Empleado( String nombre , String apellidos , String id , String estadoCivil , int anoIncorporacion , String numeroDespacho ){  
        super(nombre, apellidos, id, estadoCivil);
        this.anoIncorporacion = anoIncorporacion;
        this.numeroDespacho = numeroDespacho;
    }

    public void reasignacionDespacho( String nuevoDespacho ){  
        this.numeroDespacho = nuevoDespacho;
    }
}
