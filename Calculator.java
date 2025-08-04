import java.util.Scanner;

public class Calculator {

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Cannot divide by zero!");
            return 0;
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char choice = sc.next().charAt(0);
        do {
            System.out.println("Choose operation: + - * /");
            char op = sc.next().charAt(0);

            System.out.print("Enter first number: ");
            double num1 = sc.nextDouble();

            System.out.print("Enter second number: ");
            double num2 = sc.nextDouble();

            double result = 0;
            switch (op) {
                case '+': result = add(num1, num2); break;
                case '-': result = subtract(num1, num2); break;
                case '*': result = multiply(num1, num2); break;
                case '/': result = divide(num1, num2); break;
                default: System.out.println("Invalid operation."); continue;
            }

            System.out.println("Result: " + result);

            System.out.print("Do you want to continue? (y/n): ");
            
        } while (choice == 'y' || choice == 'Y');

        sc.close();
        System.out.println("Calculator exited.");
    }
}
