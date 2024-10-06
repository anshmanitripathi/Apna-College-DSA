public class b_optimised_bubblesort {
    public static void bubblesort(int[] arr){
        int n = arr.length;
        for(int i=0; i<n-1; i++){
            int swaps =0 ;
            for(int j=0; j<n-1-i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;

                    swaps++;
                }
            }
            if(swaps == 0){
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {3,2,1,4,5};
        bubblesort(arr);
        for(int i =0; i<arr.length; i++ ){
            System.out.print(arr[i] + " ");
        }
    }
}
