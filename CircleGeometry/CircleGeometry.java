public class CircleGeometry {
    double radius;

    public CircleGeometry() {
        radius = 1.0;
    }

    public CircleGeometry(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    public String toString() {
        return "circle[radius=" + radius + "]";
    }

    public static void main(String[] args) {
        CircleGeometry circle = new CircleGeometry(5.0);

        System.out.println("Círculo:");
        System.out.println("Radio: " + circle.getRadius());
        System.out.println("Área: " + circle.getArea());
        System.out.println("Circunferencia: " + circle.getCircumference());
        System.out.println(circle);
    }
}
