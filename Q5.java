import java.util.Scanner;

interface SquareFunction {
    int square(int x);
}

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = scanner.nextInt();

        int[] numbers = new int[count];
        for (int i = 0; i < count; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Define a lambda expression for squaring
        SquareFunction squareFunction = x -> x * x;

        // Calculate the square of each element using a loop and lambda expression
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < numbers.length; i++) {
            int square = squareFunction.square(numbers[i]);
            result.append(square).append(" ");
        }

        System.out.println(result.toString().trim());

        scanner.close();
    }
}
