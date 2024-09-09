// Write a Java method to compute the sum of the digits in an integer.

public class n_Sum_of_digit {
    public static int SumOfDigit(int num){
        int Sum = 0;
        while(num!=0){
            int rem = num%10;
            Sum = Sum + rem;
            num = (int)num  / 10;
        }

        return Sum;
    }

    public static void main(String[] args) {
        System.out.println(SumOfDigit(12345));
    }
}
