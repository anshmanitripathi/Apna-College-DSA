import java.util.Stack;

public class h_next_greater {
    

    public static void main(String[] args) {
        int[] arr = {10,2,4,1,6,5};
        Stack<Integer> s = new Stack<>();
        int[] nextGreater = new int[arr.length];

        for(int i = arr.length -1 ; i>=0; i--){
            // 1. While loop

            while(!s.isEmpty() && arr[s.peek()] <= arr[i]){
                s.pop();
            }

            // if else
            if(s.isEmpty()){
                nextGreater[i] = -1;
            }else{
                nextGreater[i] = arr[s.peek()];
            }

            // push

            s.push(i);
        }

        for(int i =0; i<nextGreater.length; i++){
            System.out.println(nextGreater[i]);
        }
    }
}
