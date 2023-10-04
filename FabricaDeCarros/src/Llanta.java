public class Llanta {
    private double tamaño;
    private String tipo;
    
    // Constructor
    public Llanta(double tamaño, String tipo) {
        this.tamaño = tamaño;
        this.tipo = tipo;
    }
    
    // Obtener información de la llanta
    public String ObtenerInformacion() {
        return "Tamaño: " + tamaño + " Tipo: " + tipo;
    }
    
    // Otras operaciones específicas de la llanta
}
