import java.util.Scanner;

// Calculator class to perform operations
class Calculator {
    private double a;
    private double b;

    public Calculator(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double add() { return a + b; }
    public double subtract() { return a - b; }
    public double multiply() { return a * b; }
    public double divide() {
        if (b != 0) return a / b;
        else {
            System.out.println("Error: Division by zero!");
            return 0;
        }
    }
}

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter first number (a): ");
        double a = sc.nextDouble();

        System.out.print("Enter second number (b): ");
        double b = sc.nextDouble();

        sc.nextLine(); // consume newline
        System.out.print("Enter operation (add, subtract, multiply, divide): ");
        String operation = sc.nextLine().toLowerCase();

        // Create Calculator object
        Calculator calc = new Calculator(a, b);
        double result = 0;

        // Perform operation
        switch(operation) {
            case "add": result = calc.add(); break;
            case "subtract": result = calc.subtract(); break;
            case "multiply": result = calc.multiply(); break;
            case "divide": result = calc.divide(); break;
            default:
                System.out.println("Invalid operation!");
                sc.close();
                return;
        }

        // Output
        System.out.println("Result: " + result);
        sc.close();
    }
}
