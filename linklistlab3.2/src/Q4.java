import java.util.*;

public class Q4 {
    public static void main(String[] args) {
        LinkedList<String> students = new LinkedList<>(Arrays.asList(
                "James", "Luca", "Tang", "John", "Jane", "May", "Bee", "Jazz"));

        System.out.println("Initial list: " + students);

        students.remove("Luca");
        System.out.println("After removing Luca: " + students);

        students.remove("May");
        System.out.println("After removing May: " + students);

        students.remove("James");
        System.out.println("After removing James: " + students);
    }
}