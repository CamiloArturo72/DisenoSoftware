public class Acutangulo extends TrianguloBase{
    private int lado1;
    private int lado2;
    public Acutangulo( int lado1 , int lado2 ){  
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    @Override
    public double  CalcularPerimetro(){  
        double hipotenusa = Math.sqrt(Math.pow(lado1, 2) + Math.pow(lado2, 2));
        return lado1 + lado2 + hipotenusa;
    }
}
