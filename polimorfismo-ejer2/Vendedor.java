import java.util.ArrayList;
import java.util.List;

public class Vendedor extends Empleado{
    private String matriculaCoche;
    private String marcaDelCoche;
    private String modeloCoche;
    private String telefonoMovil;
    private String areaVenta;
    private List< Cliente > listaClientes;
    private double comision;

    public Vendedor( String nombre, double salario , String matriculaCoche , String marcaDelCoche,String modeloCoche , String telefonoMovil,String areaVenta,double comision){
        super(nombre, salario);
        this.marcaDelCoche = marcaDelCoche;
        this.matriculaCoche = matriculaCoche;
        this.modeloCoche = modeloCoche;
        this.telefonoMovil = telefonoMovil;
        this.areaVenta = areaVenta;
        this.listaClientes = new ArrayList<>();
        this.comision = comision; 
    }

    @Override
    public void imprimir(  ) {  
        super.imprimir();
        System.out.println( " Su puesto en la empresa es de : Vendedor " );

    }
    public void cambiarCoche( String matricula , String marca, String modelo ){
        this.matriculaCoche =  matricula;
        this.marcaDelCoche = marca;
        this.modeloCoche = modelo;
    }
    public void darAltaACliente( String nombre , String email , String telefono ){  
        Cliente nuevoCliente = new Cliente( nombre, email , telefono );
        listaClientes.add( nuevoCliente );
    }

    public void darDeBajaCliente( String nombre ){
        for( Cliente cliente : listaClientes  ){
            if( cliente.getNombre().equals(nombre) ){
                listaClientes.remove(cliente);
                break;
            }
        }
    }
    public String getMatricula(  ){  
        return marcaDelCoche;
    }
    public String getMarcaDelCohe(  ){
        return marcaDelCoche;
    
    }
    public String getModeloCoche(  ){  
        return modeloCoche;
    }
    public List<Cliente> getListaClientes(  ){  
        return listaClientes;
    }
}
