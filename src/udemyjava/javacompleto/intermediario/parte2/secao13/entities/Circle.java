package udemyjava.javacompleto.intermediario.parte2.secao13.entities;

import udemyjava.javacompleto.intermediario.parte2.secao13.entities.enums.Color;

public class Circle extends Shape {

    private double radius;

    public Circle() {
    }

    public Circle(Color color, double radius) {
        super(color);
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

}
