public class Carro {
    private Llanta llanta;
    private Chasis chasis;
    private String color;
    private String modelo;
    
    // Constructor
    public Carro(String modelo) {
        this.modelo = modelo;
    }
    
    // Asignar una llanta al carro
    public void AsignarLlanta(Llanta llanta) {
        this.llanta = llanta;
    }
    
    // Asignar un chasis al carro
    public void AsignarChasis(Chasis chasis) {
        this.chasis = chasis;
    }
    
    // Establecer el color del carro
    public void EstablecerColor(String color) {
        this.color = color;
    }
    
    // Obtener información del carro
    public String ObtenerInformacion() {
        String info = "Modelo: " + modelo + "\n";
        if (llanta != null) {
            info += "Llanta: " + llanta.ObtenerInformacion() + "\n";
        }
        if (chasis != null) {
            info += "Chasis: " + chasis.ObtenerInformacion() + "\n";
        }
        if (color != null) {
            info += "Color: " + color + "\n";
        }
        return info;
    }
    
    // Otras operaciones como RealizarPruebaConduccion, CalcularPrecioVenta, etc.
}