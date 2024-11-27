import java.util.ArrayList;

public class b_Reverse_Of_ArrayList {
    public static void main(String[] args) {
        // REverse print
        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(9);
        list.add(95);
        list.add(23);
        list.add(12);

        for(int i = list.size()-1; i>=0; i--){
            System.out.print(list.get(i) + " ");
        }
    }
}
