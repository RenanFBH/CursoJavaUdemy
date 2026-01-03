package udemyjava.javacompleto.intermediario.parte2.secao13.entities;

public class NaturalPerson extends Person {

    private double healthExpenditures;

    public NaturalPerson() {
    }

    public NaturalPerson(String name, double annualIncome, double healthExpenditures) {
        super(name, annualIncome);
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public void calculateTaxes() {
        if (getAnnualIncome() < 20000) {
           setTax(getAnnualIncome() * 0.15);
        } else {
            double deductedAmount = 0;
            if (healthExpenditures > 0) {
                deductedAmount = healthExpenditures * 0.5;
            }
            setTax((getAnnualIncome() * 0.25) - deductedAmount);
        }
    }

    public double getHealthExpenditures() {
        return healthExpenditures;
    }

    public void setHealthExpenditures(double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

}
