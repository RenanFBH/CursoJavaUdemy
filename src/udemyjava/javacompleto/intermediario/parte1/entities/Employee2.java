package udemyjava.javacompleto.intermediario.parte1.entities;

public class Employee2 {

    private int id;
    private String name;
    private double salary;

    public Employee2(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void increaseSalary(double percentage) {
        this.salary += this.salary * percentage / 100;
    }

    public String print() {
        return this.id + ", " + this.name + ", " + String.format("%.2f", this.salary);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

}
