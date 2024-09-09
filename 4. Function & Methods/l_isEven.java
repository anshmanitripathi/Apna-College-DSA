// Question2:WriteamethodnamedisEventhatacceptsanintargument.
// Themethodshouldreturntrueiftheargumentiseven,orfalseotherwise.
// Alsowriteaprogramtotestyourmethod

public class l_isEven {

    public static boolean isEven(int num){
        if(num%2==0){
            return true;
        }else{
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isEven(5));
    }
}

