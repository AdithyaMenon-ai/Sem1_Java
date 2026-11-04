import java.util.*;

class TreeSetDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TreeSet<Integer> set = new TreeSet<>();

        for (int i = 0; i < 5; i++) {
            set.add(sc.nextInt());
        }

        System.out.println("TreeSet: " + set);
    }
}
