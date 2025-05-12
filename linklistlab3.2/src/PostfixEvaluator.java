import java.util.Stack;
import java.util.Scanner;

public class PostfixEvaluator {
    public static int evaluatePostfix(String expression) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);

            if (c == ' ') {
                continue; // skip spaces
            }

            // If the character is a digit, push it to the stack
            if (Character.isDigit(c)) {
                // Handle multi-digit numbers
                int num = 0;
                while (i < expression.length() && Character.isDigit(expression.charAt(i))) {
                    num = num * 10 + (expression.charAt(i) - '0');
                    i++;
                }
                i--; // adjust index after number parsing
                stack.push(num);
            }
            // If the character is an operator
            else {
                int val1 = stack.pop();
                int val2 = stack.pop();

                switch (c) {
                    case '+':
                        stack.push(val2 + val1);
                        break;
                    case '-':
                        stack.push(val2 - val1);
                        break;
                    case '*':
                        stack.push(val2 * val1);
                        break;
                    case '/':
                        stack.push(val2 / val1);
                        break;
                    case '%':
                        stack.push(val2 % val1);
                        break;
                }
            }
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Postfix Expression Evaluator");
        System.out.println("Enter postfix expressions to evaluate (e.g., '42+3151-*+')");
        System.out.println("Enter 'quit' to exit");

        while (true) {
            System.out.print("\nEnter postfix expression: ");
            String input = scanner.nextLine().trim();

            if (input.equalsIgnoreCase("quit")) {
                break;
            }

            try {
                int result = evaluatePostfix(input);
                System.out.println("Result: " + result);
            } catch (Exception e) {
                System.out.println("Invalid expression. Please try again.");
            }
        }

        System.out.println("\nTest Cases:");
        System.out.println("1. '42+3151-*+' (Expected: 48)");
        System.out.println("   Result: " + evaluatePostfix("42+3151-*+"));

        System.out.println("2. '12+3%6-23+/' (Expected: -1)");
        System.out.println("   Result: " + evaluatePostfix("12+3%6-23+/"));

        System.out.println("3. '23*4+' (Expected: 10)");
        System.out.println("   Result: " + evaluatePostfix("23*4+"));

        System.out.println("4. '52*3+' (Expected: 13)");
        System.out.println("   Result: " + evaluatePostfix("52*3+"));

        System.out.println("5. '62/3-4*' (Expected: 0)");
        System.out.println("   Result: " + evaluatePostfix("62/3-4*"));

        scanner.close();
    }
}