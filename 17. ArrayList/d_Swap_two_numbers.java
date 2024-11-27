import java.util.ArrayList;

public class d_Swap_two_numbers {

    public static void Swap(ArrayList<Integer> list, int idx1, int idx2){
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);

    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(9);
        list.add(95);
        list.add(23);
        list.add(12);

        System.out.println(list);
        Swap(list, 1, 3);
        System.out.println(list);
    }
}
