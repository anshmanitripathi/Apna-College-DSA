public class b_linkedlist_implementation_stack {
    static class Node {
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        } 
    }
    static class Stack {
        static Node head = null;
        public static boolean isEmpty(){
            return head == null;
        }

        // push operation

        public static void push(int data){
            Node newNode = new Node(data);
            if(isEmpty()){
                head = newNode;
            }else{
                newNode.next = head;
                head = newNode;
            }

            
        }

        // pop operation

        public static int pop(){
            if(isEmpty()){
                return -1;
            }

            int top = head.data;

            head = head.next;
            return top;
        }

        // peek operation

        public static int peek(){
            if(isEmpty()){
                return -1;
            }

            return head.data;
        }
        
    }

    public static void main(String[] args) {
        Stack stk = new Stack();
        stk.push(1);
        stk.push(2);
        stk.push(3);
        stk.push(4);

        while(! stk.isEmpty()){
            System.out.println(stk.peek());
            stk.pop();
        }
    }
}
