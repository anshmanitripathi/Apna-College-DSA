public class i_x_power_n {
    public static int power(int x, int n){
        if(n==0){
            return 1;
        }

        return x * power(x, n-1);
    }

    public static void main(String[] args) {
        System.out.println(power(2, 5));
    }
}
