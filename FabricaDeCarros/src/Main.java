public class Main {
    public static void main(String[] args) {
        // Crear objetos Llanta y Chasis
        Llanta llanta = new Llanta(17.5, "Normal");
        Chasis chasis = new Chasis(1500, "Fibra de carbono");
        
        // Crear un objeto Carro y asignar llanta y chasis
        Carro carro = new Carro("Lamborghini urus");
        carro.AsignarLlanta(llanta);
        carro.AsignarChasis(chasis);
        carro.EstablecerColor("Negro mate");
        
        // Obtener información del carro y mostrarla
        String informacionCarro = carro.ObtenerInformacion();
        System.out.println(informacionCarro);
    }
}