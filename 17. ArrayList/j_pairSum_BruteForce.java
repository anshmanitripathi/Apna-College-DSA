import java.util.ArrayList;

public class j_pairSum_BruteForce {

    public static boolean pairSum(ArrayList<Integer> list , int target){
        for(int i = 0; i<list.size(); i++){
            for(int j = i+1; j<list.size(); j++){
                if(list.get(i) + list.get(j) == target){
                    return true;
                }
            }
        }

        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);

        int taget = 18;
        System.out.println(pairSum(list, taget));
    }
}
