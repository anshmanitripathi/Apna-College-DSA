import java.util.Scanner;
public class javabasics{
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("* * * *");
        System.out.println("* * * ");
        System.out.println("* * ");
        System.out.println("* ");

        int a = 10;
        int b= 4;
        int sum = a+b;
        System.out.println("Sum = " + sum);


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String ab = sc.nextLine();
        System.out.println("Enter boolean : ");
        boolean ans = sc.nextBoolean();
        System.out.println("Enter int : ");
        int an = sc.nextInt();
        
        System.out.println(ans);
        System.out.println(ab);
        System.out.println(an);


        sc.close();
    }
}