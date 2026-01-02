package udemyjava.javacompleto.intermediario.parte2.exercicios.secao13.test;

import udemyjava.javacompleto.intermediario.parte2.exercicios.secao13.entities.Employee;
import udemyjava.javacompleto.intermediario.parte2.exercicios.secao13.entities.OutSourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Locale;

public class ProgramTest01 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);
        List<Employee> employees = new ArrayList<>();
        employees(input, employees);
        payment(employees);

    }

    public static void employees(Scanner input, List<Employee> employees) {
        System.out.print("Enter the number of employees: ");
        int qtyEmployees = input.nextInt();
        for (int i = 1; i <= qtyEmployees; i++) {
            System.out.print("\nEmployee #" + i + " data:\n");
            System.out.print("Outsourced (y/n)? ");
            char outsourced = input.next().charAt(0);
            System.out.print("Name: ");
            input.nextLine();
            String name = input.nextLine();
            System.out.print("Hours: ");
            int hours = input.nextInt();
            System.out.print("Value per hour: ");
            double valuePerHour = input.nextDouble();
            Employee employee;
            if(outsourced == 'y') {
                System.out.print("Additional charge: ");
                double additionalCharge = input.nextDouble();
                employee = new OutSourcedEmployee(name, hours, valuePerHour, additionalCharge);
            } else {
                employee = new Employee(name, hours, valuePerHour);
            }
            employees.add(employee);
        }
    }

    public static void payment(List<Employee> employees) {
        System.out.print("\nPAYMENTS:\n");
        for(Employee employee : employees) {
            StringBuilder sb = new StringBuilder();
            sb.append(employee.getName());
            sb.append(" - $ ");
            sb.append(employee.payment());
            System.out.println(sb);
        }
    }
}
