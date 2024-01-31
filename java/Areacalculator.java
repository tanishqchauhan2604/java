import java.util.Scanner;

public class AreaCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Choose a shape to calculate area:");
            System.out.println("1. Circle");
            System.out.println("2. Triangle");
            System.out.println("3. Square");
int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Calculate and display area of a circle
                    System.out.print("Enter the radius of the circle: ");
                    double radius = scanner.nextDouble();
                    System.out.println("Area of the circle: " + calculateAreaCircle(radius));
                    break;

                case 2:
                    // Calculate and display area of a triangle
                    System.out.print("Enter the base of the triangle: ");
                    double base = scanner.nextDouble();
                    System.out.print("Enter the height of the triangle: ");
                    double height = scanner.nextDouble();
                    System.out.println("Area of the triangle: " + calculateAreaTriangle(base, height));
                    break;

                case 3:
                    // Calculate and display area of a square
                    System.out.print("Enter the side length of the square: ");
                    double sideLength = scanner.nextDouble();
                    System.out.println("Area of the square: " + calculateAreaSquare(sideLength));
                    break;

                default:
                    System.out.println("Invalid choice. Please choose 1, 2, or 3.");
            }

        } catch (Exception e) {
            System.out.println("Invalid input. Please enter valid numeric values.");
        } finally {
            scanner.close();
        }
    }
// Method to calculate the area of a circle
    public static double calculateAreaCircle(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    // Method to calculate the area of a triangle
    public static double calculateAreaTriangle(double base, double height) {
        return 0.5 * base * height;
    }

    // Method to calculate the area of a square
    public static double calculateAreaSquare(double sideLength) {
          return Math.pow(sideLength,2);}
}