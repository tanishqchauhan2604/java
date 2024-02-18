import java.util.Scanner;

interface Employee {
    void getDetails();
}

interface Manager extends Employee {
    void getDeptDetails();
}

// Class Head implementing Manager interface
class Head implements Manager {
    int empId;
    String empName;
    int deptId;
    String deptName;

    public void getDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter employee id:");
        empId = scanner.nextInt();
        scanner.nextLine(); 
        System.out.println("Enter employee name:");
        empName = scanner.nextLine();
    }

    public void getDeptDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter department id:");
        deptId = scanner.nextInt();
        scanner.nextLine(); 
        System.out.println("Enter department name:");
        deptName = scanner.nextLine();
    }

    public void displayDetails() {
        System.out.println("Employee id: " + empId);
        System.out.println("Employee name: " + empName);
        System.out.println("Department id: " + deptId);
        System.out.println("Department name: " + deptName);
    }
}


public class Main {
    public static void main(String[] args) {
        Head head = new Head();
        head.getDetails();
        head.getDeptDetails();
        System.out.println("Output:");
        head.displayDetails();
    }
}
