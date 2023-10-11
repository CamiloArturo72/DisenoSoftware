public class Estudiante extends Persona{
    private String cursoMatriculado;

    public Estudiante( String nombre , String apellido , String id , String estadoCivil , String cursoMatriculado ){  
        super(nombre, apellido, id, estadoCivil);
        this.cursoMatriculado = cursoMatriculado;
    }

    public void matricularNuevoCurso(String newCurse){  
        this.cursoMatriculado = newCurse;
    }
}
