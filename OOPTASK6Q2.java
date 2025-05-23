import java.util.Scanner;

public class OOPTASK6Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        System.out.print("Enter the word to remove: ");
        String remove = scanner.nextLine();

        String result = removeWord(str, remove);

        System.out.println("String after removing the word: " + result);

        scanner.close();
    }
    public static String removeWord(String str, String remove) {
        return str.replace(remove, "").trim();
    }
}
