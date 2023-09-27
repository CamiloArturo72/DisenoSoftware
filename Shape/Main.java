public class Main {

    public static void main(String[]args){
        Shape shape = new Shape();
        Circle circle = new Circle(2.5,"Azul", true);
        Rectangle rectangle = new Rectangle(4.0,3.0,"verde",false);
        Square square = new Square(2.0, "celeste", false);
        
        System.out.println("infromacion de la forma : ");
        System.out.println(shape);

        System.out.println("infromacion de el circulo : ");
        System.out.println(circle);

        System.out.println("infromacion de el rectangulo : ");
        System.out.println(rectangle);

        System.out.println("infromacion de el cuadrado : ");
        System.out.println(square);
   



    }
    
}
