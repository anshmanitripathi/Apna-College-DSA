public class a_palindrome {

    public static boolean ispalindrome(String str){

        for(int i =0 ; i<= str.length()/2; i++){
            if(str.charAt(i) != str.charAt(str.length() - 1 - i)){
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        String str = "racecar";
        System.out.println(ispalindrome(str));

    }
}
