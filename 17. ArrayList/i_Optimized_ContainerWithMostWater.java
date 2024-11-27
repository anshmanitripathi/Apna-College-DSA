import java.util.ArrayList;

public class i_Optimized_ContainerWithMostWater {

    public static int MostWater(ArrayList<Integer> list){
        int lp = 0;
        int rp = list.size() - 1;

        int max = 0;
        while (lp<rp) {
            int ht = Math.min(list.get(rp), list.get(lp));
            int wd = rp - lp;
            int water = ht * wd;
            max = Math.max(max, water);
            if(list.get(lp) < list.get(rp)){
                lp++;
            }else{
                rp--;
            }
        }

        return max;

    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);

        System.out.println(MostWater(list));
    }
}
