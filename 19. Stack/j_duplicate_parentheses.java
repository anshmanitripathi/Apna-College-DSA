import java.util.Stack;

public class j_duplicate_parentheses {

    public static boolean duplicateParentheses(String str){
        Stack<Character> s = new Stack<>();

        for(int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);
            // closing
            if(ch == ')'){
                int count = 0;
                while(s.peek() != '('){
                    count++;
                    s.pop();
                }

                if(count < 1){
                    return true;
                }
            }else{
                s.push(ch);
            }
        }

        return false;
    }
    public static void main(String[] args) {
        String str1 = "((a+b))"; // true
        String str2 = "(a+b)"; // false

        System.out.println(duplicateParentheses(str1));
        System.out.println(duplicateParentheses(str2));
    }
}
