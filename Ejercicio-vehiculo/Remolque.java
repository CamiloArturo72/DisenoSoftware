class Remolque {
    private int peso;

    public Remolque(int peso) {
        this.peso = peso;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String toString() {
        return "El peso del remolque es : " + peso + " kg";
    }
}

