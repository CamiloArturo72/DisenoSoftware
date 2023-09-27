public class Direccion extends nombre {
    private String calle;
    private String ciudad;
    private String provincia;
    private String codigoPostal;

    public Direccion(){

    }

    public void nuevaDireccion(String calle , String ciudad, String provincia , String codigoPostal){
        this.calle = calle;
        this.ciudad = ciudad;
        this.provincia = provincia;
        this.codigoPostal =codigoPostal;
    }

    public void nuevoNombre(String nombre , String primerApellido , String segundoApellido){
        leerNombre(nombre, primerApellido, segundoApellido);
    }

    public void mostrar(){
        System.out.println("calle:" + calle);
        System.out.println("ciudad:" + ciudad);
        System.out.println("provincia:" + provincia);
        System.out.println("codigo postal:" + codigoPostal);

    }
}
