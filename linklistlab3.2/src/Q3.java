import java.util.*;

public class Q3 {
    public static void main(String[] args) {
        // Test cases: 3 → 11, 5 → 101, 6 → 110
        int[] testCases = {3, 5, 6};

        for (int n : testCases) {
            Stack<Integer> stack = new Stack<>();
            int temp = n;
            while (temp > 0) {
                stack.push(temp % 2);
                temp /= 2;
            }
            System.out.print(n + " in binary: ");
            while (!stack.isEmpty()) System.out.print(stack.pop());
            System.out.println();
        }
    }
}