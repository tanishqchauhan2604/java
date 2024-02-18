import java.util.Scanner;

// Abstract class Student
abstract class Student {
    int rollNo;
    long regNo;

    // Method to get input from user
    void getInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Roll No:");
        rollNo = scanner.nextInt();
        System.out.println("Enter Registration No:");
        regNo = scanner.nextLong();
    }

    // Abstract method course
    abstract void course();
}

// Subclass Kiitian extending Student
class Kiitian extends Student {
    // Implementation of abstract method course
    @Override
    void course() {
        System.out.println("Course: B.Tech. (Computer Science & Engg)");
    }
}

// Driver class
public class kiit {
    public static void main(String[] args) {
        Kiitian kiitian = new Kiitian();
        kiitian.getInput();
        System.out.println("Roll No: " + kiitian.rollNo);
        System.out.println("Registration No: " + kiitian.regNo);
        kiitian.course();
    }
}
