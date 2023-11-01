class YateLujo extends Barco {
    private int potenciaCV;
    private int numCamarotes;

    public YateLujo(String matricula, double eslora, int anoFabricacion, int potenciaCV, int numCamarotes) {
        super(matricula, eslora, anoFabricacion);
        this.potenciaCV = potenciaCV;
        this.numCamarotes = numCamarotes;
    }

    @Override
    public double calcularModulo() {
        return super.calcularModulo() + potenciaCV + numCamarotes;
    }
}