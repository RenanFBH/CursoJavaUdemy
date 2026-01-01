package udemyjava.javacompleto.intermediario.parte1.entities;

public class Account {

    private int idAccount;
    private String userName;
    private double balance;

    public Account(int idAccount, String userName, double balance) {
        this.idAccount = idAccount;
        this.userName = userName;
        this.balance = balance;
    }

    public Account(int idAccount, String userName) {
        this.idAccount = idAccount;
        this.userName = userName;
    }

    public int getIdAccount() {
        return idAccount;
    }

    public double getBalance() {
        return balance;
    }

    public String getdata() {
        return "\n\nDados da conta: ID "  + getIdAccount() + ", Holder: " + getUserName() + ", Balance: U$" + getBalance();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public double addBalance(double money) {
        return balance += money;
    }

    public double removeBalance(double money) {
        return balance -= money + 5;
    }

}
