import java.util.*;
public class b_largest_of_three_num {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A : ");
        int a = sc.nextInt();
        System.out.println("Enter B : ");
        int b = sc.nextInt();
        System.out.println("Enter C : ");
        int c = sc.nextInt();

        if(a>b && a>c){
            System.out.println("A : "+ a + " is greater" );
        }else if(b>c){
            System.out.println("B : "+ b + " is greater" );
        }else{
            System.out.println("C : "+ c + " is greater" );
        }

        sc.close();
    }
}