import java.util.Scanner;
public class Logical_Operators {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = s.nextInt();
        System.out.print("Are you a citizen? (true/false): ");
        boolean isCitizen = s.nextBoolean();
        if (age >= 18 && isCitizen) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote.");
        }

    }
}
