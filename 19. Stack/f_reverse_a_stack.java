import java.util.Stack;

public class f_reverse_a_stack {

    public static void pushAtBottam(Stack<Integer> s,int data){
        if(s.isEmpty()) {
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottam(s, data);
        s.push(top);

    }
    public static void reverseStack(Stack<Integer> s){
        if(s.isEmpty()) {
            return;
        }
        int top = s.pop();
        reverseStack(s);
        pushAtBottam(s,top);

    }

    public static void printStack(Stack<Integer> s){
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        
        reverseStack(s);
        printStack(s);


    }
}
