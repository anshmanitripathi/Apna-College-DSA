import java.util.Scanner;
public class Area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of circle : ");
        int radius = sc.nextInt();
        float Area = 3.14f * radius *radius;
        System.out.println("Area = "+ Area);

        int $ = 24;
        System.out.println($);
        sc.close();
    }
}
