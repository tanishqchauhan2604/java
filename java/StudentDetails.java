import java.util.Scanner;

class Student {
    int rollNumber;
    String name;
    double cgpa;
}

public class StudentDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();

        Student[] students = new Student[n];

        // Input details for each student
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for student " + (i + 1) + ":");
            students[i] = new Student();

            System.out.print("Roll Number: ");
            students[i].rollNumber = scanner.nextInt();

            System.out.print("Name: ");
            students[i].name = scanner.next();

            System.out.print("CGPA: ");
            students[i].cgpa = scanner.nextDouble();
        }

        // Display details of all students
        System.out.println("\nDetails of all students:");
        for (Student student : students) {
            System.out.println("Roll Number: " + student.rollNumber);
            System.out.println("Name: " + student.name);
            System.out.println("CGPA: " + student.cgpa);
            System.out.println();
        }

        double lowestCGPA = Double.MAX_VALUE;
        String lowestCGPAStudentName = "";

        for (Student student : students) {
            if (student.cgpa < lowestCGPA) {
                lowestCGPA = student.cgpa;
                lowestCGPAStudentName = student.name;
            }
        }

        System.out.println("Student with the lowest CGPA: " + lowestCGPAStudentName);
    }
}
