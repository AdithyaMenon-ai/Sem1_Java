import java.util.*;

class HashingDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            String s = sc.nextLine();

            System.out.println("HashCode of " + s + ": " + s.hashCode());
        }
    }
}
