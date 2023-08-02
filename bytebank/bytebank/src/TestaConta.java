public class TestaConta{
    public static void main (String[] args) {
        Conta firstAccount = new Conta();
        System.out.println(firstAccount.agency);
        firstAccount.agency = 623;
        System.out.println(firstAccount.agency); // Replace Default Value
    }

}