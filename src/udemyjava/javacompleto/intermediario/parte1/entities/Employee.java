package udemyjava.javacompleto.intermediario.parte1.entities;

public class Employee {

    public String name;
    public double grossSalary;
    public double tax;

    public double netSalary () {
        return grossSalary - tax;
    }

    public void increaseSalary (double percentage) {
        grossSalary += grossSalary * (percentage / 100);
        System.out.printf("%nUpdated data: %s, R$ %.2f", this.name, this.netSalary());
    }

}
