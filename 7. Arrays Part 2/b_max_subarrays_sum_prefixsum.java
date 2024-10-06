public class b_max_subarrays_sum_prefixsum {

    public static int max_subarrays_sum(int[] arr){
        int[] prefix = new int[arr.length];
        int max = Integer.MIN_VALUE;
        prefix[0] = arr[0];
        for(int i =1; i<arr.length; i++){
            prefix[i] = prefix[i-1] + arr[i];
        }
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                int sum = (i==0) ? prefix[j] : prefix[j] - prefix[i-1];
                if(sum > max){
                    max = sum;
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 6, 1, 3};
        System.out.println(max_subarrays_sum(arr));
    }
}