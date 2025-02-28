import java.util.LinkedList;

public class g_linkedlist_collection_framework {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();

        ll.addFirst(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);

        System.out.println(ll);

        ll.removeLast();

        System.out.println(ll);

    }
}
