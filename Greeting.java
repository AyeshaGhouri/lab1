import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueGreeting = true;

        while (continueGreeting) {
            // Prompt for user input
            System.out.print("Enter your name: ");
            String name = scanner.nextLine();

            // Display a greeting
            System.out.println("Hello, " + name + "! Welcome!");

            // Ask if the user wants to greet again
            System.out.print("Would you like to greet someone else? (yes/no): ");
            String response = scanner.nextLine();

            // Check the response
            if (response.equalsIgnoreCase("no")) {
                continueGreeting = false;
            }
        }

        // Close the scanner
        scanner.close();
        System.out.println("Goodbye!");
    }
}
