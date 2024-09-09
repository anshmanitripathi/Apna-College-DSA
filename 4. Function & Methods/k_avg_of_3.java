// Question 1 :Write a Java method to compute the averageof three numbers.


public class k_avg_of_3 {

    public static int Avg(int a, int b, int c){
        return (a+b+c) / 3;
    }

    public static void main(String[] args) {
        System.out.println(Avg(1,5,9));
    }
}