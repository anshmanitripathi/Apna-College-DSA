public class f_reverse_an_array {
    public static void reverseArr(int[] arr){
        int n = arr.length - 1;
        for(int i= 0; i<=n/2; i++){
            int temp = arr[i];
            arr[i] = arr[n-i];
            arr[n-i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1,2,3,4,5,6,7,8,9,10,11};
        for(int i=0; i<arr.length ; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
        reverseArr(arr);
        for(int i=0; i<arr.length ; i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
