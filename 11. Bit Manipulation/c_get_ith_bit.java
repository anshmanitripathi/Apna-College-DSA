public class c_get_ith_bit {
    public static void ithBit(int n, int i){
        int bitMask = (1<<i);
        if((n & bitMask) == 0){
            System.out.println("ith bit is 0");
        }else{
            System.out.println("ith bit is 1");
        }
    }

    public static void main(String[] args) {
        ithBit(10, 2);
        ithBit(8, 2);
        ithBit(7, 2);
    }
}
