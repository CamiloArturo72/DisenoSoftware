public class nombre{
    private String nombre;
    private String primerApellido;
    private String segundoApellido;

    public nombre(){

    }

    public void leerNombre(String nombre , String primerApellido, String segundoApellido){
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
    }

    public void mostrar(){
        System.out.println("Nombre : " + nombre);
        System.out.println("Apellido:" + primerApellido);
        System.out.println("Segundo apellido:" + segundoApellido    );
       
    }
}