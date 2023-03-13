package academy.com;

public class Calculator {

    public static int calculate(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        if((a == 0) && (b == 0)) {
            throw new IllegalArgumentException("Cannot divide with 0");
        }
        return a / b;
    }

    public static int reminder(int a, int b) {
        return a % b;

    }

}
