import java.util.*;
public class d_binomial_coffecient {
    public static int factorial(int num){
        int fact =1;
        for(int i =1; i<=num; i++){
            fact = fact * i;
        }
        return fact;
    }
    
    public static int binomial_coffecient(int n, int r){
        int bnc = factorial(n) / (factorial(r) * (factorial( n - r)));
        return bnc;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n = sc.nextInt();
        System.out.print("Enter the value of r : ");
        int r = sc.nextInt();

        int bnc = binomial_coffecient(n, r);
        System.out.println("Binomial coffecient : "+ bnc);

        sc.close();
    }
}
