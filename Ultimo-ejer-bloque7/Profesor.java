public class Profesor extends Persona{
    private String departamento;

    public Profesor( String nombre , String apellidos , String id , String estadoCivil , String departamento){  
        super( nombre , apellidos , id , estadoCivil );
        this.departamento = departamento;
    }

    public void cambiarDepartamento(String newDep){  
        this.departamento = newDep;
    }

}
