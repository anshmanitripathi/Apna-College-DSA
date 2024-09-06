public class g_print_reverse {
    public static void main(String[] args) {
        int num = 171204;
        while(num!=0){
            int x = num%10;
            System.out.print(x);
            num = num /10;
        }
    }
}
