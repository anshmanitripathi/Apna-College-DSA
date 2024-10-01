import java.util.*;
public class c_liner_search {
    public static int linearSearch(int key,int arr[]){
        for(int i=0; i<arr.length; i++){
            if(key == arr[i]){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 3, 7, 8, 19, 35, 26, 90};
        System.out.print("Enter the key you have to find : ");
        int key = sc.nextInt();
        int result = linearSearch(key, arr);
        if(result == -1){
            System.out.println("Not Found.");
        }else{
            System.out.println(arr[result] + " is found at index " + result);
        }
    }
}
