package udemyjava.javacompleto.intermediario.parte2.secao13.entities;

public class Account {

    protected int number;
    protected String holder;
    protected double balance;

    public Account() {
    }

    public Account(int number, String holder, double balance) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
    }

    public void withdraw(double amount) {
        this.balance -= amount + 5;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public int getNumber() {
        return this.number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getHolder() {
        return this.holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public double getBalance() {
        return this.balance;
    }

}
