import java.util.*;

public class a_matrix_print{
    public static void main(String[] args) {
        int[][] matrix = new int[3][3];

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the matrix elements : ");
        for(int i=0; i<matrix.length; i++){
            for(int j =0; j<matrix[0].length; j++){
                matrix[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<matrix.length; i++){
            for(int j =0; j<matrix[0].length; j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
}
