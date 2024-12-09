import java.util.ArrayList;

public class f_MultiDimensionalArrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        list.add(5);
        list.add(7);
        list1.add(2);
        list1.add(4);

        mainList.add(list);
        mainList.add(list1);

        

        // to print multi dimensional Array List
        for(int i =0; i<mainList.size(); i++){
            ArrayList<Integer> arr = mainList.get(i);
            for(int j = 0; j<arr.size(); j++){
                System.out.print(arr.get(j) + " ");
            }
            System.out.println();
        }

    }
}
