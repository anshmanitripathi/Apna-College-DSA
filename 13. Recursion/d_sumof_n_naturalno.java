public class d_sumof_n_naturalno {
    public static int sum(int n){
        if(n == 1){
            return 1;
        }

        int s = n + sum(n-1);
        return s;
    }

    public static void main(String[] args) {
        System.out.println(sum(5));
    }
}
