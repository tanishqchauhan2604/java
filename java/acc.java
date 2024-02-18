import java.util.Scanner;

class Account {
    int acc_no;
    double balance;

    void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter account number:");
        acc_no = scanner.nextInt();
        System.out.println("Enter balance:");
        balance = scanner.nextDouble();
    }

    void disp() {
        System.out.println("Account Number: " + acc_no);
        System.out.println("Balance: " + balance);
    }
}

class Person extends Account {
    String name;
    long aadhar_no;

    @Override
    void disp() {
        super.disp();
        System.out.println("Name: " + name);
        System.out.println("Aadhar Number: " + aadhar_no);
    }
}

public class acc {
    public static void main(String[] args) {
        Person[] people = new Person[3];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter details for Person " + (i + 1) + ":");
            Person person = new Person();

            System.out.println("Enter name:");
            person.name = scanner.next();

            System.out.println("Enter Aadhar number:");
            person.aadhar_no = scanner.nextLong();

            person.input(); // Input account details

            people[i] = person;
        }

        System.out.println("\nDetails of all Persons:");

        for (Person person : people) {
            person.disp(); // Display person details
            System.out.println();
        }
    }
}
