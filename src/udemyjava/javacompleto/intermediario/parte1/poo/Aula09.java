package udemyjava.javacompleto.intermediario.parte1.poo;

import java.util.Scanner;
import udemyjava.javacompleto.intermediario.parte1.util.Calculator;

public class Aula09 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();
        double c = Calculator.circumference(radius);
        double v = Calculator.volume(radius);
        System.out.printf("Circumference %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("PI: %f%n", Calculator.PI);

    }

}