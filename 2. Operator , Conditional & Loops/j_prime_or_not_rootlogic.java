import java.util.Scanner;
public class j_prime_or_not_rootlogic {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        int c = 1;
        for(int i=1; i<=Math.sqrt(num); i++){
            if(num%i==0){
                c++;
            }
        }
        if(c==2){
            System.out.println("Prime Number.");
        }else{
            System.out.println("Not a 3Prime Number.");
        }

        sc.close();
        
    }
}