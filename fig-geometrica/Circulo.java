public class Circulo extends FiguraGeometrica {
    public Circulo(int valor1){
        super(valor1);
    }

    @Override
    public double getArea(){
        return Math.PI * getValor1() * getValor1();
    }
    @Override
    public double getPerimetro(){
        return 2 * Math.PI * getValor1();
    }
}
