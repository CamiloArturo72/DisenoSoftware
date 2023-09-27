public class Person {
    private String name;
    private String address;    

public Person(String name , String address){
    this.name = name;
    this.address = address;
}

public String getName(){
    return name;
}

public String getAddress(){
    return address;
}

public void setAddres(){
    this.address = address;
}

@Override

public String toString(){
    return "El nombre de la persona es : " + name + "y el email es : " + address;
}


}
