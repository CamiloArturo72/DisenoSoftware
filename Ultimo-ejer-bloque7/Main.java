public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona("Juan", "Lozano", "12345", "Soltero");
        Empleado empleado = new Empleado("Camilo", "Arturo", "67890", "Soltero", 2010, "Despacho 101");
        Estudiante estudiante = new Estudiante("Elmo", "Mazo", "54321", "Soltero", "Informática");
        Profesor profesor = new Profesor("Elmar", "Tillazo", "98765", "Casado", "Matemáticas");
        PersonalServicio servicio = new PersonalServicio("Laura", "Martinez", "45678", "Divorciado", "Biblioteca");

        persona.imprimir();
        empleado.reasignacionDespacho("Despacho 102");
        empleado.imprimir();
        estudiante.matricularNuevoCurso("Física");
        estudiante.imprimir();
        profesor.cambiarDepartamento("Química");
        profesor.imprimir();
        servicio.transladarSeccion("Decanato");
        servicio.imprimir();
    }
}





