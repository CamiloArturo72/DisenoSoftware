public class Cuadrado  extends FiguraGeometrica {
    public Cuadrado(int valor1){
        super(valor1);
    }

    @Override
    public double getArea(){
        return getValor1() * getValor1();
    }
    @Override
    public double getPerimetro(){
        return 4 * getValor1();
    }
}
