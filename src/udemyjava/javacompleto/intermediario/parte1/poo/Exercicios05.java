package udemyjava.javacompleto.intermediario.parte1.poo;

import udemyjava.javacompleto.intermediario.parte1.entities.Employee2;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Exercicios05 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Employee2> list = new ArrayList<>();
        System.out.print("How many employees will be registered? ");
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            System.out.print("\nEmployee #" +  i + ": ");
            System.out.print("\nID: ");
            int id = sc.nextInt();
            for(Employee2 emp : list) {
                while(emp.getId() == id) {
                    System.out.print("\nId already taken. Try again: ");
                    id = sc.nextInt();
                }
            }
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();
            list.add(new Employee2(id, name, salary));
        }
        System.out.print("\nEnter the employee id that will have salary increase: ");
        int id = sc.nextInt();
        System.out.print("\nEnter the percentage: ");
        double percentage = sc.nextDouble();
        for(Employee2 emp : list) {
            if(emp.getId() == id) {
                emp.increaseSalary(percentage);
            }
        }
        System.out.print("\nList of employees: ");
        for(Employee2 emp : list) {
            System.out.print(emp.print());
        }
        sc.close();

    }

}
