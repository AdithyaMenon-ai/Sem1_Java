import java.util.*;

class HashSetDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < 5; i++) {
            set.add(sc.nextInt());
        }

        System.out.println("HashSet: " + set);
    }
}
