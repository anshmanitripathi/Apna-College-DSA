import java.util.ArrayList;

public class a_arraylist_implementation_stack {
    public static class Stack{
        static ArrayList<Integer> list = new ArrayList<>();

        // isEmpty function
        public static boolean isEmpty(){
            return list.size() == 0;
        }

        // push operation
        public static void push(int data){
            list.add(data);
        }

        // pop operation 
        public static int pop(){
            if(isEmpty()){
                return -1;
            }
            int top = list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }

        // peek operation
        public static int peek(){
            if(isEmpty()){
                return -1;
            }
            return list.get(list.size()-1);
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
