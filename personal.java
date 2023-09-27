public class personal extends Person {
    private String schol;
    private double pay;

public personal (String name , String address , String school , double pay){
    super(name , address);
    this.schol = schol;
    this.pay = pay;
}

public String getSchol(){
    return schol;
}

public void setSchol(String schol){
    this.schol = schol;
}

public double getPay(){
    return pay;
}

public void setPay(double pay){
    this.pay = pay;
}

@Override

public String toString(){
   return "Staff[person[name=]]" + getName() + "adrres = " + getAddress() + "schol = " + getSchol() + "Pay = " +getPay();
}

}
