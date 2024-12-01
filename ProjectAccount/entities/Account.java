package entities;

public class Account {

    private int numberAcc;
    private String holder;
    private double balance;

    public Account(int numberAcc, String holder) {
        this.numberAcc = numberAcc;
        this.holder = holder;
    }

    public Account(int numberAcc, String holder, double initialDeposit) {
        this.numberAcc = numberAcc;
        this.holder = holder;
        deposit(initialDeposit);
    }
    public int getNumberAcc() {
        return numberAcc;
    }
    public String getHolder() {
        return holder;
    }
    public void setHolder(String holder) {
        this.holder = holder;
    }
    public double getBalance() {
        return balance;
    }
    public void deposit(double amount) {
        balance += amount;
    }
    public void withdraw(double amount) {
        balance -= amount + 5.0;
    }
    public String toString() {
        return "Account: "
                + numberAcc
                + ", Holder: "
                + holder
                + ", Balance: $ "
                + String.format("%.2f", balance);
    }
}
