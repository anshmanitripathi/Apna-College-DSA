import java.util.*;
public class a_largest_of_two_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter A : ");
        int a = sc.nextInt();
        System.out.println("Enter B : ");
        int b = sc.nextInt();

        if(a>b){
            System.out.println("A is greater : "+ a);
        }else{
            System.out.println("B is greater :" + b);
        }
    sc.close();    
    }
    
}