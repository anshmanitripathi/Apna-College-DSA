public class d_largest_in_array {
    public static int largestElement(int arr[]){
        int largest = -1;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int[] arr = {34, 78, 12, 46, 89, 16};
        System.out.println(largestElement(arr));
    }
}
