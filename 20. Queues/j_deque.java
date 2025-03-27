import java.util.Deque;
import java.util.LinkedList;

public class j_deque {
    // double eneded queue

    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();
        deque.addFirst(1);
        deque.addFirst(2);
        deque.addFirst(3);
        deque.addLast(4);

        System.out.println(deque);
    }
}
