public abstract class TrianguloBase {
    public abstract double CalcularPerimetro();

    public double CalcularAreaConHipotenusa(int lado, int hipotenusa) {
        double cateto = Math.sqrt(Math.pow(hipotenusa, 2) - Math.pow(lado, 2));
        return 0.5 * lado * cateto;
    }
}