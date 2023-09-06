import java.util.Scanner;

public class ScientificCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double result = 0.0;

        while (true) {
            System.out.println("Scientific Calculator Menu:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Square Root");
            System.out.println("6. Exponentiation");
            System.out.println("7. Exit");
            System.out.print("Enter your choice (1-7): ");

            int choice = scanner.nextInt();

            if (choice == 7) {
                System.out.println("Exiting the calculator.");
                break;
            }

            switch (choice) {
                case 1:
                    result = add(scanner);
                    break;
                case 2:
                    result = subtract(scanner);
                    break;
                case 3:
                    result = multiply(scanner);
                    break;
                case 4:
                    result = divide(scanner);
                    break;
                case 5:
                    result = squareRoot(scanner);
                    break;
                case 6:
                    result = exponentiation(scanner);
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
                    break;
            }

            System.out.println("Result: " + result);
        }

        scanner.close();
    }

    // Method to perform addition
    private static double add(Scanner scanner) {
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        return num1 + num2;
    }

    // Method to perform subtraction
    private static double subtract(Scanner scanner) {
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        return num1 - num2;
    }

    // Method to perform multiplication
    private static double multiply(Scanner scanner) {
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        return num1 * num2;
    }

    // Method to perform division
    private static double divide(Scanner scanner) {
        System.out.print("Enter the numerator: ");
        double numerator = scanner.nextDouble();
        System.out.print("Enter the denominator: ");
        double denominator = scanner.nextDouble();
        
        if (denominator == 0) {
            System.out.println("Error: Division by zero!");
            return Double.NaN; // Not-a-Number
        }

        return numerator / denominator;
    }

    // Method to calculate square root
    private static double squareRoot(Scanner scanner) {
        System.out.print("Enter a number: ");
        double num = scanner.nextDouble();
        if (num < 0) {
            System.out.println("Error: Cannot calculate square root of a negative number!");
            return Double.NaN; // Not-a-Number
        }
        return Math.sqrt(num);
    }

    // Method to calculate exponentiation
    private static double exponentiation(Scanner scanner) {
        System.out.print("Enter the base: ");
        double base = scanner.nextDouble();
        System.out.print("Enter the exponent: ");
        double exponent = scanner.nextDouble();
        return Math.pow(base, exponent);
    }
}
