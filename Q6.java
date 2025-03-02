import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        String[] inputArray = new String[n];

        for (int i = 0; i < n; i++) {
            inputArray[i] = scanner.next();
        }

        List<String> colors = Arrays.asList(inputArray);

        colors.sort(String::compareToIgnoreCase);

        System.out.println("Sorted strings:");
        for (String str : colors) {
            System.out.print(str + ' ');
        }

        scanner.close();
    }
}
