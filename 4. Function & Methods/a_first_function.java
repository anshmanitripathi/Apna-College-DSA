import java.util.*;

public class a_first_function {

    public static int calSum(int a, int b){
        int sum = a+b;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first Number : ");
        int a = sc.nextInt();
        System.out.print("Enter first Number : ");
        int b = sc.nextInt();
        int sum = calSum(a, b);

        System.out.println("Sum = "+ sum);

        sc.close();
    }

    
}
