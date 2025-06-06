public class h_merge_sort {

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

        public int helper(Node head, int val){
            if(head == null){
                return -1;
            }
            if(head.data == val){
                return 0;
            }
            int idx = helper(head.next, val);
            if(idx == -1){
                return -1;
            }

            return idx +1;
        }

        public int SearchRecursive(int val){
            return helper(head, val);
        }

        private Node getmid(Node head){
            Node slow = head;
            Node fast = head.next;
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }

            return slow;
        }

        public Node mergeSort(Node head){
            if(head == null && head.next ==null){
                return head;
            }

            // find mid

            Node mid = getmid();

            // left and right half ms
            Node righthead = mid.next;
            mid.next = null;

            Node newleft = mergeSort(head);
            Node newright = mergeSort(righthead);


            // merge

            merge(newleft , newright);
        }
    }

    public static void main(String[] args){
        LinkedList ll = new LinkedList();
        ll.addFirst(1);
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(48);

    }
}