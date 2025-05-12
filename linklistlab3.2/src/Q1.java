import java.util.*;

public class Q1 {
    public static void main(String[] args) {
        // Test case: Input "1 2 3 4" → Output "4 3 2 1"
        String input = "1 2 3 4";
        Stack<Integer> stack = new Stack<>();

        for (String num : input.split(" ")) {
            stack.push(Integer.parseInt(num));
        }

        System.out.print("Reversed: ");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}