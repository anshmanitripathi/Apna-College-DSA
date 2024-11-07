public class f_update_ith_bit {
    public static int clearIthBit(int n, int i){
        int bitMask = ~(1<<i);
        return (n & bitMask);
    }

    public static int setIthBit(int n, int i){
        int bitMask = (1<<i);
        return (n | bitMask);
    }

    public static int updateIthBit(int n, int i, int value){
        // if(value == 0){
        //     clearIthBit(n, i)
        // }else{
        //     setIthBit(n, i)
        // }

        clearIthBit(n, i);
        return (n | (value << i));
    }

    public static void main(String[] args) {
        System.out.println(updateIthBit(10, 2, 1));
    }
}
