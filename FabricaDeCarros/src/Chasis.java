public class Chasis {
    private double peso;
    private String material;
    
    // Constructor
    public Chasis(double peso, String material) {
        this.peso = peso;
        this.material = material;
    }
    
    // Obtener información del chasis
    public String ObtenerInformacion() {
        return "Peso: " + peso + " Material: " + material;
    }
    
    // Otras operaciones específicas del chasis
}