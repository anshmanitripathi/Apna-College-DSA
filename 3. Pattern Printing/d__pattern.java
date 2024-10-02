// A 
// B c
// D E F
// G H I J

public class d__pattern {

    public static void main(String[] args) {
        char ch = 65;
        for(int i=1; i<=4; i++){
            for(int j=1; j<=i; j++){
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
    }
}