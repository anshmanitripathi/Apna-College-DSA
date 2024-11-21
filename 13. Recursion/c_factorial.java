public class c_factorial {
    public static int facto(int n){
        if(n==0){
            return 1;
        }
        int fn = n * facto(n-1);

        return fn;
    }

    public static void main(String[] args) {
        facto(5);
    }
}
