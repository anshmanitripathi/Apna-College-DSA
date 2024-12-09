public class d_isPalindrome {
    public static class LinkedList {
        public static class Node{
            int data;
            Node next;
    
            public Node(int data){
                this.data = data;
                this.next = null;
            }
        }

        public static Node head;
        public static Node tail;
        public static int size;


        public void addFirst(int data){
            // Step 1 : Create a new Node
            Node newNode = new Node(data);
            size++;

            // if it is the first node
            if(head == null){
                head = tail = newNode;
                return;
            }

            //Step 2 : newNode next = head
            newNode.next = head;

            //Step 3 : head = newNode
            head = newNode;
        }

        public void addLast(int data){
            // Step 1 : Create a new Node
            Node newNode = new Node(data);
            size++;

            // if it is the first node
            if(head == null){
                head = tail = newNode;
                return;
            }

            //Step 2 : tail next = newNode
            tail.next = newNode;

            //Step 3 : tail = newNode
            tail = newNode;
        }

        public void print(){
            if(head == null){
                System.out.println("Linkedlist is empty.");
                return;
            }
            Node temp = head;
            while(temp != null){
                System.out.print(temp.data + "->");
                temp = temp.next;
            }
            System.out.println("null");
        }

        public void add(int index, int data){
            if(index == 0){
                addFirst(data);
                return;
            }

            Node newNode = new Node(data);
            size++;
            Node temp = head;
            int i = 0;
            while(i< index - 1){
                temp = temp.next;
                i++;
            }

            newNode.next = temp.next;
            temp.next = newNode;

        }

        public int removeFirst(){
            if(head == null){
                System.out.println("UnderFlow");
                return -1;
            }
            if(head.next == null ){
                int val = head.data;
                head = tail = null;
                size--;
                return val;
            }
            int val = head.data;
            head = head.next;
            size--;

            return val;
        }

        public int removeLast(){
            if(head == null){
                System.out.println("UnderFlow");
                return -1;
            }
            if(head.next == null ){
                int val = head.data;
                head = tail = null;
                size--;
                return val;
            }

            Node temp = head;
            for(int i = 0; i<size - 2; i++){
                temp = temp.next;
            }
            int val = temp.next.data;
            temp.next = null;
            tail = temp;
            size--;
            return val;
        }

        public int SearchIterative(int val){
            int i = 0;
            Node temp = head;
            while(temp != null){
                if(temp.data == val){
                    return i;
                }
                i++;
                temp = temp.next;
            }

            return -1;
        }

        public void reverse(){
            Node prev = null;
            Node curr = tail = head;
            Node next;
            while (curr != null) {
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }

            head = prev;

        }

        public void deleteNthFromEnd(int n){
            int p = size - (n+1);
            Node temp = head;

            if(n == p){
                head = head.next;
                return;
            }

            for(int i = 0; i<p;i++){
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }

        public Node findmid(Node head){
            Node slow = head;
            Node fast = head;

            while(fast!= null && fast.next != null){
                slow = slow.next;
                fast = fast.next.next;
            }

            return slow;
        }

        public boolean isPalindrome(){

            if(head == null || head.next == null){
                return true;
            }
            // find mid
            Node mid = findmid(head);

            // reverse second half
            Node prev = null;
            Node curr = mid;
            Node next;
            while(curr != null){
                next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }

            Node left = head;
            Node right = prev;
            

            // check first and second half
            while(right != null){
                if(left.data != right.data){
                    return false;
                }
                left = left.next;
                right = right.next;
            }
            return true;
        }
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(2);
        ll.addLast(1);
        ll.print();

        System.out.println(ll.isPalindrome());
        

    }
}
