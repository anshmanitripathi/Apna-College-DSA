public class h_prime_in_range {
    public static boolean isPrime(int num){

        if(num==2){
            return true;
        }

        for(int i=2;i<=Math.sqrt(num); i++){
            if(num%i==0){
                return false;
            }
        }

        return true;
    }

    public static void primeInRange(int a, int b){
        for(int i =a; i<=b; i++){
            if(i==1){
                continue;
            }
            if(isPrime(i) == true){
                System.out.print(i + " ,");
            }
        }
    }

    public static void main(String[] args) {
        primeInRange(1, 15);
    }
}
