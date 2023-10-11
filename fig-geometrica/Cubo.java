public class Cubo extends Cuadrado {
    public  Cubo(int lado){
        super(lado);
    }
    
    public double getArea(){
        return 6 * super.getArea();
    }
}
