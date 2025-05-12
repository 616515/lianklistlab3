import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // ===== Question 1: Reverse Integers Using Stack =====
        System.out.println("\n--- Question 1 ---");
        System.out.print("Enter numbers (e.g., 1 2 3 4): ");
        String input1 = sc.nextLine();
        Stack<Integer> stack = new Stack<>();
        for (String num : input1.split(" ")) {
            stack.push(Integer.parseInt(num));
        }
        System.out.print("Reversed: ");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }

        // ===== Question 2: Queue with Asterisks =====
        System.out.println("\n\n--- Question 2 ---");
        System.out.print("Enter message (e.g., E A S * Y *): ");
        String input2 = sc.nextLine();
        Queue<Character> queue = new LinkedList<>();
        for (String token : input2.split(" ")) {
            if (token.equals("*")) {
                if (!queue.isEmpty()) queue.poll();
            } else {
                queue.add(token.charAt(0));
            }
        }
        System.out.print("Remaining letters: ");
        if (queue.isEmpty()) System.out.print("Nothing");
        else for (Character c : queue) System.out.print(c);

        // ===== Question 3: Binary Representation =====
        System.out.println("\n\n--- Question 3 ---");
        System.out.print("Enter a positive integer (e.g., 5): ");
        int n = sc.nextInt();
        Stack<Integer> binaryStack = new Stack<>();
        int temp = n;
        while (temp > 0) {
            binaryStack.push(temp % 2);
            temp /= 2;
        }
        System.out.print(n + " in binary: ");
        while (!binaryStack.isEmpty()) System.out.print(binaryStack.pop());

        // ===== Question 4: Linked List for Students =====
        System.out.println("\n\n--- Question 4 ---");
        LinkedList<String> students = new LinkedList<>(Arrays.asList(
                "James", "Luca", "Tang", "John", "Jane", "May", "Bee", "Jazz"));
        System.out.println("Initial list: " + students);
        students.remove("Luca");
        System.out.println("After removing Luca: " + students);
        students.remove("May");
        System.out.println("After removing May: " + students);
        students.remove("James");
        System.out.println("After removing James: " + students);

        // ===== Question 5: Pattern with Odd Integer =====
        System.out.println("\n--- Question 5 ---");
        System.out.print("Enter an odd integer (e.g., 3 or 5): ");
        int size = sc.nextInt();
        int mid = size / 2;
        for (int i = 0; i < size; i++) {
            int distance = Math.abs(i - mid);
            int stars = 1 + 2 * (mid - distance);
            System.out.println("+".repeat(stars));
        }
    }
}

