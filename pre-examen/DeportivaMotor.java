class DeportivaMotor extends Barco {
    private int potenciaCV;

    public DeportivaMotor(String matricula, double eslora, int anoFabricacion, int potenciaCV) {
        super(matricula, eslora, anoFabricacion);
        this.potenciaCV = potenciaCV;
    }

    @Override
    public double calcularModulo() {
        return super.calcularModulo() + potenciaCV;
    }
}