public class Escaleno extends TrianguloBase {
    private int lado1;
    private int lado2;
    private int lado3;
    public Escaleno( int lado1 , int lado2 , int lado3 ){
        this.lado1 = lado1;             
        this.lado2 = lado2;
        this.lado3 = lado3;      
    }
    public double CalcularPerimetro(){
        return lado1 + lado2 + lado3;
    }
    
}
