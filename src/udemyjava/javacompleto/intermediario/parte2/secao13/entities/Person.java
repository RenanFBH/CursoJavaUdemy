package udemyjava.javacompleto.intermediario.parte2.secao13.entities;

public abstract class Person {

    private String name;
    private double annualIncome;
    private double tax;

    public Person() {
    }

    public Person(String name, double annualIncome) {
        this.name = name;
        this.annualIncome = annualIncome;
    }

    public abstract void calculateTaxes();

    public double annualIncomeWithTaxes() {
        calculateTaxes();
        return this.annualIncome - this.tax;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.name);
        stringBuilder.append(": $ ");
        stringBuilder.append(String.format("%.2f", annualIncomeWithTaxes()));
        stringBuilder.append(" - $ ");
        stringBuilder.append(String.format("%.2f", getTax()));
        return stringBuilder.toString();
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAnnualIncome() {
        return annualIncome;
    }

    public void setAnnualIncome(double annualIncome) {
        this.annualIncome = annualIncome;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

}
