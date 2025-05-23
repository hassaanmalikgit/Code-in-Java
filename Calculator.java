public class Calculator {

    // Addition Overloads
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    // Subtraction Overloads
    public int subtract(int a, int b) {
        return a - b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    // Multiplication Overloads
    public int multiply(int a, int b) {
        return a * b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    // Division Overloads
    public int divide(int a, int b) {
        if (b == 0) {
            System.out.println("Error: Division by zero!");
            return 0;
        }
        return a / b;
    }

    public double divide(double a, double b) {
        if (b == 0.0) {
            System.out.println("Error: Division by zero!");
            return 0.0;
        }
        return a / b;
    }

    // Main method
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        // Integer operations
        int a = 20, b = 5;
        System.out.println("Integer Addition: " + calc.add(a, b));
        System.out.println("Integer Subtraction: " + calc.subtract(a, b));
        System.out.println("Integer Multiplication: " + calc.multiply(a, b));
        System.out.println("Integer Division: " + calc.divide(a, b));

        // Space between int and double outputs
        System.out.println();

        // Double operations
        double x = 12.5, y = 4.2;
        System.out.println("Double Addition: " + calc.add(x, y));
        System.out.println("Double Subtraction: " + calc.subtract(x, y));
        System.out.println("Double Multiplication: " + calc.multiply(x, y));
        System.out.println("Double Division: " + calc.divide(x, y));
    }
}
