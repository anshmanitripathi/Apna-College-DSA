import java.util.Scanner;

public class d_leap_year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year : ");
        int year = sc.nextInt();
        Boolean ans = (year % 4==0 && year%100==0 || year%400 ==0) ? true : false;
        System.out.println("Answer : " + ans);
    }
}
