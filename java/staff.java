import java.util.Scanner;

// Interface for Employee
interface Employee {
    double earnings(double basicSalary);
    double deductions(double basicSalary);
    double bonus(double basicSalary);
}

// Manager class using the Employee interface
class Manager implements Employee {
    @Override
    public double earnings(double basicSalary) {
        // Calculate earnings including basic, DA (80% of basic), and HRA (15% of basic)
        return basicSalary + (0.8 * basicSalary) + (0.15 * basicSalary);
    }

    @Override
    public double deductions(double basicSalary) {
        // Calculate PF deduction (12% of basic)
        return 0.12 * basicSalary;
    }

    // This method is not implemented in Manager class as it's not required
    @Override
    public double bonus(double basicSalary) {
        return 0; // Since Manager class doesn't have bonus, returning 0
    }
}

// Substaff class extending Manager class and implementing bonus method
class Substaff extends Manager {
    @Override
    public double bonus(double basicSalary) {
        // Calculate bonus (50% of basic)
        return 0.5 * basicSalary;
    }
}

// Main class
public class Staff {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the basic salary:");
        double basicSalary = scanner.nextDouble();

        Substaff substaff = new Substaff();

        // Calculate and print earnings
        double earnings = substaff.earnings(basicSalary);
        System.out.println("Earnings: " + earnings);

        // Calculate and print deductions
        double deductions = substaff.deductions(basicSalary);
        System.out.println("Deductions: " + deductions);

        // Calculate and print bonus
        double bonus = substaff.bonus(basicSalary);
        System.out.println("Bonus: " + bonus);
    }
}
