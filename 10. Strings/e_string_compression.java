public class e_string_compression {
    public static String compressString(String str){
        StringBuilder sb  = new StringBuilder();

        for(int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);
            sb.append(ch);
            int c = 1;
            while(i< str.length()-1 && str.charAt(i) == str.charAt(i+1)){
                c++;
                i++;
            }
            if(c > 1){
                sb.append(c);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(compressString("aaabbbcccccdd"));
    }
}
