package udemyjava.javacompleto.intermediario.parte2.secao13.test;

import udemyjava.javacompleto.intermediario.parte2.secao13.entities.LegalEntity;
import udemyjava.javacompleto.intermediario.parte2.secao13.entities.NaturalPerson;
import udemyjava.javacompleto.intermediario.parte2.secao13.entities.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ProgramTest06 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        List<Person> people = new ArrayList<>();

        readTaxPayers(input, people);
        report(people);

        input.close();

    }

    public static void readTaxPayers(Scanner input, List<Person> people) {

        System.out.print("Enter the number of tax payers: ");
        int qtyTaxPayers = input.nextInt();
        for (int i = 1; i <= qtyTaxPayers; i++) {
            System.out.println();
            System.out.println("Tax payer #" + i + " data:");
            System.out.print("Individual or company (i/c)? ");
            char type = input.next().charAt(0);
            System.out.print("Name: ");
            input.nextLine();
            String name = input.nextLine();
            System.out.print("Anual income: ");
            double anualIncome = input.nextDouble();
            if (type == 'i') {
                System.out.print("Health expenditures: ");
                double healthExpenditures = input.nextDouble();
                people.add(new NaturalPerson(name, anualIncome, healthExpenditures));
            } else if (type == 'c') {
                System.out.print("Number of employess: ");
                int employees = input.nextInt();
                people.add(new LegalEntity(name, anualIncome, employees));
            } else {
                System.out.print("Valor inválido!");
            }
        }

    }

    public static void report(List<Person> people) {
        System.out.println();
        System.out.println("ANUAL INCOME WITH TAXES AND TAXES PAID:");
        double totalTaxes = 0;
        for (Person person : people) {
            System.out.println(person);
            totalTaxes += person.getTax();
        }
        System.out.printf("%nTOTAL TAXES: %.2f", totalTaxes);


    }

}
