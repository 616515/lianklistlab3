public class Q5 {
    public static void printPattern(int n) {
        int mid = n / 2;
        for (int i = 0; i < n; i++) {
            int distance = Math.abs(i - mid);
            int stars = 1 + 2 * (mid - distance);
            System.out.println("+".repeat(stars));
        }
    }

    public static void main(String[] args) {
        // Test case 1: n = 3
        System.out.println("n = 3:");
        printPattern(3);

        // Test case 2: n = 5
        System.out.println("\nn = 5:");
        printPattern(5);
    }
}