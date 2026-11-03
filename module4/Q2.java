import java.util.*;

class VectorDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vector<Integer> v = new Vector<>();

        for (int i = 0; i < 5; i++) {
            v.add(sc.nextInt());
        }

        System.out.print("Enter remove index: ");
        int index = sc.nextInt();

        v.remove(index);

        System.out.println("Updated Vector: " + v);
    }
}
