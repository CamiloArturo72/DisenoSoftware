public class Main {

    public static void main(String[] args){

        Direccion miDireccion = new Direccion();


        miDireccion.nuevoNombre("Camilo", "Bolaños", "Arturo");
        miDireccion.nuevaDireccion("carrera 24 ","Pasto", "idk", "5757");
    
        System.out.println("Direccion:");
        miDireccion.mostrar();
    
    }
    
}
