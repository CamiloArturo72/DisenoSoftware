public class Cilindro extends Circle {
    private double heigth = 1.0;

public Cilindro(){
}

public Cilindro(double radius){
    super(radius);
}

public Cilindro(double radius , double heigth){
    super(radius);
    this.heigth = heigth;
}

public Cilindro(double radius , double heigth , String color){
    super(radius);
    this.heigth = heigth;
}

public double getHeigth(){
    return heigth;
}

public void setHeigth(double heigth){
    this.heigth = heigth;
}

public double getVolumen(){
    return getArea() * heigth;
}




}

