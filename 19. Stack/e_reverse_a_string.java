import java.util.Stack;

public class e_reverse_a_string {

    public static String reverseString(String str){
        Stack<Character> s = new Stack<>();
        int idx = 0;
        while(idx != str.length()){
            s.push(str.charAt(idx));
            idx++;
        }

        StringBuilder res = new StringBuilder("");

        while(! s.isEmpty()){
            char ch = s.pop();
            res.append(ch);
        }

        return res.toString();
    }
    public static void main(String[] args) {
        String str = "abc";
        System.out.println(reverseString(str));
    }
}
