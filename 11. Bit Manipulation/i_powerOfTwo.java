// power of two or not
public class i_powerOfTwo {
    public static void powerOfTwoOrNot(int n){
        if((n & n-1) == 0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }

    public static void main(String[] args) {
        powerOfTwoOrNot(10);
        powerOfTwoOrNot(8);
        powerOfTwoOrNot(16);
    }
}
