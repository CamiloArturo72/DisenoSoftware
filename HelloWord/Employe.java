public class Employe {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    public Employe(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getSalary() {
        return salary;
    }

    public void raiseSalary(int percent) {
        salary += salary * percent / 100;
    }

    public int getAnnualSalary() {
        return salary * 12;
    }


    public String toString() {
        return "Employee[id=" + id + ", name=" + firstName + " " + lastName + ", salary=" + salary + "]";
    }

    public static void main(String[] args) {
        Employe employee = new Employe(12, "Inureas", "thr salr", 1000);
        int percent = 10;

        System.out.println("Original Salary: " + employee.getSalary());
        employee.raiseSalary(percent);
        System.out.println("New Salary after " + percent + "% raise: " + employee.getSalary());
        System.out.println("Annual Salary: " + employee.getAnnualSalary());
    }
}
