public class a_merge_sort {
    public static void mergeSort(int arr[], int si, int ei){
        // Base Case
        if(si >= ei){
            return;
        }
        int mid = si + (ei - si)/2; // or (si + ei)/2;

        mergeSort(arr, si, mid);
        mergeSort(arr, mid+1, ei);
        merge(arr, si , mid ,ei);
    }

    // merge method to merge the sorted array.
    public static void merge(int[] arr, int si, int mid, int ei){
        int[] temp = new int[ei - si +1];

        int i = si;   // index for the 1st left sorted array
        int j = mid + 1;   // index for the right sorted array.
        int k = 0;  // index for the temperory

        while(i <=mid && j <= ei){
            if(arr[i] < arr[j]){
                temp[k] = arr[i];
                i++;
            }else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        // for leftover element of the left sorted array.
        while (i <= mid) {
            temp[k++] = arr[i++];
        }


        // for the leftover elements of the right sorted array.
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        // copy temp to the original array.
        for(k = 0, i = si; k<temp.length; k++, i++){
            arr[i] = temp[k];
        }
    }

    public static void printArr(int arr[]){
        for(int i =0; i<arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 6,3,9,5,2,8,-2};
        mergeSort(arr, 0, arr.length -1 );
        printArr(arr);
    }
}
