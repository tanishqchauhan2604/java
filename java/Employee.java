public class Employee {

    // Static variable for common data
    private static String companyName = "KIIT University";

    // Instance variables for individual employee data
    private String name;
    private int id;

    // Constructor to initialize instance variables
    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Static method to display common data
    public static void displayCommonData() {
        System.out.println("Company Name: " + companyName);
    }

    // Instance method to display individual employee data
    public void displayEmployeeData() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
    }

    public static void main(String[] args) {
        Employee emp1 = new Employee("abc", 220);
        Employee emp2 = new Employee("def", 341);

        // Display common data (accessible without creating objects)
        Employee.displayCommonData();

        // Display individual employee data
        emp1.displayEmployeeData();
        emp2.displayEmployeeData();
    }
}