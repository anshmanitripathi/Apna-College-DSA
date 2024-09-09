/**
 *              *      *
 *              **    **
 *              ***  ***
 *              ********
 *              ***  ***
 *              **    **
 *              *      *   
 */
public class f_pattern {
    public static void pattern(int n){
        for(int i = 1; i<=n; i++){
            // stars
            for(int j = 1; j<=i; j++){
                System.out.print("* ");
            }

            // spaces
            for(int j = 1; j<=(n-i)*2; j++){
                System.out.print("  ");
            }

            // stars
            for(int j = 1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i = n; i>=1; i--){
            // stars
            for(int j = 1; j<=i; j++){
                System.out.print("* ");
            }

            // spaces
            for(int j = 1; j<=(n-i)*2; j++){
                System.out.print("  ");
            }

            // stars
            for(int j = 1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern(9);
    }
}
