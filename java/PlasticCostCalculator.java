import java.util.Scanner;

public class PlasticCostCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input for dimensions
        System.out.print("Enter the length in feet: ");
        double length = scanner.nextDouble();

        System.out.print("Enter the width in feet: ");
        double width = scanner.nextDouble();

        System.out.print("Enter the height in feet: ");
        double height = scanner.nextDouble();

        // Calculate the area for 2D sheet and volume for 3D box
        double area = length * width;
        double volume = length * width * height;

        // Calculate the cost for 2D sheet and 3D box
        double cost2D = area * 40;  
        double cost3D = volume * 60;  

        // Display the cost based on dimensions
        System.out.println("Cost of 2D Sheet: Rs" + cost2D);
        System.out.println("Cost of 3D Box: Rs" + cost3D);
        scanner.close();
    }
}
