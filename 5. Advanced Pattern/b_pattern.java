/**
 *                  *
 *                * *
 *              * * * 
 *            * * * *   
 */

public class b_pattern {

    public static void pattern(int r, int n){

        for(int i = 1; i<=r; i++){
            int spc = r;
            for(int j=1;j<=n;j++){
                if(spc > i) {
                    System.out.print("  ");
                    spc = spc - 1;
                }else{
                    System.out.print("* ");
                }
                
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        pattern(8, 8);


        // Also the same pattern

        for(int i =1; i<=8; i++){
            // spaces
            for(int j = 1; j<=8-i; j++){
                System.out.print("  ");
            }
            // stars

            for(int j = 1; j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
