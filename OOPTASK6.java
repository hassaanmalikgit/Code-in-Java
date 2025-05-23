import java.util.Scanner;

public class OOPTASK6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();
int length = userInput.length();
        System.out.println("The length of the entered string is: " +length);
        scanner.close();
    }
}

