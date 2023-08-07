public class TestaConta{
    public static void main (String[] args) {
        
        // Replace default attribute value
        Conta firstAccount = new Conta();
        System.out.println(firstAccount.agency);
        firstAccount.agency = 623;
        System.out.println(firstAccount.agency); 

        // Understanding object referencing through variables
        Conta secondAccount = firstAccount;
        System.out.println(firstAccount);  // Is the same reference, so is the same object
        System.out.println(secondAccount); // Is the same reference, so is the same object
        

        // Testing methods
        firstAccount.deposit(100);
        boolean wasDeposited = firstAccount.withdrawn(50);
        System.out.println(wasDeposited);
        System.out.println(firstAccount.balance); 
    }

}