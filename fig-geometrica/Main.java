public class Main {
    public static void main(String[] args) {
        // Crear un cuadrado
        Cuadrado cuadrado = new Cuadrado(4);

        // Calcular y mostrar el área del cuadrado
        double areaCuadrado = cuadrado.getArea();
        System.out.println("Área del cuadrado: " + areaCuadrado);

        // Crear un triángulo
        Triangulo triangulo = new Triangulo(5, 4);

        // Calcular y mostrar el área del triángulo
        double areaTriangulo = triangulo.getArea();
        System.out.println("Área del triángulo: " + areaTriangulo);

        // Crear un cubo
        Cubo cubo = new Cubo(3);

        // Calcular y mostrar el área del cubo
        double areaCubo = cubo.getArea();
        System.out.println("Área del cubo: " + areaCubo);
    }
}

 