import java.lang.reflect.Array;
import java.util.ArrayList;

public class c_Maximum_in_ArrayList {
    public static void main(String[] args) {
        int max= Integer.MIN_VALUE;
        ArrayList<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(9);
        list.add(95);
        list.add(23);
        list.add(12);

        for(int i = 0; i<list.size(); i++){
            // if(list.get(i) > max){
            //     max = list.get(i);
            // }

            max = Math.max(max, list.get(i));
        }

        System.out.println("Largest Element is : " + max);
    }
}
