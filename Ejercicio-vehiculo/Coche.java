class Coche extends Vehiculo {
    private int numeroPuertas;

    public Coche(String matricula, int numeroPuertas) {
        super(matricula);
        this.numeroPuertas = numeroPuertas;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }
}

