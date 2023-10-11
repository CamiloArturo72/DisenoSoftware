public class Secretario extends Empleado {
    
    private String numeroFax;

    public Secretario( String nombre , double salario , String numeroFax ){
        super(nombre, salario);
        this.numeroFax = numeroFax;
    }
    public void imprimir(  ){  
        super.imprimir();
        System.out.println( " Su puesto en la empresa es : Secretario " );
    }
    
    public void cambiarCoche( String matricula , String marca, String modelo ){
        System.out.println( " Sr secretario , no puede cambiar de coche. " );
    }
    public void darAltaACliente( String nombre , String email , String telefono ){
        System.out.println( " Sr secretario no puede dar de alta al cliente " );
    }
    public void darDeBajaCliente( String nombre ){  
        System.out.println( " Sr secretario usted no puede dar de baja al cliente. " );
    }
    public void cambiarNumeroDeFax( String nuevoNumeroDeFax ){
        this.numeroFax = nuevoNumeroDeFax;
    }
    public String getNumeroDeFax(  ){
        return numeroFax;
    }
}
