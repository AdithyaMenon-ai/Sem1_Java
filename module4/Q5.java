import java.util.*;

class HashMapDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < 3; i++) {
            String name = sc.next();
            int marks = sc.nextInt();
            map.put(name, marks);
        }

        System.out.print("Enter student name: ");
        String name = sc.next();

        System.out.println("Marks for " + name + ": " + map.get(name));
    }
}
