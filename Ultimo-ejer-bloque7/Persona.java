public class Persona{  
    private String nombre;
    private String apellidos;
    private String id;
    private String estadoCivil;

    public Persona( String nombre , String apellidos , String id , String estadoCivil ){  
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.id = id;
        this.estadoCivil = estadoCivil;
    }

    public void cambiarEstadoCivil( String nuevoEstadoCivil ){  
        this.estadoCivil = nuevoEstadoCivil;
    }

    public void imprimir(  ){  
        System.out.println( " Nombre :  " + nombre );
        System.out.println( " Apellido :  " + apellidos );
        System.out.println( " Identificacion :  " + id );
        System.out.println( " Estado civil :  " + estadoCivil );

    }
}