public class Secretario extends Empleado{
    private String despacho;
    public Secretario( String nombre , String despacho ){  
        super(nombre);
        this.despacho = despacho;
    }
    public void cambiarDeSecretario(Secretario secretario){ 
        this.despacho = secretario.despacho;
    }
    public void imprimir(  ){
        super.imprimir();
        System.out.println( " Despacho : " + despacho );
        
    }
}
