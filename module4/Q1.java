import java.util.*;

class ArrayListDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            list.add(sc.nextLine());
        }

        System.out.println("ArrayList: " + list);
    }
}
