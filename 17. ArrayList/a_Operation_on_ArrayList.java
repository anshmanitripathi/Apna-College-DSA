import java.util.ArrayList;

public class a_Operation_on_ArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        // to add an element in ArrayList
        list.add(4);
        list.add(8);
        list.add(0);
        list.add(6);
        list.add(34);
        // to print the ArrayList
        System.out.println(list);

        // to get element from a ArrayList with index
        int element = list.get(3);
        System.out.println(element);

        // to remove an element from index
        list.remove(3);
        System.out.println(list);

        // Set element at index
        list.set(2,7);
        System.out.println(list);

        // Contains Element
        System.out.println(list.contains(8));
        System.out.println(list.contains(1));

        //Add at index
        list.add(1,13);
        System.out.println(list);

        //Size Of ArrayList
        System.out.println(list.size());

        //print the ArrayList
        for(int i = 0; i<list.size(); i++){
            System.out.print(list.get(i) + " ");
        }
    }
}
