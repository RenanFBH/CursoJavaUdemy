package udemyjava.javacompleto.intermediario.parte2.secao13.entities;

public class BusinessAccount extends Account {

    private double loanLimit;

    public BusinessAccount() {
    }

    public BusinessAccount(int number, String holder, double balance, double loanLimit) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }

    @Override
    public void withdraw(double amount) {
        super.withdraw(amount);
        balance -= 2;
    }

    public void loan(double amount) {
        if(amount <= this.loanLimit) {
            balance += amount - 10;
        }
    }

    public double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(double loanLimit) {
        this.loanLimit = loanLimit;
    }

}
