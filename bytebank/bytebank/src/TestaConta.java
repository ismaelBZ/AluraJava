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
        
    }

}