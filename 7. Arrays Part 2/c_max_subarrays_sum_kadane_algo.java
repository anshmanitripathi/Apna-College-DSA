public class c_max_subarrays_sum_kadane_algo {
    public static int kadane(int[] arr){
        int max = Integer.MIN_VALUE;
        int current_sum =0;
        for(int i = 0; i<arr.length; i++){
            current_sum = current_sum + arr[i];
            if(current_sum < 0){
                current_sum = 0;
            }
            max = Math.max(current_sum, max);
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {-2,-3,4,-1,-2,1,5,-3};
        System.out.println(kadane(arr));
    }
}
