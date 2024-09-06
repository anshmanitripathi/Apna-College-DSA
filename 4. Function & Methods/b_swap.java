
// Java Always calls by value.

public class b_swap {
    public static void Swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;

        
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 7;

        Swap(a, b);

        System.out.println(a);
        System.out.println(b);
    }
}
