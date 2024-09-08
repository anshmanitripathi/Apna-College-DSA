public class j_DecToBin {
    public static int DecToBin(int num){
        int pow = 0;
        int bin = 0;
        while (num!=0) {
            int rem = num % 10;
            bin = bin + rem * (int)Math.pow(10,pow);
            num = num / 10;
            pow++;
        }
        return bin;
    }

    public static void main(String[] args) {
        System.out.println(DecToBin(10));
    }
}
