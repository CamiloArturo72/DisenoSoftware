public class Circle {
    private double radio = 1.0;
    private String color =  "Red";

    public Circle() {
    }

    public Circle(double radius){
        this.radio = radio;
    }

    public Circle(double radius, String  color){
        this.radio = radio;
        this.color = color;
    }
    public double getRadio(){
        return radio;
    }

    public void setRadio(){
        this.radio = radio;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public double getArea(){
        return Math.PI * radio * radio;
    }
    @Override
    
    public String toString(){
        return "Radio de el circulo = " + radio + "Color = " + color;
    }
}


