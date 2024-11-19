public class b_access_modifiers {
    public static void main(String[] args) {
        BankAccount myAcc = new BankAccount();
        myAcc.username = "Ansh";
        // myAcc.password = 1234;

        myAcc.setPassword(5678);

        System.out.println(myAcc.username);

        myAcc.printPassword();
        
    }
}


class BankAccount{
    public String username;
    private int password;

    void setPassword(int newPassword){
        password = newPassword;
    }

    void printPassword(){
        System.out.println(password);
    }
    
}