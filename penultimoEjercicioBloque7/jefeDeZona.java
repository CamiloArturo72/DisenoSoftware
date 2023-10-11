import java.util.ArrayList;
import java.util.List;

public class jefeDeZona extends Empleado{
    private Coche coche;
    private List<Vendedor> vendedores;
    private Secretario secretario;

    public jefeDeZona( String nombre ,  String despacho , Coche coche){
        super(nombre);
        this.coche = coche;
        this.vendedores = new ArrayList<>();
        this.secretario = secretario;
    }
    public void cambiarDeSecretario( Secretario secretario ){  
        this.secretario.cambiarDeSecretario(secretario);
    }
    public void cambiarDeCoche( Coche cohe ){ 
        this.coche = coche;
    }
    public void darDeAltaVendedor( Vendedor vendedor ){ 
        vendedores.add(vendedor);
    }
    public void darDeBajaVendedor( Vendedor vendedor ){
        vendedores.remove(vendedor);
    }
    public void incrementarSalario(  ){
        super.incrementarSalario();
        secretario.incrementarSalario();
    for( Vendedor vendedor : vendedores ){  
        vendedor.incrementarSalario();
    }
    }
    public void imprimir(  ){  
        super.imprimir();
        System.out.println( " Coche :  " + coche );
        System.out.println( " Secretario :  ");
        secretario.imprimir();
        System.out.println( " Vendedores :  " );
        for( Vendedor vendedor : vendedores ){  
            vendedor.imprimir(  );
        }

    }
}
