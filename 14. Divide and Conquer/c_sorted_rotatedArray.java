public class c_sorted_rotatedArray {

    public static int SearchRoatatedSorted(int[] arr, int tar, int si, int ei){
        if(si > ei){
            return -1;
        }

        int mid = si + (ei -si)/2;

        if(arr[mid] == tar ){
            return mid;
        }

        // mid on line 1
        if(arr[si]<= arr[mid]){
            // case a: left
            if(arr[si] <= tar && tar <=arr[mid]){
                return SearchRoatatedSorted(arr, tar, si, mid -1);
            }else{
                // case b: right
                return SearchRoatatedSorted(arr, tar, mid+1, ei);
            }
        }else{
            // case c: right
            if(arr[mid] <= tar && tar <=arr[ei]){
                return SearchRoatatedSorted(arr, tar, mid+1, ei);
            }else{
                // case b: right
                return SearchRoatatedSorted(arr, tar, si, mid-1);
            }

        }
    }
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2};
        int tar = 0;
        int ans = SearchRoatatedSorted(arr,tar, 0, arr.length-1);
        System.out.println(ans);
    }
}
