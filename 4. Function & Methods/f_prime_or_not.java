public class f_prime_or_not {
    public static boolean isPrime(int num){

        if(num==2){
            return true;
        }

        for(int i=2;i<=num-1; i++){
            if(num%i==0){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(4));
    }
}
