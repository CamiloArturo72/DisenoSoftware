public class Cliente {
    private String nombre;
    private String email;
    private String telefono;

    public Cliente ( String nombre , String email , String telefono ){
        this.nombre = nombre;
        this.email = email;
        this.telefono = telefono;
    }

    public void imprimir(  ) {  
        System.out.println( " Nombre : " + nombre );
        System.out.println( " email :  " + email );
        System.out.println( " telefono :  " + telefono );

    }
    public String getNombre(  ){
        return nombre;
    }
}
