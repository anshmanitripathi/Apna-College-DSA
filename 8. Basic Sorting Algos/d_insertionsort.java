public class d_insertionsort {
    public static void insertionsort(int[] arr){

        for(int i = 1; i<arr.length; i++){
            int pre = i-1;
            int curr = arr[i];
            while(pre >=0 && arr[pre] > curr){
                arr[pre+1] = arr[pre];
                pre--;
            }

            arr[pre+1] = curr;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 3,2,5,2,58,9,12};
        insertionsort(arr);
        for(int i =0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
