public class Main {
    public static void main(String[] args) {
        Escaleno escaleno = new Escaleno(5, 6, 7);
        double perimetroEscaleno = escaleno.CalcularPerimetro();
        double areaEscaleno = escaleno.CalcularAreaConHipotenusa(5, 7);

        Acutangulo acutangulo = new Acutangulo(3, 4);
        double perimetroAcutangulo = acutangulo.CalcularPerimetro();
        double areaAcutangulo = acutangulo.CalcularAreaConHipotenusa(3, 4);

        System.out.println("Perímetro del triángulo Escaleno: " + perimetroEscaleno);
        System.out.println("Área del triángulo Escaleno: " + areaEscaleno);

        System.out.println("Perímetro del triángulo Acutángulo: " + perimetroAcutangulo);
        System.out.println("Área del triángulo Acutángulo: " + areaAcutangulo);
    }
}