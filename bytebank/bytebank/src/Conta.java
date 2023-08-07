public class Conta { /* This class has four attributes, properties or fields */
    String owner;
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