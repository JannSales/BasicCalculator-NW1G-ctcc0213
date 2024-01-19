package basiccalculator;
import java.util.Scanner;

public class BasicCalculator {


    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        // Get input from the user
        System.out.print("Enter the first number: ");
        double firstNumber = userInput.nextDouble();

        System.out.print("Enter the second number: ");
        double secondNumber = userInput.nextDouble();

        // Perform operations
        System.out.println("Select operation:");
        System.out.println("1. +");
        System.out.println("2. -");
        System.out.println("3. x");
        System.out.println("4. ÷");

        System.out.print("Enter choice (1, 2, 3, or 4): ");
        int operationChoice = userInput.nextInt();

        double result = 0;

        switch (operationChoice) {
            case 1:
                result = firstNumber + secondNumber;
                break;
            case 2:
                result = firstNumber - secondNumber;
                break;
            case 3:
                result = firstNumber * secondNumber;
                break;
            case 4:
                if (secondNumber != 0) {
                    result = firstNumber / secondNumber;
                } else {
                    System.out.println("Error: Cannot divide by zero.");
                    return;
                }
                break;
            default:
                System.out.println("Invalid choice");
                return;
        }

        // Display the result
        System.out.println("Result: " + result);
    }
    
}

