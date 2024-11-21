public class g_first_occurence {
    public static int FirstOccurence(int[] arr, int i, int key){
        if(i == arr.length - 1){
            return -1;
        }

        if(arr[i] == key){
            return i;
        }

        return FirstOccurence(arr, i+1, key);
    }

    public static void main(String[] args) {
        int[] arr = { 1,2,3,4,6,3,6,7};
        System.out.println(FirstOccurence(arr, 0, 2));
    }
}
