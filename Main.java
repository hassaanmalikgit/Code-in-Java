import java.util.Scanner;

public class FizzBuzzGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();  // Get user input

        for (int i = 1; i <= n; i++) {
            // Print Fizz, Buzz, or FizzBuzz based on the conditions
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }

        scanner.close();  // Close the scanner
    }
}
