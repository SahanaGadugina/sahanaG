

import java.util.Locale;

public class Problem1 {

    private final double a;
    private final double b;
    private final String operation;

    public Problem1(double a, double b, String operation) {
        this.a = a;
        this.b = b;
        this.operation = operation.toLowerCase(Locale.ROOT).trim();
    }

    public double calculate() {
        switch (operation) {
            case "add":
            case "+":
                return a + b;

            case "subtract":
            case "-":
                return a - b;

            case "multiply":
            case "*":
                return a * b;

            case "divide":
            case "/":
                if (b == 0) {
                    throw new ArithmeticException("Cannot divide by zero");
                }
                return a / b;

            default:
                throw new IllegalArgumentException("Unsupported operation: " + operation);
        }
    }

    public static void main(String[] args) {
        // Sample runs
        Problem1 c1 = new Problem1(10.5, 3.5, "add");
        System.out.println("Addition: " + c1.calculate());       // 14.0

        Problem1 c2 = new Problem1(8, 2, "divide");
        System.out.println("Division: " + c2.calculate());       // 4.0

        Problem1 c3 = new Problem1(7, 4, "*");
        System.out.println("Multiplication: " + c3.calculate()); // 28.0
    }
}
