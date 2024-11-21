public class h_last_occurence {
    public static int LastOccurence(int[] arr, int i, int key){
        if(i == arr.length - 1){
            return -1;
        }

        if(arr[i] == key){
            return i;
        }

        return LastOccurence(arr, i+1, key);
    }

    public static void main(String[] args) {
        int[] arr = { 1,2,3,4,6,3,6,7};
        System.out.println(LastOccurence(arr, 0, 2));
    }
}
