// BRUTEFORCE APPROACH
//  NOT A OPTIMISED SOLUTION
public class a_max_subarrays_sum_bruteforce {

    public static int max_subarrays_sum(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<arr.length; j++){
                int sum = 0;
                System.out.print("[");
                for(int k=i; k<=j; k++){
                    System.out.print(arr[k]+ ",");
                    sum = sum + arr[k];
                }
                System.out.print("]  = "+sum + "\n");
                if(sum > max){
                    max = sum;
                }
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {1, -2, 6, -1, 3};
        System.out.println("maximum sum = " + max_subarrays_sum(arr));
    }
}