package udemyjava.javacompleto.intermediario.parte2.exercicios.secao13.entities;

public class OutSourcedEmployee extends Employee {

    protected double additionalCharge;

    public OutSourcedEmployee() {
    }

    public OutSourcedEmployee(String name, int hours, double valuePerHour, double additionalCharge) {
        super(name, hours, valuePerHour);
        this.additionalCharge = additionalCharge;
    }

    @Override
    public double payment() {
        return super.payment() + additionalCharge * 1.1;
    }
}
