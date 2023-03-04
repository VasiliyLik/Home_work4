import java.util.InputMismatchException;
import java.util.Scanner;

// класс описывает Логику программы
public class Logic {
    public static void islogic() {
        double first;
        double second;
        double result;
        String operation;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Simple calculator");
        System.out.println("Input the first number and press Enter");
        try {
            first = scanner.nextInt();
            System.out.println("Input an operation: +, -, *, /, %, ** (exponentiation) and press Enter");
            operation = scanner.next();
            System.out.println("Input the second number and press Enter");
            second = scanner.nextInt();
            Action action;
            switch (operation) {
                case "+" -> {
                    action = new Addition();
                    result = action.doAction(first, second);
                    System.out.println("Result: " + first + operation + second + " = " + result);
                }
                case "-" -> {
                    action = new Subtraction();
                    result = action.doAction(first, second);
                    System.out.println("Result: " + first + operation + second + " = " + result);
                }
                case "*" -> {
                    action = new Multiplication();
                    result = action.doAction(first, second);
                    System.out.println("Result: " + first + operation + second + " = " + result);
                }
                case "/" -> {
                    action = new Division();
                    result = action.doAction(first, second);
                    if (second == 0)
                        throw new ArithmeticException();
                    System.out.println("Result: " + first + operation + second + " = " + result);
                }
                case "%" -> {
                    action = new Percentage();
                    result = action.doAction(first, second);
                    if (second > 100)
                        throw new MaximumCalculatedPercentage("Number" + second + " exceeds the set value = 100!");
                    System.out.println("Result: " + second + operation + " from " + first + " = " + result);
                }
                case "**" -> {
                    action = new Exponentiation();
                    result = action.doAction(first, second);
                    System.out.println("Result = " + first + " to exponentiation " + second + " = " + result);
                }
                default -> System.out.println("Input incorrect action!");
            }
        } catch (InputMismatchException e) {
            System.out.println("Incorrect data type!");
        } catch (ArithmeticException e2) {
            System.out.println("division by ZERO!!!");
        } catch (MaximumCalculatedPercentage e3) {
            System.out.println(e3);
        }
    }
}

