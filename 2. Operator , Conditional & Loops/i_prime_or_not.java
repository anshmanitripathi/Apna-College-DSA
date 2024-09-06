public class i_prime_or_not {
    public static void main(String[] args) {
        int num = 3;
        int c = 0;
        for(int i =1; i<=num; i++){
            if(num%i==0){
                c++;
            }
        }

        if(c==2){
            System.out.println("Prime number");
        }else{
            System.out.println("Not a Prime number");
        }
    }
}
