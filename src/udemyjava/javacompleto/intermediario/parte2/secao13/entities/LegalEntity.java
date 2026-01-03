package udemyjava.javacompleto.intermediario.parte2.secao13.entities;

public class LegalEntity extends Person {

    private int employees;

    public LegalEntity() {
    }

    public LegalEntity(String name, double annualIncome, int employees) {
        super(name, annualIncome);
        this.employees = employees;
    }

    @Override
    public void calculateTaxes() {
        if (this.employees > 10) {
            setTax(getAnnualIncome() * 0.14);
        } else {
            setTax(getAnnualIncome() * 0.16);
        }
    }

    public int getEmployees() {
        return employees;
    }

    public void setEmployees(int employees) {
        this.employees = employees;
    }

}
