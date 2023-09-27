public class Dog extends Mammal {
    public Dog(String name){
        super(name);
    }
    public void greets(){
        System.out.println("Woff");
    }
    public void greets(Dog another){
    System.out.println("Woff");
    }
    @Override
    public String toString(){
        return "Dog = " + super.toString();
    }
}
