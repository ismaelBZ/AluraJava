public class Conta { /* This class has four attributes, properties or fields */
    Client owner;
    /* Client owner = new Client();     This allows the same client to have more than one account here, 
                                        making the solution unviable, 
                                        but for other types of relationship, very viable */
    int agency = 17; // Default value
    int number;
    double balance;

    public void deposit(double value) {
        this.balance += value;
    }

    public boolean withdrawn(double value) {
        if (value <= this.balance) {
            this.balance -= value;
            return true;
        } else {
            return false;
        }
    }
}