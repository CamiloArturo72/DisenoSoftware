public class Cilindro extends Circulo{
    private double altura;

    public Cilindro(){

    }
    public double getAltura(){
        return altura;
    }
    public void setAltura(double altura){
        this.altura = altura;
    }
    public double volumen(){
        return area() * altura;
    }

}
