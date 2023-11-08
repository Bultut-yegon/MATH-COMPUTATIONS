import java.util.Scanner;

public class SubtractionExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        // Prompt the user to enter the second number
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Perform subtraction
        int result = num1 - num2;

        // Display the result
        System.out.println("Result of subtraction: " + result);

        // Close the scanner
        scanner.close();
    }
}
