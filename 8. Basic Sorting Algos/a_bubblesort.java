public class a_bubblesort {
    public static void bubblesort(int[] arr){
        int n = arr.length;
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-1-i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 5,4,1,3,2,7,8,10,9,6};
        bubblesort(arr);
        for(int i =0; i<arr.length; i++ ){
            System.out.print(arr[i] + " ");
        }
    }
}