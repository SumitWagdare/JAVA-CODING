import java.util.InputMismatchException;
import java.util.Scanner;

public class Cal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char choice;

        System.out.println("---- Simple Calculator using switch case ----");

        do {
            try {
                System.out.print("Enter first number: ");
                double num1 = sc.nextDouble();

                System.out.print("Enter an operator (+, -, *, /): ");
                char operator = sc.next().charAt(0);

                System.out.print("Enter second number: ");
                double num2 = sc.nextDouble();

                double result;

                switch (operator) {
                    case '+':
                        result = num1 + num2;
                        System.out.println("Result = " + result);
                        break;
                    case '-':
                        result = num1 - num2;
                        System.out.println("Result = " + result);
                        break;
                    case '*':
                        result = num1 * num2;
                        System.out.println("Result = " + result);
                        break;
                    case '/':
                        if (num2 != 0) {
                            result = num1 / num2;
                            System.out.println("Result = " + result);
                        } else {
                            System.out.println("Error: Division by zero not allowed.");
                        }
                        break;
                    default:
                        System.out.println("Invalid operator! Please use +, -, *, /");
                }

            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter numbers only.");
                sc.next(); // clear wrong input
            }

            System.out.print("\nDo you want to calculate again? (y/n): ");
            choice = sc.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');

        System.out.println("Thank you for using Calculator!");
        sc.close();
    }
}
