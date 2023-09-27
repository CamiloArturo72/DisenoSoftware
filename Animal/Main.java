public class Main {
    public static void main(String[]args){
            Animal animal = new Animal("Algun animal");
            Mammal mammal = new Mammal("Animal random");
            Cat cat = new Cat("Misho");
            Dog dog = new Dog("Jefazo");


            System.out.println(animal);
            System.out.println(mammal);
            System.out.println(cat);
            System.out.println(dog);


            cat.greets();
            dog.greets();
            dog.greets();


    }
}
