public class b_oddEven {
    public static void evenOdd(int n){
        int bitmaske = 1;
        if((n & bitmaske) == 1){
            System.out.println("Odd number");
        }else{
            System.out.println("even number");
        }
    }

    public static void main(String[] args) {
        evenOdd(12);
        evenOdd(17);
        evenOdd(5);
        evenOdd(522);
    }
}
