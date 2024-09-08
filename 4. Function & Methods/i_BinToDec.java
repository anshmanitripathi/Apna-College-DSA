public class i_BinToDec {
    public static int BinToDec(int binNum){
        int pow = 0;
        int dec = 0;
        while (binNum!=0) {
            int ld = binNum%10;
            dec = dec + ld * (int)Math.pow(2,pow);
            binNum = binNum /10;
            pow++;
        }

        return dec;
    }

    public static void main(String[] args) {
        int dec = BinToDec(101);
        System.out.println(dec);
    }
}
