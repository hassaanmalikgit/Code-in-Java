import java.util.Scanner;

public class EmployeeEmails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuffer employeeData = new StringBuffer();

        for (int i = 1; i <= 3; i++) {
            System.out.print("Enter employee name: ");
            String name = scanner.nextLine();

            System.out.print("Enter employee email: ");
            String email = scanner.nextLine();
            employeeData.append(name).append(" - ").append(email).append("\n");
        }

        scanner.close();

        System.out.println("\nEmployee Data:");
        System.out.println(employeeData);
    }
}
