public class Rectangulo extends FiguraGeometrica {
    private int valor2;
    public Rectangulo( int valor1, int valor2 ){
        super(valor1);
        this.valor2 = valor2;
    }
    public double getArea(){
        return valor2;
    }

    public double getPerimetro(){
        return 2 * (getValor1() + valor2);
    }

    public int getValor2(){
        return valor2;
    }
    public void setValor2(int valor2){
        this.valor2 = valor2;
    }
}
