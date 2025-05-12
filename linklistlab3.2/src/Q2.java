import java.util.*;

public class Q2 {
    public static String processMessage(String input) {
        Queue<Character> queue = new LinkedList<>();
        String[] tokens = input.split(" ");

        for (String token : tokens) {
            if (token.equals("*")) {
                if (!queue.isEmpty()) queue.poll();
            } else {
                queue.add(token.charAt(0));
            }
        }

        StringBuilder result = new StringBuilder();
        for (Character c : queue) result.append(c);
        return result.toString();
    }
}