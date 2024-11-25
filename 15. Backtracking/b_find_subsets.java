public class b_find_subsets {
    public static void findSubsets(String str, int i, String ans){
        // Base Case
        if(i == str.length()){
            System.out.println(ans);
            return;
        }
        
        // Recursion
        // choice is yes
        findSubsets(str, i+1, ans+str.charAt(i));
        // choice is No
        findSubsets(str, i+1, ans);
    }

    public static void main(String[] args) {
        String str = "abc";
        findSubsets(str, 0, "");
    }
}