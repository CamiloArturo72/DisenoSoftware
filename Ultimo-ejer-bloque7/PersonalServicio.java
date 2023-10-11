public class PersonalServicio extends Persona {
    private String seccionAsignada;

    public PersonalServicio( String nombre , String apellidos , String id , String estadoCivil , String seccionAsignada ){  
        super(nombre, apellidos, id, estadoCivil);
        this.seccionAsignada = seccionAsignada;
    }
    public void transladarSeccion( String nuevaSeccion ) {  
        this.seccionAsignada = nuevaSeccion;
    }


}
