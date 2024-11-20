public class e_nth_fibo_no {
    public static int nthFibo(int n){
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        }

        return nthFibo(n-1) + nthFibo(n-2);
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(nthFibo(n));
    }
}
