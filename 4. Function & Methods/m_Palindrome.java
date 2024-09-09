// Question3:WriteaJavaprogramtocheckifanumberisapalindromeinJava?(121isapalindrome, 321 is not)
// Anumberiscalledapalindromeifthenumberisequaltothereverseofanumber
// e.g.,121isapalindromebecausethereverseof121is121itself.
// Ontheotherhand,321isnotapalindrome because the reverse of 321 is 123, which is not equal to 321


public class m_Palindrome {

    public static boolean isPalindrome(int num){
        int initial = num;
        int rev = 0;
        while(num!=0){
            int rem = num %10;
            rev = (rev * 10) + rem;
            num = (int)(num / 10);
        }
        if(rev == initial){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(1213));
    }
}