public class Circulo{
    private double radio;

    public Circulo(){
}

public void setRradio(double radio){
    this.radio = radio;
}

public double area(){
    return Math.PI * radio * radio;
}

public double circunferencia(){
    return 2 * Math.PI * radio;
}

}