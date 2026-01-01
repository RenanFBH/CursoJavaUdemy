package udemyjava.javacompleto.intermediario.parte1.entities;

public class People {

    private String name;
    private int age;
    private double height;

    public People(String name, int idade, double height) {
        this.name = name;
        this.age = idade;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

}
