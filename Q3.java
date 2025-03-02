import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // Number of students
        sc.nextLine(); // Consume newline
        
        TreeMap<Integer, String> studentMap = new TreeMap<>(Collections.reverseOrder());
        
        for (int i = 0; i < n; i++) {
            int marks = sc.nextInt();
            sc.nextLine(); // Consume newline
            String name = sc.nextLine();
            studentMap.put(marks, name);
        }
        sc.close();
        
        System.out.println("The ranks based on their marks:");
        int rank = 1;
        for (Map.Entry<Integer, String> entry : studentMap.entrySet()) {
            System.out.println("Rank " + rank + ": " + entry.getValue());
            rank++;
        }
    }
}
