import java.util.*;

class QueueDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> q = new LinkedList<>();

        for (int i = 0; i < 5; i++) {
            q.add(sc.nextInt());
        }

        System.out.println("Queue after enqueue: " + q);

        q.remove();

        System.out.println("After dequeue: " + q);
    }
}
