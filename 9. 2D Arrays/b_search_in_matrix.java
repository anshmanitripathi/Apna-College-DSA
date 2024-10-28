import java.util.*;
public class b_search_in_matrix {

    public static boolean search_in_matrix(int matrix[][], int key){
        for(int i=0; i<matrix.length; i++){
            for(int j =0; j<matrix[0].length; j++){
                if(matrix[i][j] == key){
                    System.out.println("found at cell ("+ i + ", " +j +")");
                    return true;
                }
            }
        }

        System.out.println("not found");
        return false;
    }
    

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
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Enter the element to be searched : ");
        int key = sc.nextInt();
        search_in_matrix(matrix, key);

        sc.close();
    }
}
