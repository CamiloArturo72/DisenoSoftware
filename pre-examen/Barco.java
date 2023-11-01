import java.util.Date;

class Barco {
    private String matricula;
    private double eslora;
    private int anoFabricacion;

    public Barco(String matricula, double eslora, int anoFabricacion) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.anoFabricacion = anoFabricacion;
    }

    public double calcularModulo() {
        return eslora * 10;
    }
}
