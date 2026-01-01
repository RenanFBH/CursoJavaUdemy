package udemyjava.javacompleto.intermediario.parte1.poo;

import java.util.Scanner;

import udemyjava.javacompleto.intermediario.parte1.entities.Employee;
import udemyjava.javacompleto.intermediario.parte1.entities.Retangulo;
import udemyjava.javacompleto.intermediario.parte1.entities.Student;

public class Exercicios01 {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        exercicio3();
    }

    public static void exercicio1 () {

        Retangulo r = new Retangulo();
        System.out.print("Digite a altura e a base do retângulo: ");
        r.height = sc.nextDouble();
        r.width = sc.nextDouble();
        String report = "\nArea: " + r.area() + "\nPerímetro: " + r.perimeter() + "\nDiagonal: " + r.diagonal();
        System.out.println(report);

    }

    public static void exercicio2 () {

        Employee e = new Employee();
        System.out.print("Name: ");
        e.name = sc.next();
        System.out.print("Gross salary: ");
        e.grossSalary = sc.nextDouble();
        System.out.print("Tax: ");
        e.tax = sc.nextDouble();
        System.out.printf("%nEmployee: %s, R$ %.2f", e.name, e.netSalary());
        System.out.print("\n\nWhich percentage to increase salary? ");
        e.increaseSalary(sc.nextDouble());

    }

    public static void exercicio3 () {

        System.out.print("Digite o nome e as 3 notas do aluno: ");
        Student s = new Student();
        s.name = sc.next();
        for (int i = 0; i < 3; i++) {
            s.score[i] = sc.nextDouble();
        }
        s.finalScore();

    }

}
