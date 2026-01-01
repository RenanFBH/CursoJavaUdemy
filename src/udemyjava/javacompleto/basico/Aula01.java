package udemyjava.javacompleto.basico;

import java.util.Locale;
import java.util.Scanner;

public class Aula01 {

    public static void main(String[] args) {

        // formatação de casas decimais
        double x = 1.5;
        System.out.printf("%.2f%n", x);

        System.out.printf("%.4f%n", x);
        /**
         * Marcador de ponto flutuante: %f
         * Marcador de inteiro: %d
         * Marcador de texto: %s
         * Quebra de linha %n
         */
        System.out.printf("U$%.2f%n", x);

        int z = 5;
        int y = 2;
        double n = z / y;
        System.out.println(n);

        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        System.out.println(a);
        char l = sc.next().charAt(0);
        System.out.println(l);

        String name;
        int age;
        float height;
        char sex;
        name = sc.next();
        age = sc.nextInt();
        height = sc.nextFloat();
        sex = sc.next().charAt(0);
        Locale.setDefault(Locale.GERMAN);
        System.out.printf("%s, %d anos, gênero %s, altura %.2f", name, age, sex, height);

        String phrase;
        phrase = sc.nextLine();
        System.out.println(phrase);

        sc.close();

    }

}