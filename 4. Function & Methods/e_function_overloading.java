

public class e_function_overloading {

    public static int Sum(int a, int b) {
        return a+b;
    }

    public static int Sum(int a, int b, int c) {
        return a+b+c;
    }
    public static float Sum(float a, float b) {
        return a+b;
    }
    public static float Sum(float a, float b, float c) {
        return a+b+c;
    }
    public static void main(String[] args) {

        System.out.println(Sum(1,2));
        System.out.println(Sum(1,2,3));
        System.out.println(Sum(1.2f,2.5f));
        System.out.println(Sum(19.5f,22.6f, 66.4f));
        
    }
}
