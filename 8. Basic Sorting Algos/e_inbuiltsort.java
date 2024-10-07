import java.util.*;
import java.util.Collections;
public class e_inbuiltsort {
    public static void main(String[] args) {
        Integer[] arr = {1,5,7,8,3,4,2,31,34,66};    // as Collection's reverse order function works on objects only.

        Arrays.sort(arr);
        for(int i =0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        Arrays.sort(arr, 0, 5);
        for(int i =0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        Arrays.sort(arr, Collections.reverseOrder());
        for(int i =0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        Arrays.sort(arr, 0, 5 , Collections.reverseOrder());
        for(int i =0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }


    }
}
