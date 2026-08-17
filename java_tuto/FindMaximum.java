import java.util.Scanner;

public class FindMaximum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[10];

        // Read 10 integers
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        // Find maximum
        int max = numbers[0];

        for (int i = 1; i < 10; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println("Maximum value = " + max);

        sc.close();
    }
}