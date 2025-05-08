import java.util.Scanner;

class Division {
    private int Num1;
    private int Num2;

    public int getNum1() {
        return Num1;
    }

    public void setNum1(int num1) {
        this.Num1 = num1;
    }

    public int getNum2() {
        return Num2;
    }

    public void setNum2(int num2) {
        this.Num2 = num2;
    }

    public void performDivision() {
        try {
            double result = (double) Num1 / Num2;
            System.out.println("Result of division: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        }
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Division division = new Division();

        while (true) {
            System.out.print("Enter first number (Num1): ");
            division.setNum1(sc.nextInt());

            System.out.print("Enter second number (Num2): ");
            division.setNum2(sc.nextInt());

            if (division.getNum2() == 0) {
                System.out.println("Num2 is 0. Exiting the program.");
                break;
            }

            division.performDivision();
        }

        sc.close();
    }
}
