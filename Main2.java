public class Main2 {
    public static void Main2(String[]args){
        Person person = new Person("Camilo" , "Carrera 24");

        Student student = new Student("cam", "Carre 24", "ing", 2, 250.000);

        personal personal = new personal("Carlos", "789 Oak St", "Escuela Secundaria", 3500.0);

        // Mostrar información de las personas
        System.out.println("Información de la persona:");
        System.out.println(person);

        System.out.println("\nInformación del estudiante:");
        System.out.println(student);

        System.out.println("\nInformación del personal:");
        System.out.println(personal);
    }
}
