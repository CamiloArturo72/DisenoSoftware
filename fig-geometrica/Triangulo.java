public class Triangulo extends FiguraGeometrica {
    private int valor2;

    public Triangulo(int valor1, int valor2){

        super(valor1);
        this.valor2 = valor2;    
    }

    public int getValor2(){
        return valor2;
    }

    public void setValor2(int  valor2){
        this.valor2 = valor2;
    }
    public double getArea(){
        return  0.5 * getValor1() * valor2;
    }
    public double getPerimetro(){
        return getValor1() + 2 * Math.sqrt((double)(getValor1() * getValor1()) / 4 + valor2 * valor2);
    }
}
