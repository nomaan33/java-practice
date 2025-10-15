import java.util.Scanner; // Import Scanner class

public class Calculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // Create Scanner object

        // Take first number
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        // Take second number
        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

        // Take operator input
        System.out.print("Enter operator (+, -, *, /): ");
        char operator = sc.next().charAt(0);

        double result;

        // Perform calculation based on operator
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;

            case '-':
                result = num1 - num2;
                break;

            case '*':
                result = num1 * num2;
                break;

            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero!");
                    return; // Exit program
                }
                break;

            default:
                System.out.println("Invalid operator!");
                return; // Exit program
        }

        System.out.println("Result: " + result);
    }
}
