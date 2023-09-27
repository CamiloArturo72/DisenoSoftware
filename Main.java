public class Main  {
    public static void main(String[]args){
        Circle circulo = new Circle(2.5 , "amarillo");


        System.out.println("Circulo = ");
        System.out.println("Radio = " + circulo.getRadio());
        System.out.println("Color = " + circulo.getColor());
        System.out.println("Area = " + circulo.getArea());

            Cilindro cilindro = new Cilindro(4.0 , 2.0);

            System.out.println("Cilindro = ");
            System.out.println("Radio = " + cilindro.getRadio());
            System.out.println("Altura = " + cilindro.getHeigth());
            System.out.println("Color = " + cilindro.getColor());
            System.out.println("Area de la base = " + cilindro.getArea());
            System.out.println("Volumen = " + cilindro.getVolumen());





    }
}
