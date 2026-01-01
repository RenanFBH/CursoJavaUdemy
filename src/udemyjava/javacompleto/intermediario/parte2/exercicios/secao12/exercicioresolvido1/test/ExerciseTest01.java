package udemyjava.javacompleto.intermediario.parte2.exercicios.secao12.exercicioresolvido1.test;

import udemyjava.javacompleto.intermediario.parte2.exercicios.secao12.exercicioresolvido1.entities.Department;
import udemyjava.javacompleto.intermediario.parte2.exercicios.secao12.exercicioresolvido1.entities.HourContract;
import udemyjava.javacompleto.intermediario.parte2.exercicios.secao12.exercicioresolvido1.entities.Worker;
import udemyjava.javacompleto.intermediario.parte2.exercicios.secao12.exercicioresolvido1.entities.enums.WorkerLevel;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class ExerciseTest01 {

    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Department department = new Department();
        Worker worker = new Worker();
        HourContract hourContract = new HourContract();
        Departament(department);
        Worker(worker, department);
        Contracts(hourContract, worker);
        Result(department, worker, hourContract);

    }

    public static void Departament(Department department) {

        System.out.print("Enter department's name: ");
        String departmentName = input.nextLine();
        department.setName(departmentName);

    }

    public static void Worker(Worker worker, Department department) {

        System.out.print("\nEnter worker data:");
        System.out.print("\nName: ");
        String name = input.nextLine();
        System.out.print("Level: ");
        String level = input.nextLine();
        System.out.print("Base salary: ");
        Double baseSalary = input.nextDouble();
        WorkerLevel workerLevel = WorkerLevel.valueOf(level);
        worker.setName(name);
        worker.setLevel(workerLevel);
        worker.setBaseSalary(baseSalary);
        worker.setDepartment(department);

    }

    public static void Contracts(HourContract hourContract, Worker worker) {

        System.out.print("\nHow many contracts to this worker? ");
        int qtyContracts = input.nextInt();
        for (int i = 1; i <= qtyContracts; i++) {
            System.out.print("\nEnter contract #" + i + " data:");
            System.out.print("\nDate (DD/MM/YYYY): ");
            input.nextLine();
            String date = input.nextLine();
            LocalDate localDate = LocalDate.parse(date, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            System.out.print("Value per hour: ");
            double valuePerHour = input.nextDouble();
            System.out.print("Duration (hours): ");
            int duration = input.nextInt();
            hourContract = new HourContract(localDate, valuePerHour, duration);
            worker.addContract(hourContract);

        }

    }

    public static void Result(Department department, Worker worker, HourContract hourContract) {

        System.out.print("\nEnter moth and year to calculate income (MM/YYYY): ");
        input.nextLine();
        String date = input.nextLine();
        int month = Integer.parseInt(date.substring(0, 2));
        int year = Integer.parseInt(date.substring(3, 7));
        System.out.print("Name: " + worker.getName());
        System.out.print("\nDepartment: " + worker.getDepartment().getName());
        System.out.print("Income for " + date  + ": " + String.format( "%.2f", worker.income(year, month)));

    }
}
